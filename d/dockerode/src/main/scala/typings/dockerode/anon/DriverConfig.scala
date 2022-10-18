package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriverConfig extends StObject {
  
  var DriverConfig: Options
  
  var Labels: StringDictionary[String]
  
  var NoCopy: Boolean
}
object DriverConfig {
  
  inline def apply(DriverConfig: Options, Labels: StringDictionary[String], NoCopy: Boolean): DriverConfig = {
    val __obj = js.Dynamic.literal(DriverConfig = DriverConfig.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], NoCopy = NoCopy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriverConfig]
  }
  
  extension [Self <: DriverConfig](x: Self) {
    
    inline def setDriverConfig(value: Options): Self = StObject.set(x, "DriverConfig", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setNoCopy(value: Boolean): Self = StObject.set(x, "NoCopy", value.asInstanceOf[js.Any])
  }
}
