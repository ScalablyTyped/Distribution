package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Link to another patient resource that concerns the same actual person
  */
trait PatientLink
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The other patient or related person resource that the link refers to
    */
  var other: Reference
  
  /**
    * replaced-by | replaces | refer | seealso - type of link
    */
  var `type`: code
}
object PatientLink {
  
  inline def apply(other: Reference, `type`: code): PatientLink = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientLink]
  }
  
  extension [Self <: PatientLink](x: Self) {
    
    inline def setOther(value: Reference): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
