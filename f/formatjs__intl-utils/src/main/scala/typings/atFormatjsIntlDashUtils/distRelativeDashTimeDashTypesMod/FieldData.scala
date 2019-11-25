package typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldData extends js.Object {
  var `-1`: js.UndefOr[String] = js.undefined
  var `-2`: js.UndefOr[String] = js.undefined
  var `-3`: js.UndefOr[String] = js.undefined
  var `0`: js.UndefOr[String] = js.undefined
  var `1`: js.UndefOr[String] = js.undefined
  var `2`: js.UndefOr[String] = js.undefined
  var `3`: js.UndefOr[String] = js.undefined
  var future: RelativeTimeData
  var past: RelativeTimeData
}

object FieldData {
  @scala.inline
  def apply(
    future: RelativeTimeData,
    past: RelativeTimeData,
    `-1`: String = null,
    `-2`: String = null,
    `-3`: String = null,
    `0`: String = null,
    `1`: String = null,
    `2`: String = null,
    `3`: String = null
  ): FieldData = {
    val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
    if (`-1` != null) __obj.updateDynamic("-1")(`-1`.asInstanceOf[js.Any])
    if (`-2` != null) __obj.updateDynamic("-2")(`-2`.asInstanceOf[js.Any])
    if (`-3` != null) __obj.updateDynamic("-3")(`-3`.asInstanceOf[js.Any])
    if (`0` != null) __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    if (`1` != null) __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    if (`2` != null) __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    if (`3` != null) __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldData]
  }
}

