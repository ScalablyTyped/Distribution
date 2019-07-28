package typings.devcertDashSan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstallCertutil extends js.Object {
  var installCertutil: js.UndefOr[Boolean] = js.undefined
}

object Anon_InstallCertutil {
  @scala.inline
  def apply(installCertutil: js.UndefOr[Boolean] = js.undefined): Anon_InstallCertutil = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(installCertutil)) __obj.updateDynamic("installCertutil")(installCertutil)
    __obj.asInstanceOf[Anon_InstallCertutil]
  }
}

