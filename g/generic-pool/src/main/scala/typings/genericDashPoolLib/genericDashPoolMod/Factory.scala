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
    create: js.Function0[js.Thenable[T]],
    destroy: js.Function1[T, js.Thenable[scala.Unit]],
    validate: js.Function1[/* client */ T, js.Thenable[scala.Boolean]] = null
  ): Factory[T] = {
    val __obj = js.Dynamic.literal(create = create, destroy = destroy)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Factory[T]]
  }
}

