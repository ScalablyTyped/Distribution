package typings.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessorPropertyDescriptor[T] extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.undefined
  var enumerable: js.UndefOr[Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var set: js.UndefOr[js.Function1[/* v */ T, Unit]] = js.undefined
}

object AccessorPropertyDescriptor {
  @scala.inline
  def apply[T](
    configurable: js.UndefOr[Boolean] = js.undefined,
    enumerable: js.UndefOr[Boolean] = js.undefined,
    get: () => T = null,
    set: /* v */ T => Unit = null
  ): AccessorPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction0(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    __obj.asInstanceOf[AccessorPropertyDescriptor[T]]
  }
}

