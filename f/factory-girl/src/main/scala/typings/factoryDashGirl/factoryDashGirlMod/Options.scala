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
  def apply[T](afterBuild: Hook[T] = null, afterCreate: Hook[T] = null): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (afterBuild != null) __obj.updateDynamic("afterBuild")(afterBuild)
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate)
    __obj.asInstanceOf[Options[T]]
  }
}

