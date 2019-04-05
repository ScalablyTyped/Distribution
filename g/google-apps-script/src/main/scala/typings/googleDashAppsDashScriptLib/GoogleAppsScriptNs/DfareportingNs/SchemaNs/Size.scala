package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var iab: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Size {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    iab: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(iab)) __obj.updateDynamic("iab")(iab)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

