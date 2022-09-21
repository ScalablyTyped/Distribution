package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OsType extends StObject {
  
  var name: String
  
  var osType: String
  
  var `type`: String
}
object OsType {
  
  inline def apply(name: String, osType: String, `type`: String): OsType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], osType = osType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OsType]
  }
  
  extension [Self <: OsType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOsType(value: String): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
