package typings.devextreme.anon

import typings.devextreme.devextremeStrings.continuous
import typings.devextreme.devextremeStrings.datetime
import typings.devextreme.devextremeStrings.logarithmic
import typings.devextreme.devextremeStrings.numeric
import typings.devextreme.devextremeStrings.string_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inverted extends js.Object {
  var inverted: js.UndefOr[Boolean] = js.undefined
  var logarithmBase: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[continuous | logarithmic] = js.undefined
  var valueType: js.UndefOr[datetime | numeric | string_] = js.undefined
}

object Inverted {
  @scala.inline
  def apply(
    inverted: js.UndefOr[Boolean] = js.undefined,
    logarithmBase: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    `type`: continuous | logarithmic = null,
    valueType: datetime | numeric | string_ = null
  ): Inverted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logarithmBase)) __obj.updateDynamic("logarithmBase")(logarithmBase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueType != null) __obj.updateDynamic("valueType")(valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inverted]
  }
}

