package typings
package ftpsLib.ftpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTPOptions extends js.Object {
  var additionalLftpCommands: js.UndefOr[java.lang.String] = js.undefined
  var autoConfirm: js.UndefOr[scala.Boolean] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var escape: js.UndefOr[scala.Boolean] = js.undefined
  var host: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var requireSSHKey: js.UndefOr[scala.Boolean] = js.undefined
  var requiresPassword: js.UndefOr[scala.Boolean] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
  var retryInterval: js.UndefOr[scala.Double] = js.undefined
  var retryIntervalMultiplier: js.UndefOr[scala.Double] = js.undefined
  var sshKeyPath: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object FTPOptions {
  @scala.inline
  def apply(
    host: java.lang.String,
    additionalLftpCommands: java.lang.String = null,
    autoConfirm: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    escape: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    requireSSHKey: js.UndefOr[scala.Boolean] = js.undefined,
    requiresPassword: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null,
    retryInterval: scala.Int | scala.Double = null,
    retryIntervalMultiplier: scala.Int | scala.Double = null,
    sshKeyPath: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    username: java.lang.String = null
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

