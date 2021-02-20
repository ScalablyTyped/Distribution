package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RectangleCornerMixin extends StObject {
  
  var bottomLeftRadius: Double = js.native
  
  var bottomRightRadius: Double = js.native
  
  var topLeftRadius: Double = js.native
  
  var topRightRadius: Double = js.native
}
object RectangleCornerMixin {
  
  @scala.inline
  def apply(bottomLeftRadius: Double, bottomRightRadius: Double, topLeftRadius: Double, topRightRadius: Double): RectangleCornerMixin = {
    val __obj = js.Dynamic.literal(bottomLeftRadius = bottomLeftRadius.asInstanceOf[js.Any], bottomRightRadius = bottomRightRadius.asInstanceOf[js.Any], topLeftRadius = topLeftRadius.asInstanceOf[js.Any], topRightRadius = topRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleCornerMixin]
  }
  
  @scala.inline
  implicit class RectangleCornerMixinMutableBuilder[Self <: RectangleCornerMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomLeftRadius(value: Double): Self = StObject.set(x, "bottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomRightRadius(value: Double): Self = StObject.set(x, "bottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLeftRadius(value: Double): Self = StObject.set(x, "topLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopRightRadius(value: Double): Self = StObject.set(x, "topRightRadius", value.asInstanceOf[js.Any])
  }
}
