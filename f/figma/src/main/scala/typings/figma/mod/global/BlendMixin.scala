package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlendMixin extends js.Object {
  
  var blendMode: BlendMode = js.native
  
  var effectStyleId: String = js.native
  
  var effects: js.Array[Effect] = js.native
  
  var isMask: Boolean = js.native
  
  var opacity: Double = js.native
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
  
  @scala.inline
  implicit class BlendMixinOps[Self <: BlendMixin] (val x: Self) extends AnyVal {
    
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
    def setBlendMode(value: BlendMode): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectStyleId(value: String): Self = this.set("effectStyleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsVarargs(value: Effect*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[Effect]): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMask(value: Boolean): Self = this.set("isMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
  }
}
