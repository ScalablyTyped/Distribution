package typings.flatpickr

import typings.flatpickr.globalsMod.global.Date
import typings.flatpickr.optionsMod.Plugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minMaxTimePluginMod {
  
  @JSImport("flatpickr/dist/plugins/minMaxTimePlugin", JSImport.Default)
  @js.native
  def default(): Plugin[js.Object] = js.native
  @JSImport("flatpickr/dist/plugins/minMaxTimePlugin", JSImport.Default)
  @js.native
  def default(config: Config): Plugin[js.Object] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var getTimeLimits: js.UndefOr[js.Function1[/* date */ Date, MinMaxTime]] = js.native
    
    var table: js.UndefOr[Record[String, MinMaxTime]] = js.native
    
    var tableDateFormat: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTimeLimits(value: /* date */ Date => MinMaxTime): Self = StObject.set(x, "getTimeLimits", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTimeLimitsUndefined: Self = StObject.set(x, "getTimeLimits", js.undefined)
      
      @scala.inline
      def setTable(value: Record[String, MinMaxTime]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDateFormat(value: String): Self = StObject.set(x, "tableDateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableDateFormatUndefined: Self = StObject.set(x, "tableDateFormat", js.undefined)
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  @js.native
  trait MinMaxTime extends StObject {
    
    var maxTime: js.UndefOr[String] = js.native
    
    var minTime: js.UndefOr[String] = js.native
  }
  object MinMaxTime {
    
    @scala.inline
    def apply(): MinMaxTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinMaxTime]
    }
    
    @scala.inline
    implicit class MinMaxTimeMutableBuilder[Self <: MinMaxTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
      
      @scala.inline
      def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var defaults: MinMaxTime = js.native
    
    def formatDate(date: Date, f: String): String = js.native
    
    var tableDateFormat: String = js.native
  }
  object State {
    
    @scala.inline
    def apply(defaults: MinMaxTime, formatDate: (Date, String) => String, tableDateFormat: String): State = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], formatDate = js.Any.fromFunction2(formatDate), tableDateFormat = tableDateFormat.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: MinMaxTime): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatDate(value: (Date, String) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTableDateFormat(value: String): Self = StObject.set(x, "tableDateFormat", value.asInstanceOf[js.Any])
    }
  }
}
