package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data controlled by this exception
  */
@js.native
trait ConsentExceptData extends BackboneElement {
  
  /**
    * Contains extended information for property 'meaning'.
    */
  var _meaning: js.UndefOr[Element] = js.native
  
  /**
    * instance | related | dependents | authoredby
    */
  var meaning: code = js.native
  
  /**
    * The actual data reference
    */
  var reference: Reference = js.native
}
object ConsentExceptData {
  
  @scala.inline
  def apply(meaning: code, reference: Reference): ConsentExceptData = {
    val __obj = js.Dynamic.literal(meaning = meaning.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExceptData]
  }
  
  @scala.inline
  implicit class ConsentExceptDataMutableBuilder[Self <: ConsentExceptData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeaning(value: code): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_meaning(value: Element): Self = StObject.set(x, "_meaning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_meaningUndefined: Self = StObject.set(x, "_meaning", js.undefined)
  }
}
