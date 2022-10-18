package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedIssueMitigation
  extends StObject
     with BackboneElement {
  
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the action that was taken or the observation that was made that reduces/eliminates the risk associated with the identified issue.
    */
  var action: CodeableConcept
  
  /**
    * Identifies the practitioner who determined the mitigation and takes responsibility for the mitigation step occurring.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates when the mitigating action was documented.
    */
  var date: js.UndefOr[String] = js.undefined
}
object DetectedIssueMitigation {
  
  inline def apply(action: CodeableConcept): DetectedIssueMitigation = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectedIssueMitigation]
  }
  
  extension [Self <: DetectedIssueMitigation](x: Self) {
    
    inline def setAction(value: CodeableConcept): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    inline def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
