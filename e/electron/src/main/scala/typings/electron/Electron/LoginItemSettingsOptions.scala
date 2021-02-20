package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginItemSettingsOptions extends StObject {
  
  /**
    * The command-line arguments to compare against. Defaults to an empty array.
    *
    * @platform win32
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The executable path to compare against. Defaults to `process.execPath`.
    *
    * @platform win32
    */
  var path: js.UndefOr[String] = js.native
}
object LoginItemSettingsOptions {
  
  @scala.inline
  def apply(): LoginItemSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginItemSettingsOptions]
  }
  
  @scala.inline
  implicit class LoginItemSettingsOptionsMutableBuilder[Self <: LoginItemSettingsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
