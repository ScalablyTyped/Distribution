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
  def apply[T](
    value: T,
    configurable: js.UndefOr[Boolean] = js.undefined,
    enumerable: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): MethodPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPropertyDescriptor[T]]
  }
}

