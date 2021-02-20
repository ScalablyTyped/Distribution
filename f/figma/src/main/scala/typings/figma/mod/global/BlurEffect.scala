package typings.figma.mod.global

import typings.figma.figmaStrings.BACKGROUND_BLUR
import typings.figma.figmaStrings.LAYER_BLUR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlurEffect extends Effect {
  
  val radius: Double = js.native
  
  val `type`: LAYER_BLUR | BACKGROUND_BLUR = js.native
  
  val visible: Boolean = js.native
}
object BlurEffect {
  
  @scala.inline
  def apply(radius: Double, `type`: LAYER_BLUR | BACKGROUND_BLUR, visible: Boolean): BlurEffect = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEffect]
  }
  
  @scala.inline
  implicit class BlurEffectMutableBuilder[Self <: BlurEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LAYER_BLUR | BACKGROUND_BLUR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
