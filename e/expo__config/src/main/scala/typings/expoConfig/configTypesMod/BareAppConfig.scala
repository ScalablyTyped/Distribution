package typings.expoConfig.configTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BareAppConfig
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var name: String
}
object BareAppConfig {
  
  inline def apply(name: String): BareAppConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BareAppConfig]
  }
  
  extension [Self <: BareAppConfig](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
