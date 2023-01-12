package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlendMixin extends StObject {
  
  var blendMode: BlendMode
  
  var effectStyleId: String
  
  var effects: js.Array[Effect]
  
  var isMask: Boolean
  
  var opacity: Double
}
object BlendMixin {
  
  inline def apply(
    blendMode: BlendMode,
    effectStyleId: String,
    effects: js.Array[Effect],
    isMask: Boolean,
    opacity: Double
  ): BlendMixin = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], effectStyleId = effectStyleId.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], isMask = isMask.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlendMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlendMixin] (val x: Self) extends AnyVal {
    
    inline def setBlendMode(value: BlendMode): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setEffectStyleId(value: String): Self = StObject.set(x, "effectStyleId", value.asInstanceOf[js.Any])
    
    inline def setEffects(value: js.Array[Effect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsVarargs(value: Effect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setIsMask(value: Boolean): Self = StObject.set(x, "isMask", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
