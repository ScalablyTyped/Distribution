package typings.ftps.ftpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTPOptions extends js.Object {
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
  var sshKeyPath: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object FTPOptions {
  @scala.inline
  def apply(
    host: String,
    additionalLftpCommands: String = null,
    autoConfirm: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    escape: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    port: Int | Double = null,
    protocol: String = null,
    requireSSHKey: js.UndefOr[Boolean] = js.undefined,
    requiresPassword: js.UndefOr[Boolean] = js.undefined,
    retries: Int | Double = null,
    retryInterval: Int | Double = null,
    retryIntervalMultiplier: Int | Double = null,
    sshKeyPath: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    username: String = null
  ): FTPOptions = {
    val __obj = js.Dynamic.literal(host = host)
    if (additionalLftpCommands != null) __obj.updateDynamic("additionalLftpCommands")(additionalLftpCommands)
    if (!js.isUndefined(autoConfirm)) __obj.updateDynamic("autoConfirm")(autoConfirm)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(escape)) __obj.updateDynamic("escape")(escape)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (!js.isUndefined(requireSSHKey)) __obj.updateDynamic("requireSSHKey")(requireSSHKey)
    if (!js.isUndefined(requiresPassword)) __obj.updateDynamic("requiresPassword")(requiresPassword)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (retryInterval != null) __obj.updateDynamic("retryInterval")(retryInterval.asInstanceOf[js.Any])
    if (retryIntervalMultiplier != null) __obj.updateDynamic("retryIntervalMultiplier")(retryIntervalMultiplier.asInstanceOf[js.Any])
    if (!js.isUndefined(sshKeyPath)) __obj.updateDynamic("sshKeyPath")(sshKeyPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[FTPOptions]
  }
}

