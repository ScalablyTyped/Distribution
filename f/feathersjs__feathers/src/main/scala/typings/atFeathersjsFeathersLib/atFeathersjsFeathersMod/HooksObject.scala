package typings
package atFeathersjsFeathersLib.atFeathersjsFeathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HooksObject extends js.Object {
  var after: stdLib.Partial[HookMap]
  var before: stdLib.Partial[HookMap]
  var error: stdLib.Partial[HookMap]
}

object HooksObject {
  @scala.inline
  def apply(after: stdLib.Partial[HookMap], before: stdLib.Partial[HookMap], error: stdLib.Partial[HookMap]): HooksObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[HooksObject]
  }
}

