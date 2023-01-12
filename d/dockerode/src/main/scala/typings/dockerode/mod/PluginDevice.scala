package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginDevice extends StObject {
  
  var Description: String
  
  var Name: String
  
  var Path: String
  
  var Settable: js.Array[String]
}
object PluginDevice {
  
  inline def apply(Description: String, Name: String, Path: String, Settable: js.Array[String]): PluginDevice = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginDevice] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSettable(value: js.Array[String]): Self = StObject.set(x, "Settable", value.asInstanceOf[js.Any])
    
    inline def setSettableVarargs(value: String*): Self = StObject.set(x, "Settable", js.Array(value*))
  }
}
