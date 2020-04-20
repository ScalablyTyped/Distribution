package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneNodeMixin extends js.Object {
  var locked: Boolean
  var visible: Boolean
}

object SceneNodeMixin {
  @scala.inline
  def apply(locked: Boolean, visible: Boolean): SceneNodeMixin = {
    val __obj = js.Dynamic.literal(locked = locked.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneNodeMixin]
  }
}

