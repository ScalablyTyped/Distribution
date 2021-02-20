package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelaunchOptions extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.native
  
  var execPath: js.UndefOr[String] = js.native
}
object RelaunchOptions {
  
  @scala.inline
  def apply(): RelaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelaunchOptions]
  }
  
  @scala.inline
  implicit class RelaunchOptionsMutableBuilder[Self <: RelaunchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
  }
}
