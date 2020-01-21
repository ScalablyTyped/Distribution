package typings.devcertSan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstallCertutil extends js.Object {
  var installCertutil: js.UndefOr[Boolean] = js.undefined
}

object AnonInstallCertutil {
  @scala.inline
  def apply(installCertutil: js.UndefOr[Boolean] = js.undefined): AnonInstallCertutil = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(installCertutil)) __obj.updateDynamic("installCertutil")(installCertutil.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstallCertutil]
  }
}

