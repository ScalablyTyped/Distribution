package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlendMixin extends js.Object {
  var blendMode: BlendMode
  var effectStyleId: String
  var effects: js.Array[Effect]
  var isMask: Boolean
  var opacity: Double
}

object BlendMixin {
  @scala.inline
  def apply(
    blendMode: BlendMode,
    effectStyleId: String,
    effects: js.Array[Effect],
    isMask: Boolean,
    opacity: Double
  ): BlendMixin = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], effectStyleId = effectStyleId.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], isMask = isMask.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendMixin]
  }
}

