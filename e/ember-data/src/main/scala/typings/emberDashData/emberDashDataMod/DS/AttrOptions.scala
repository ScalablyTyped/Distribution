package typings.emberDashData.emberDashDataMod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttrOptions[T] extends js.Object {
  var allowNull: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[T | js.Function0[T]] = js.undefined
}

object AttrOptions {
  @scala.inline
  def apply[T](allowNull: js.UndefOr[Boolean] = js.undefined, defaultValue: T | js.Function0[T] = null): AttrOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrOptions[T]]
  }
}

