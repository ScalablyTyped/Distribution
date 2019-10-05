package typings.factoryDashGirl.factoryDashGirlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var afterBuild: js.UndefOr[Hook[T]] = js.undefined
  var afterCreate: js.UndefOr[Hook[T]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    afterBuild: (/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any) => Unit = null,
    afterCreate: (/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any) => Unit = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (afterBuild != null) __obj.updateDynamic("afterBuild")(js.Any.fromFunction3(afterBuild))
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(js.Any.fromFunction3(afterCreate))
    __obj.asInstanceOf[Options[T]]
  }
}

