package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerAttachOptions extends StObject {
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
  
  var detachKeys: js.UndefOr[String] = js.undefined
  
  var hijack: js.UndefOr[Boolean] = js.undefined
  
  var logs: js.UndefOr[Boolean] = js.undefined
  
  var stderr: js.UndefOr[Boolean] = js.undefined
  
  var stdin: js.UndefOr[Boolean] = js.undefined
  
  var stdout: js.UndefOr[Boolean] = js.undefined
  
  var stream: js.UndefOr[Boolean] = js.undefined
}
object ContainerAttachOptions {
  
  inline def apply(): ContainerAttachOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerAttachOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerAttachOptions] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setDetachKeys(value: String): Self = StObject.set(x, "detachKeys", value.asInstanceOf[js.Any])
    
    inline def setDetachKeysUndefined: Self = StObject.set(x, "detachKeys", js.undefined)
    
    inline def setHijack(value: Boolean): Self = StObject.set(x, "hijack", value.asInstanceOf[js.Any])
    
    inline def setHijackUndefined: Self = StObject.set(x, "hijack", js.undefined)
    
    inline def setLogs(value: Boolean): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    inline def setStderr(value: Boolean): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdin(value: Boolean): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
    
    inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
    
    inline def setStdout(value: Boolean): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
