package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSettingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The id of the user setting.
    */
  var setting: js.UndefOr[String] = js.undefined
}
object ParamsResourceSettingsGet {
  
  inline def apply(): ParamsResourceSettingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSettingsGet]
  }
  
  extension [Self <: ParamsResourceSettingsGet](x: Self) {
    
    inline def setSetting(value: String): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
    
    inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
  }
}
