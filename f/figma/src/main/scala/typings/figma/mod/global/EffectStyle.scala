package typings.figma.mod.global

import typings.figma.figmaStrings.EFFECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectStyle extends BaseStyle {
  var effects: js.Array[Effect]
  @JSName("type")
  var type_EffectStyle: EFFECT
}

object EffectStyle {
  @scala.inline
  def apply(
    description: String,
    effects: js.Array[Effect],
    id: String,
    key: String,
    name: String,
    remote: Boolean,
    remove: () => Unit,
    `type`: EFFECT
  ): EffectStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectStyle]
  }
}

