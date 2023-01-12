package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchItems extends StObject {
  
  /**
    * the command-line arguments to pass to the executable.
    *
    * @platform win32
    */
  var args: js.Array[String]
  
  /**
    * `true` if the app registry key is startup approved and therefore shows as
    * `enabled` in Task Manager and Windows settings.
    *
    * @platform win32
    */
  var enabled: Boolean
  
  /**
    * name value of a registry entry.
    *
    * @platform win32
    */
  var name: String
  
  /**
    * The executable to an app that corresponds to a registry entry.
    *
    * @platform win32
    */
  var path: String
  
  /**
    * one of `user` or `machine`. Indicates whether the registry entry is under
    * `HKEY_CURRENT USER` or `HKEY_LOCAL_MACHINE`.
    *
    * @platform win32
    */
  var scope: String
}
object LaunchItems {
  
  inline def apply(args: js.Array[String], enabled: Boolean, name: String, path: String, scope: String): LaunchItems = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchItems] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
