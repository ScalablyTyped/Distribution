package typings.dockerode.mod

import typings.dockerode.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginSpec extends StObject {
  
  var Disabled: js.UndefOr[Boolean] = js.undefined
  
  var Env: js.UndefOr[js.Array[String]] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
  
  var Privileges: js.UndefOr[Description] = js.undefined
  
  var Remote: js.UndefOr[String] = js.undefined
}
object PluginSpec {
  
  @scala.inline
  def apply(): PluginSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSpec]
  }
  
  @scala.inline
  implicit class PluginSpecMutableBuilder[Self <: PluginSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "Disabled", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "Env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "Env", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPrivileges(value: Description): Self = StObject.set(x, "Privileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegesUndefined: Self = StObject.set(x, "Privileges", js.undefined)
    
    @scala.inline
    def setRemote(value: String): Self = StObject.set(x, "Remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteUndefined: Self = StObject.set(x, "Remote", js.undefined)
  }
}
