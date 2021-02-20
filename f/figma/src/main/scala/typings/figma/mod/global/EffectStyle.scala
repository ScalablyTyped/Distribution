package typings.figma.mod.global

import typings.figma.figmaStrings.EFFECT
import org.scalablytyped.runtime.StObject
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
  implicit class EffectStyleMutableBuilder[Self <: EffectStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffects(value: js.Array[Effect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsVarargs(value: Effect*): Self = StObject.set(x, "effects", js.Array(value :_*))
    
    @scala.inline
    def setType(value: EFFECT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
