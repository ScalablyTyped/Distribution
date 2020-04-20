package typings.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodPropertyDescriptor[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.undefined
  var enumerable: js.UndefOr[Boolean] = js.undefined
  var value: T
  var writable: js.UndefOr[Boolean] = js.undefined
}

object MethodPropertyDescriptor {
  @scala.inline
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](
    value: T,
    configurable: js.UndefOr[Boolean] = js.undefined,
    enumerable: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): MethodPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPropertyDescriptor[T]]
  }
}

