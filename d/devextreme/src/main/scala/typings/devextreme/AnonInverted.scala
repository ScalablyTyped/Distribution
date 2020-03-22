package typings.devextreme

import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.string_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInverted extends js.Object {
  var inverted: js.UndefOr[Boolean] = js.undefined
  var logarithmBase: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[continuous | logarithmic] = js.undefined
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
}

object AnonInverted {
  @scala.inline
  def apply(
    inverted: js.UndefOr[Boolean] = js.undefined,
    logarithmBase: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    `type`: continuous | logarithmic = null,
    valueType: datetime | numeric | string_ = null
  ): AnonInverted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (logarithmBase != null) __obj.updateDynamic("logarithmBase")(logarithmBase.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInverted]
  }
}

