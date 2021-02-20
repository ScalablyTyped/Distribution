package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginEnv extends StObject {
  
  var Description: String = js.native
  
  var Name: String = js.native
  
  var Settable: js.Array[String] = js.native
  
  var Value: String = js.native
}
object PluginEnv {
  
  @scala.inline
  def apply(Description: String, Name: String, Settable: js.Array[String], Value: String): PluginEnv = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginEnv]
  }
  
  @scala.inline
  implicit class PluginEnvMutableBuilder[Self <: PluginEnv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettable(value: js.Array[String]): Self = StObject.set(x, "Settable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettableVarargs(value: String*): Self = StObject.set(x, "Settable", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
