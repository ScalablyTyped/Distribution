package typings.ftps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FTPOptions extends js.Object {
  
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
  implicit class FTPOptionsOps[Self <: FTPOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalLftpCommands(value: String): Self = this.set("additionalLftpCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalLftpCommands: Self = this.set("additionalLftpCommands", js.undefined)
    
    @scala.inline
    def setAutoConfirm(value: Boolean): Self = this.set("autoConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConfirm: Self = this.set("autoConfirm", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setEscape(value: Boolean): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRequireSSHKey(value: Boolean): Self = this.set("requireSSHKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSSHKey: Self = this.set("requireSSHKey", js.undefined)
    
    @scala.inline
    def setRequiresPassword(value: Boolean): Self = this.set("requiresPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresPassword: Self = this.set("requiresPassword", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setRetryInterval(value: Double): Self = this.set("retryInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryInterval: Self = this.set("retryInterval", js.undefined)
    
    @scala.inline
    def setRetryIntervalMultiplier(value: Double): Self = this.set("retryIntervalMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryIntervalMultiplier: Self = this.set("retryIntervalMultiplier", js.undefined)
    
    @scala.inline
    def setSshKeyPath(value: Boolean): Self = this.set("sshKeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSshKeyPath: Self = this.set("sshKeyPath", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
