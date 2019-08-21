package typings.figma

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
    val __obj = js.Dynamic.literal(description = description, effects = effects, id = id, key = key, name = name, remote = remote, remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EffectStyle]
  }
}

