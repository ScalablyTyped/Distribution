package typings.ftps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ftps", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FTP {
    def this(options: FTPOptions) = this()
  }
  
  @js.native
  trait FTP extends StObject {
    
    def addFile(localPath: String, remotePath: String): FTP = js.native
    
    def cat(path: String): FTP = js.native
    
    def cd(directory: String): FTP = js.native
    
    // Helpers
    def escapeshell(cmd: String): String = js.native
    
    def exec(cmdsOrCallback: String): Any = js.native
    def exec(cmdsOrCallback: String, callback: FTPCallbackFunction): Any = js.native
    def exec(cmdsOrCallback: js.Array[String]): Any = js.native
    def exec(cmdsOrCallback: js.Array[String], callback: FTPCallbackFunction): Any = js.native
    def exec(cmdsOrCallback: FTPCallbackFunction): Any = js.native
    def exec(cmdsOrCallback: FTPCallbackFunction, callback: FTPCallbackFunction): Any = js.native
    
    def execAsStream(cmds: String): Any = js.native
    def execAsStream(cmds: js.Array[String]): Any = js.native
    
    def get(remotePath: String, localPath: String): FTP = js.native
    
    def getFile(remotePath: String, localPath: String): FTP = js.native
    
    def ls(): FTP = js.native
    
    def mirror(options: MirrorOptions): FTP = js.native
    
    def move(from: String, to: String): FTP = js.native
    
    def mv(from: String, to: String): FTP = js.native
    
    def put(localPath: String, remotePath: String): FTP = js.native
    
    def pwd(): FTP = js.native
    
    def raw(cmd: String): FTP = js.native
    
    def remove(paths: String*): FTP = js.native
    
    def rm(paths: String*): FTP = js.native
    
    def rmdir(paths: String*): FTP = js.native
  }
  
  type FTPCallbackFunction = js.Function2[/* err */ js.Error | Null, /* results */ FTPResults, Any]
  
  trait FTPOptions extends StObject {
    
    var additionalLftpCommands: js.UndefOr[String] = js.undefined
    
    var autoConfirm: js.UndefOr[Boolean] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var escape: js.UndefOr[Boolean] = js.undefined
    
    var host: String
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var requireSSHKey: js.UndefOr[Boolean] = js.undefined
    
    var requiresPassword: js.UndefOr[Boolean] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var retryInterval: js.UndefOr[Double] = js.undefined
    
    var retryIntervalMultiplier: js.UndefOr[Double] = js.undefined
    
    var sshKeyPath: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object FTPOptions {
    
    inline def apply(host: String): FTPOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[FTPOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FTPOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditionalLftpCommands(value: String): Self = StObject.set(x, "additionalLftpCommands", value.asInstanceOf[js.Any])
      
      inline def setAdditionalLftpCommandsUndefined: Self = StObject.set(x, "additionalLftpCommands", js.undefined)
      
      inline def setAutoConfirm(value: Boolean): Self = StObject.set(x, "autoConfirm", value.asInstanceOf[js.Any])
      
      inline def setAutoConfirmUndefined: Self = StObject.set(x, "autoConfirm", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRequireSSHKey(value: Boolean): Self = StObject.set(x, "requireSSHKey", value.asInstanceOf[js.Any])
      
      inline def setRequireSSHKeyUndefined: Self = StObject.set(x, "requireSSHKey", js.undefined)
      
      inline def setRequiresPassword(value: Boolean): Self = StObject.set(x, "requiresPassword", value.asInstanceOf[js.Any])
      
      inline def setRequiresPasswordUndefined: Self = StObject.set(x, "requiresPassword", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
      
      inline def setRetryIntervalMultiplier(value: Double): Self = StObject.set(x, "retryIntervalMultiplier", value.asInstanceOf[js.Any])
      
      inline def setRetryIntervalMultiplierUndefined: Self = StObject.set(x, "retryIntervalMultiplier", js.undefined)
      
      inline def setRetryIntervalUndefined: Self = StObject.set(x, "retryInterval", js.undefined)
      
      inline def setSshKeyPath(value: String): Self = StObject.set(x, "sshKeyPath", value.asInstanceOf[js.Any])
      
      inline def setSshKeyPathUndefined: Self = StObject.set(x, "sshKeyPath", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait FTPResults extends StObject {
    
    var data: String | Null
    
    var error: js.Error | Null
  }
  object FTPResults {
    
    inline def apply(): FTPResults = {
      val __obj = js.Dynamic.literal(data = null, error = null)
      __obj.asInstanceOf[FTPResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FTPResults] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
  
  trait MirrorOptions extends StObject {
    
    var filter: js.UndefOr[Any] = js.undefined
    
    var localDir: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[String] = js.undefined
    
    var parallel: js.UndefOr[Boolean | Double] = js.undefined
    
    var remoteDir: js.UndefOr[String] = js.undefined
    
    var upload: js.UndefOr[Boolean] = js.undefined
  }
  object MirrorOptions {
    
    inline def apply(): MirrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MirrorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MirrorOptions] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLocalDir(value: String): Self = StObject.set(x, "localDir", value.asInstanceOf[js.Any])
      
      inline def setLocalDirUndefined: Self = StObject.set(x, "localDir", js.undefined)
      
      inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setRemoteDir(value: String): Self = StObject.set(x, "remoteDir", value.asInstanceOf[js.Any])
      
      inline def setRemoteDirUndefined: Self = StObject.set(x, "remoteDir", js.undefined)
      
      inline def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    }
  }
}
