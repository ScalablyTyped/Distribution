package typings.dockerode.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecCreateOptions extends StObject {
  
  var AttachStderr: js.UndefOr[Boolean] = js.undefined
  
  var AttachStdin: js.UndefOr[Boolean] = js.undefined
  
  var AttachStdout: js.UndefOr[Boolean] = js.undefined
  
  var Cmd: js.UndefOr[js.Array[String]] = js.undefined
  
  var DetachKeys: js.UndefOr[String] = js.undefined
  
  var Env: js.UndefOr[js.Array[String]] = js.undefined
  
  var Privileged: js.UndefOr[Boolean] = js.undefined
  
  var Tty: js.UndefOr[Boolean] = js.undefined
  
  var User: js.UndefOr[String] = js.undefined
  
  var WorkingDir: js.UndefOr[String] = js.undefined
  
  var abortSignal: js.UndefOr[AbortSignal] = js.undefined
}
object ExecCreateOptions {
  
  inline def apply(): ExecCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecCreateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecCreateOptions] (val x: Self) extends AnyVal {
    
    inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
    
    inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
    
    inline def setAttachStderr(value: Boolean): Self = StObject.set(x, "AttachStderr", value.asInstanceOf[js.Any])
    
    inline def setAttachStderrUndefined: Self = StObject.set(x, "AttachStderr", js.undefined)
    
    inline def setAttachStdin(value: Boolean): Self = StObject.set(x, "AttachStdin", value.asInstanceOf[js.Any])
    
    inline def setAttachStdinUndefined: Self = StObject.set(x, "AttachStdin", js.undefined)
    
    inline def setAttachStdout(value: Boolean): Self = StObject.set(x, "AttachStdout", value.asInstanceOf[js.Any])
    
    inline def setAttachStdoutUndefined: Self = StObject.set(x, "AttachStdout", js.undefined)
    
    inline def setCmd(value: js.Array[String]): Self = StObject.set(x, "Cmd", value.asInstanceOf[js.Any])
    
    inline def setCmdUndefined: Self = StObject.set(x, "Cmd", js.undefined)
    
    inline def setCmdVarargs(value: String*): Self = StObject.set(x, "Cmd", js.Array(value*))
    
    inline def setDetachKeys(value: String): Self = StObject.set(x, "DetachKeys", value.asInstanceOf[js.Any])
    
    inline def setDetachKeysUndefined: Self = StObject.set(x, "DetachKeys", js.undefined)
    
    inline def setEnv(value: js.Array[String]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "Env", js.undefined)
    
    inline def setEnvVarargs(value: String*): Self = StObject.set(x, "Env", js.Array(value*))
    
    inline def setPrivileged(value: Boolean): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    inline def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
    
    inline def setTty(value: Boolean): Self = StObject.set(x, "Tty", value.asInstanceOf[js.Any])
    
    inline def setTtyUndefined: Self = StObject.set(x, "Tty", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    inline def setWorkingDir(value: String): Self = StObject.set(x, "WorkingDir", value.asInstanceOf[js.Any])
    
    inline def setWorkingDirUndefined: Self = StObject.set(x, "WorkingDir", js.undefined)
  }
}
