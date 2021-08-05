package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelaunchOptions extends StObject {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var execPath: js.UndefOr[String] = js.undefined
}
object RelaunchOptions {
  
  inline def apply(): RelaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelaunchOptions]
  }
  
  extension [Self <: RelaunchOptions](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
    
    inline def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
  }
}
