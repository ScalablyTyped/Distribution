package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewalSettings extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var renewalType: js.UndefOr[String] = js.undefined
}

object RenewalSettings {
  @scala.inline
  def apply(kind: String = null, renewalType: String = null): RenewalSettings = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (renewalType != null) __obj.updateDynamic("renewalType")(renewalType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewalSettings]
  }
}

