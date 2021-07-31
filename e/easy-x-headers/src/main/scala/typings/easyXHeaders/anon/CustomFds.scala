package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFds extends StObject {
  
  var customFds: js.UndefOr[js.Any] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var env: js.UndefOr[js.Any] = js.undefined
  
  var killSignal: js.UndefOr[String] = js.undefined
  
  var maxBuffer: js.UndefOr[Double] = js.undefined
  
  var stdio: js.UndefOr[js.Any] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object CustomFds {
  
  @scala.inline
  def apply(): CustomFds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFds]
  }
  
  @scala.inline
  implicit class CustomFdsMutableBuilder[Self <: CustomFds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomFds(value: js.Any): Self = StObject.set(x, "customFds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFdsUndefined: Self = StObject.set(x, "customFds", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setKillSignal(value: String): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    @scala.inline
    def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    
    @scala.inline
    def setStdio(value: js.Any): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
