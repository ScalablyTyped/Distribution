package typings.fhir.r3Mod

import typings.fhir.fhirStrings.authoredby
import typings.fhir.fhirStrings.dependents
import typings.fhir.fhirStrings.instance
import typings.fhir.fhirStrings.related
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsentExceptData
  extends StObject
     with BackboneElement {
  
  var _meaning: js.UndefOr[Element] = js.undefined
  
  /**
    * How the resource reference is interpreted when testing consent restrictions.
    */
  var meaning: instance | related | dependents | authoredby
  
  /**
    * A reference to a specific resource that defines which resources are covered by this consent.
    */
  var reference: Reference
}
object ConsentExceptData {
  
  inline def apply(meaning: instance | related | dependents | authoredby, reference: Reference): ConsentExceptData = {
    val __obj = js.Dynamic.literal(meaning = meaning.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExceptData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsentExceptData] (val x: Self) extends AnyVal {
    
    inline def setMeaning(value: instance | related | dependents | authoredby): Self = StObject.set(x, "meaning", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def set_meaning(value: Element): Self = StObject.set(x, "_meaning", value.asInstanceOf[js.Any])
    
    inline def set_meaningUndefined: Self = StObject.set(x, "_meaning", js.undefined)
  }
}
