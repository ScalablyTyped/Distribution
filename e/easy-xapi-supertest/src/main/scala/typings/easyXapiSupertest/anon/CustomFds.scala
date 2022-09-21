package typings.easyXapiSupertest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFds extends StObject {
  
  var customFds: js.UndefOr[Any] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[Any] = js.undefined
  
  var killSignal: js.UndefOr[String] = js.undefined
  
  var maxBuffer: js.UndefOr[Double] = js.undefined
  
  var stdio: js.UndefOr[Any] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object CustomFds {
  
  inline def apply(): CustomFds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFds]
  }
  
  extension [Self <: CustomFds](x: Self) {
    
    inline def setCustomFds(value: Any): Self = StObject.set(x, "customFds", value.asInstanceOf[js.Any])
    
    inline def setCustomFdsUndefined: Self = StObject.set(x, "customFds", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setKillSignal(value: String): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    
    inline def setStdio(value: Any): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
