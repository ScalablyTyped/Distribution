package typings.easydate

import typings.easydate.easydateStrings.local
import typings.easydate.easydateStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pattern: String): String = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(pattern: String, config: String): String = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(pattern: String, config: DateConfig): String = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("easydate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DateConfig extends StObject {
    
    var adjust: js.UndefOr[Boolean] = js.undefined
    
    var setDate: js.UndefOr[String] = js.undefined
    
    var timeZone: js.UndefOr[utc | local] = js.undefined
  }
  object DateConfig {
    
    inline def apply(): DateConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateConfig] (val x: Self) extends AnyVal {
      
      inline def setAdjust(value: Boolean): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      inline def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      inline def setSetDate(value: String): Self = StObject.set(x, "setDate", value.asInstanceOf[js.Any])
      
      inline def setSetDateUndefined: Self = StObject.set(x, "setDate", js.undefined)
      
      inline def setTimeZone(value: utc | local): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    }
  }
}
