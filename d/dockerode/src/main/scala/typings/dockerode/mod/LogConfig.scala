package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfig extends StObject {
  
  var Config: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Type: LoggingDriverType
}
object LogConfig {
  
  inline def apply(Type: LoggingDriverType): LogConfig = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
  
  extension [Self <: LogConfig](x: Self) {
    
    inline def setConfig(value: StringDictionary[String]): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    inline def setType(value: LoggingDriverType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
