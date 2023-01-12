package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilitiesTranslation
  extends StObject
     with BackboneElement {
  
  var _needsMap: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the client must identify the map.
    */
  var needsMap: Boolean
}
object TerminologyCapabilitiesTranslation {
  
  inline def apply(needsMap: Boolean): TerminologyCapabilitiesTranslation = {
    val __obj = js.Dynamic.literal(needsMap = needsMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyCapabilitiesTranslation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminologyCapabilitiesTranslation] (val x: Self) extends AnyVal {
    
    inline def setNeedsMap(value: Boolean): Self = StObject.set(x, "needsMap", value.asInstanceOf[js.Any])
    
    inline def set_needsMap(value: Element): Self = StObject.set(x, "_needsMap", value.asInstanceOf[js.Any])
    
    inline def set_needsMapUndefined: Self = StObject.set(x, "_needsMap", js.undefined)
  }
}
