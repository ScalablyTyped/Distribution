package typings
package genericDashPoolLib.genericDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Factory[T] extends js.Object {
  var validate: js.UndefOr[js.Function1[/* client */ T, js.Thenable[scala.Boolean]]] = js.undefined
  def create(): js.Thenable[T]
  def destroy(client: T): js.Thenable[scala.Unit]
}

object Factory {
  @scala.inline
  def apply[T](
    create: () => js.Thenable[T],
    destroy: T => js.Thenable[scala.Unit],
    validate: /* client */ T => js.Thenable[scala.Boolean] = null
  ): Factory[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), destroy = js.Any.fromFunction1(destroy))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Factory[T]]
  }
}

