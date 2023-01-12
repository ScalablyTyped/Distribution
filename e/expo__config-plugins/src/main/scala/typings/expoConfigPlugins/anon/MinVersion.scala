package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinVersion extends StObject {
  
  var minVersion: Double
  
  var name: String
}
object MinVersion {
  
  inline def apply(minVersion: Double, name: String): MinVersion = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinVersion] (val x: Self) extends AnyVal {
    
    inline def setMinVersion(value: Double): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
