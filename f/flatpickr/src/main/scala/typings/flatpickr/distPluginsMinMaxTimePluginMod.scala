package typings.flatpickr

import typings.flatpickr.distTypesGlobalsMod.global.Date
import typings.flatpickr.distTypesOptionsMod.Plugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsMinMaxTimePluginMod {
  
  @JSImport("flatpickr/dist/plugins/minMaxTimePlugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Plugin[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Plugin[js.Object]]
  inline def default(config: Config): Plugin[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Plugin[js.Object]]
  
  trait Config extends StObject {
    
    var getTimeLimits: js.UndefOr[js.Function1[/* date */ Date, MinMaxTime]] = js.undefined
    
    var table: js.UndefOr[Record[String, MinMaxTime]] = js.undefined
    
    var tableDateFormat: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setGetTimeLimits(value: /* date */ Date => MinMaxTime): Self = StObject.set(x, "getTimeLimits", js.Any.fromFunction1(value))
      
      inline def setGetTimeLimitsUndefined: Self = StObject.set(x, "getTimeLimits", js.undefined)
      
      inline def setTable(value: Record[String, MinMaxTime]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableDateFormat(value: String): Self = StObject.set(x, "tableDateFormat", value.asInstanceOf[js.Any])
      
      inline def setTableDateFormatUndefined: Self = StObject.set(x, "tableDateFormat", js.undefined)
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  trait MinMaxTime extends StObject {
    
    var maxTime: js.UndefOr[String] = js.undefined
    
    var minTime: js.UndefOr[String] = js.undefined
  }
  object MinMaxTime {
    
    inline def apply(): MinMaxTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinMaxTime]
    }
    
    extension [Self <: MinMaxTime](x: Self) {
      
      inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var defaults: MinMaxTime
    
    def formatDate(date: Date, f: String): String
    
    var tableDateFormat: String
  }
  object State {
    
    inline def apply(defaults: MinMaxTime, formatDate: (Date, String) => String, tableDateFormat: String): State = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], formatDate = js.Any.fromFunction2(formatDate), tableDateFormat = tableDateFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDefaults(value: MinMaxTime): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setFormatDate(value: (Date, String) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction2(value))
      
      inline def setTableDateFormat(value: String): Self = StObject.set(x, "tableDateFormat", value.asInstanceOf[js.Any])
    }
  }
}
