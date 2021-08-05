package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data controlled by this exception
  */
trait ConsentExceptData
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'meaning'.
    */
  var _meaning: js.UndefOr[Element] = js.undefined
  
  /**
    * instance | related | dependents | authoredby
    */
  var meaning: code
  
  /**
    * The actual data reference
    */
  var reference: Reference
}
object ConsentExceptData {
  
  inline def apply(meaning: code, reference: Reference): ConsentExceptData = {
    val __obj = js.Dynamic.literal(meaning = meaning.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExceptData]
  }
  
  extension [Self <: ConsentExceptData](x: Self) {
    
    inline def setMeaning(value: code): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def set_meaning(value: Element): Self = StObject.set(x, "_meaning", value.asInstanceOf[js.Any])
    
    inline def set_meaningUndefined: Self = StObject.set(x, "_meaning", js.undefined)
  }
}
