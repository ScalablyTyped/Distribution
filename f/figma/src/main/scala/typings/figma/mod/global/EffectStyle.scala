package typings.figma.mod.global

import typings.figma.figmaStrings.EFFECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectStyle
  extends StObject
     with BaseStyle {
  
  var effects: js.Array[Effect]
  
  @JSName("type")
  var type_EffectStyle: EFFECT
}
object EffectStyle {
  
  inline def apply(
    description: String,
    effects: js.Array[Effect],
    id: String,
    key: String,
    name: String,
    remote: Boolean,
    remove: () => Unit
  ): EffectStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
    __obj.updateDynamic("type")("EFFECT")
    __obj.asInstanceOf[EffectStyle]
  }
  
  extension [Self <: EffectStyle](x: Self) {
    
    inline def setEffects(value: js.Array[Effect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsVarargs(value: Effect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setType(value: EFFECT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
