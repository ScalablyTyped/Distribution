package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResearchStudyWebLocation
  extends StObject
     with BackboneElement {
  
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the nature of the location being specified.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The location address.
    */
  var url: String
}
object ResearchStudyWebLocation {
  
  inline def apply(url: String): ResearchStudyWebLocation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchStudyWebLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResearchStudyWebLocation] (val x: Self) extends AnyVal {
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
