package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiDataRow extends js.Object {
  var clicks: js.UndefOr[scala.Double] = js.undefined
  var ctr: js.UndefOr[scala.Double] = js.undefined
  var impressions: js.UndefOr[scala.Double] = js.undefined
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
}

object ApiDataRow {
  @scala.inline
  def apply(
    clicks: scala.Int | scala.Double = null,
    ctr: scala.Int | scala.Double = null,
    impressions: scala.Int | scala.Double = null,
    keys: js.Array[java.lang.String] = null,
    position: scala.Int | scala.Double = null
  ): ApiDataRow = {
    val __obj = js.Dynamic.literal()
    if (clicks != null) __obj.updateDynamic("clicks")(clicks.asInstanceOf[js.Any])
    if (ctr != null) __obj.updateDynamic("ctr")(ctr.asInstanceOf[js.Any])
    if (impressions != null) __obj.updateDynamic("impressions")(impressions.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiDataRow]
  }
}

