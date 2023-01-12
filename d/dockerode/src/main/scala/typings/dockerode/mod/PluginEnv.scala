package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginEnv extends StObject {
  
  var Description: String
  
  var Name: String
  
  var Settable: js.Array[String]
  
  var Value: String
}
object PluginEnv {
  
  inline def apply(Description: String, Name: String, Settable: js.Array[String], Value: String): PluginEnv = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginEnv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginEnv] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSettable(value: js.Array[String]): Self = StObject.set(x, "Settable", value.asInstanceOf[js.Any])
    
    inline def setSettableVarargs(value: String*): Self = StObject.set(x, "Settable", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
