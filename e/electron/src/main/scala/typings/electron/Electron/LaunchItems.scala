package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchItems extends js.Object {
  
  /**
    * the command-line arguments to pass to the executable.
    *
    * @platform win32
    */
  var args: js.Array[String] = js.native
  
  /**
    * `true` if the app registry key is startup approved and therefore shows as
    * `enabled` in Task Manager and Windows settings.
    *
    * @platform win32
    */
  var enabled: Boolean = js.native
  
  /**
    * name value of a registry entry.
    *
    * @platform win32
    */
  var name: String = js.native
  
  /**
    * The executable to an app that corresponds to a registry entry.
    *
    * @platform win32
    */
  var path: String = js.native
  
  /**
    * one of `user` or `machine`. Indicates whether the registry entry is under
    * `HKEY_CURRENT USER` or `HKEY_LOCAL_MACHINE`.
    *
    * @platform win32
    */
  var scope: String = js.native
}
object LaunchItems {
  
  @scala.inline
  def apply(args: js.Array[String], enabled: Boolean, name: String, path: String, scope: String): LaunchItems = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchItems]
  }
  
  @scala.inline
  implicit class LaunchItemsOps[Self <: LaunchItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
}
