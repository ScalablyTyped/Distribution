package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawLocaleInfo extends StObject {
  
  var defaultCode: String
  
  var map: LocaleInputMap
}
object RawLocaleInfo {
  
  inline def apply(defaultCode: String, map: LocaleInputMap): RawLocaleInfo = {
    val __obj = js.Dynamic.literal(defaultCode = defaultCode.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawLocaleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawLocaleInfo] (val x: Self) extends AnyVal {
    
    inline def setDefaultCode(value: String): Self = StObject.set(x, "defaultCode", value.asInstanceOf[js.Any])
    
    inline def setMap(value: LocaleInputMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
  }
}
