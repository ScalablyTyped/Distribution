package typings.easydate

import typings.easydate.easydateStrings.local
import typings.easydate.easydateStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easydate", JSImport.Namespace)
  @js.native
  def apply(pattern: String): String = js.native
  @JSImport("easydate", JSImport.Namespace)
  @js.native
  def apply(pattern: String, config: String): String = js.native
  @JSImport("easydate", JSImport.Namespace)
  @js.native
  def apply(pattern: String, config: DateConfig): String = js.native
  
  @js.native
  trait DateConfig extends StObject {
    
    var adjust: js.UndefOr[Boolean] = js.native
    
    var setDate: js.UndefOr[String] = js.native
    
    var timeZone: js.UndefOr[utc | local] = js.native
  }
  object DateConfig {
    
    @scala.inline
    def apply(): DateConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateConfig]
    }
    
    @scala.inline
    implicit class DateConfigMutableBuilder[Self <: DateConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjust(value: Boolean): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      @scala.inline
      def setSetDate(value: String): Self = StObject.set(x, "setDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetDateUndefined: Self = StObject.set(x, "setDate", js.undefined)
      
      @scala.inline
      def setTimeZone(value: utc | local): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    }
  }
}
