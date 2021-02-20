package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecCreateOptions extends StObject {
  
  var AttachStderr: js.UndefOr[Boolean] = js.native
  
  var AttachStdin: js.UndefOr[Boolean] = js.native
  
  var AttachStdout: js.UndefOr[Boolean] = js.native
  
  var Cmd: js.UndefOr[js.Array[String]] = js.native
  
  var DetachKeys: js.UndefOr[String] = js.native
  
  var Env: js.UndefOr[js.Array[String]] = js.native
  
  var Privileged: js.UndefOr[Boolean] = js.native
  
  var Tty: js.UndefOr[Boolean] = js.native
  
  var User: js.UndefOr[String] = js.native
  
  var WorkingDir: js.UndefOr[String] = js.native
}
object ExecCreateOptions {
  
  @scala.inline
  def apply(): ExecCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecCreateOptions]
  }
  
  @scala.inline
  implicit class ExecCreateOptionsMutableBuilder[Self <: ExecCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachStderr(value: Boolean): Self = StObject.set(x, "AttachStderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStderrUndefined: Self = StObject.set(x, "AttachStderr", js.undefined)
    
    @scala.inline
    def setAttachStdin(value: Boolean): Self = StObject.set(x, "AttachStdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStdinUndefined: Self = StObject.set(x, "AttachStdin", js.undefined)
    
    @scala.inline
    def setAttachStdout(value: Boolean): Self = StObject.set(x, "AttachStdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachStdoutUndefined: Self = StObject.set(x, "AttachStdout", js.undefined)
    
    @scala.inline
    def setCmd(value: js.Array[String]): Self = StObject.set(x, "Cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdUndefined: Self = StObject.set(x, "Cmd", js.undefined)
    
    @scala.inline
    def setCmdVarargs(value: String*): Self = StObject.set(x, "Cmd", js.Array(value :_*))
    
    @scala.inline
    def setDetachKeys(value: String): Self = StObject.set(x, "DetachKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachKeysUndefined: Self = StObject.set(x, "DetachKeys", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Array[String]): Self = StObject.set(x, "Env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "Env", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = StObject.set(x, "Env", js.Array(value :_*))
    
    @scala.inline
    def setPrivileged(value: Boolean): Self = StObject.set(x, "Privileged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegedUndefined: Self = StObject.set(x, "Privileged", js.undefined)
    
    @scala.inline
    def setTty(value: Boolean): Self = StObject.set(x, "Tty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtyUndefined: Self = StObject.set(x, "Tty", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
    
    @scala.inline
    def setWorkingDir(value: String): Self = StObject.set(x, "WorkingDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirUndefined: Self = StObject.set(x, "WorkingDir", js.undefined)
  }
}
