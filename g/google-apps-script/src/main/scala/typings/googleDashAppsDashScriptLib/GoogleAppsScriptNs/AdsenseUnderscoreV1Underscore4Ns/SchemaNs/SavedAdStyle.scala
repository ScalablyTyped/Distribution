package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedAdStyle extends js.Object {
  var adStyle: js.UndefOr[AdStyle] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SavedAdStyle {
  @scala.inline
  def apply(
    adStyle: AdStyle = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null
  ): SavedAdStyle = {
    val __obj = js.Dynamic.literal()
    if (adStyle != null) __obj.updateDynamic("adStyle")(adStyle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SavedAdStyle]
  }
}

