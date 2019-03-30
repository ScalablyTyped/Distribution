package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alert extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var isDismissible: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var severity: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Alert {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    isDismissible: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    message: java.lang.String = null,
    severity: java.lang.String = null,
    `type`: java.lang.String = null
  ): Alert = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isDismissible)) __obj.updateDynamic("isDismissible")(isDismissible)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (message != null) __obj.updateDynamic("message")(message)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Alert]
  }
}

