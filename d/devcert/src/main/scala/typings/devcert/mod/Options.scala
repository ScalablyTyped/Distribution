package typings.devcert.mod

import typings.devcert.userInterfaceMod.UserInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Return the CA certificate data? */
  var getCaBuffer: js.UndefOr[Boolean] = js.undefined
  /** Return the path to the CA certificate? */
  var getCaPath: js.UndefOr[Boolean] = js.undefined
  /** If `certutil` is not installed already (for updating nss databases; e.g. firefox), do not attempt to install it */
  var skipCertutilInstall: js.UndefOr[Boolean] = js.undefined
  /** Do not update your systems host file with the domain name of the certificate */
  var skipHostsFile: js.UndefOr[Boolean] = js.undefined
  /** User interface hooks */
  var ui: js.UndefOr[UserInterface] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    getCaBuffer: js.UndefOr[Boolean] = js.undefined,
    getCaPath: js.UndefOr[Boolean] = js.undefined,
    skipCertutilInstall: js.UndefOr[Boolean] = js.undefined,
    skipHostsFile: js.UndefOr[Boolean] = js.undefined,
    ui: UserInterface = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(getCaBuffer)) __obj.updateDynamic("getCaBuffer")(getCaBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(getCaPath)) __obj.updateDynamic("getCaPath")(getCaPath.asInstanceOf[js.Any])
    if (!js.isUndefined(skipCertutilInstall)) __obj.updateDynamic("skipCertutilInstall")(skipCertutilInstall.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHostsFile)) __obj.updateDynamic("skipHostsFile")(skipHostsFile.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

