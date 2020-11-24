package typings.figma.mod.global

import typings.figma.figmaStrings.EFFECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectStyle extends BaseStyle {
  
  var effects: js.Array[Effect] = js.native
  
  @JSName("type")
  var type_EffectStyle: EFFECT = js.native
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
  
  @scala.inline
  implicit class EffectStyleOps[Self <: EffectStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEffectsVarargs(value: Effect*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[Effect]): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EFFECT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
