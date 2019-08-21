package typings.figma

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
    val __obj = js.Dynamic.literal(locked = locked, visible = visible)
  
    __obj.asInstanceOf[SceneNodeMixin]
  }
}

