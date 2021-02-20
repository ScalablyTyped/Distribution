package typings.ftps

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ftps", JSImport.Namespace)
  @js.native
  class ^ protected () extends FTP {
    def this(options: FTPOptions) = this()
  }
  
  @js.native
  trait FTP extends StObject {
    
    def addFile(localPath: String, remotePath: String): FTP = js.native
    
    def cat(path: String): FTP = js.native
    
    def cd(directory: String): FTP = js.native
    
    // Helpers
    def escapeshell(cmd: String): String = js.native
    
    def exec(cmdsOrCallback: String): js.Any = js.native
    def exec(cmdsOrCallback: String, callback: FTPCallbackFunction): js.Any = js.native
    def exec(cmdsOrCallback: js.Array[String]): js.Any = js.native
    def exec(cmdsOrCallback: js.Array[String], callback: FTPCallbackFunction): js.Any = js.native
    def exec(cmdsOrCallback: FTPCallbackFunction): js.Any = js.native
    def exec(cmdsOrCallback: FTPCallbackFunction, callback: FTPCallbackFunction): js.Any = js.native
    
    def execAsStream(cmds: String): js.Any = js.native
    def execAsStream(cmds: js.Array[String]): js.Any = js.native
    
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
  
  type FTPCallbackFunction = js.Function2[/* err */ Error | Null, /* results */ FTPResults, js.Any]
  
  @js.native
  trait FTPOptions extends StObject {
    
    var additionalLftpCommands: js.UndefOr[String] = js.native
    
    var autoConfirm: js.UndefOr[Boolean] = js.native
    
    var cwd: js.UndefOr[String] = js.native
    
    var escape: js.UndefOr[Boolean] = js.native
    
    var host: String = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var requireSSHKey: js.UndefOr[Boolean] = js.native
    
    var requiresPassword: js.UndefOr[Boolean] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var retryInterval: js.UndefOr[Double] = js.native
    
    var retryIntervalMultiplier: js.UndefOr[Double] = js.native
    
    var sshKeyPath: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object FTPOptions {
    
    @scala.inline
    def apply(host: String): FTPOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[FTPOptions]
    }
    
    @scala.inline
    implicit class FTPOptionsMutableBuilder[Self <: FTPOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalLftpCommands(value: String): Self = StObject.set(x, "additionalLftpCommands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalLftpCommandsUndefined: Self = StObject.set(x, "additionalLftpCommands", js.undefined)
      
      @scala.inline
      def setAutoConfirm(value: Boolean): Self = StObject.set(x, "autoConfirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoConfirmUndefined: Self = StObject.set(x, "autoConfirm", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRequireSSHKey(value: Boolean): Self = StObject.set(x, "requireSSHKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireSSHKeyUndefined: Self = StObject.set(x, "requireSSHKey", js.undefined)
      
      @scala.inline
      def setRequiresPassword(value: Boolean): Self = StObject.set(x, "requiresPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiresPasswordUndefined: Self = StObject.set(x, "requiresPassword", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setRetryInterval(value: Double): Self = StObject.set(x, "retryInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryIntervalMultiplier(value: Double): Self = StObject.set(x, "retryIntervalMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryIntervalMultiplierUndefined: Self = StObject.set(x, "retryIntervalMultiplier", js.undefined)
      
      @scala.inline
      def setRetryIntervalUndefined: Self = StObject.set(x, "retryInterval", js.undefined)
      
      @scala.inline
      def setSshKeyPath(value: Boolean): Self = StObject.set(x, "sshKeyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSshKeyPathUndefined: Self = StObject.set(x, "sshKeyPath", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait FTPResults extends StObject {
    
    var data: String | Null = js.native
    
    var error: Error | Null = js.native
  }
  object FTPResults {
    
    @scala.inline
    def apply(): FTPResults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FTPResults]
    }
    
    @scala.inline
    implicit class FTPResultsMutableBuilder[Self <: FTPResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorNull: Self = StObject.set(x, "error", null)
    }
  }
  
  @js.native
  trait MirrorOptions extends StObject {
    
    var filter: js.UndefOr[js.Any] = js.native
    
    var localDir: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[String] = js.native
    
    var parallel: js.UndefOr[Boolean | Double] = js.native
    
    var remoteDir: js.UndefOr[String] = js.native
    
    var upload: js.UndefOr[Boolean] = js.native
  }
  object MirrorOptions {
    
    @scala.inline
    def apply(): MirrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MirrorOptions]
    }
    
    @scala.inline
    implicit class MirrorOptionsMutableBuilder[Self <: MirrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: js.Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setLocalDir(value: String): Self = StObject.set(x, "localDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalDirUndefined: Self = StObject.set(x, "localDir", js.undefined)
      
      @scala.inline
      def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setRemoteDir(value: String): Self = StObject.set(x, "remoteDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteDirUndefined: Self = StObject.set(x, "remoteDir", js.undefined)
      
      @scala.inline
      def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    }
  }
}
