package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CornerMixin extends StObject {
  
  var cornerRadius: Double | js.Symbol = js.native
  
  var cornerSmoothing: Double = js.native
}
object CornerMixin {
  
  @scala.inline
  def apply(cornerRadius: Double | js.Symbol, cornerSmoothing: Double): CornerMixin = {
    val __obj = js.Dynamic.literal(cornerRadius = cornerRadius.asInstanceOf[js.Any], cornerSmoothing = cornerSmoothing.asInstanceOf[js.Any])
    __obj.asInstanceOf[CornerMixin]
  }
  
  @scala.inline
  implicit class CornerMixinMutableBuilder[Self <: CornerMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerRadius(value: Double | js.Symbol): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerSmoothing(value: Double): Self = StObject.set(x, "cornerSmoothing", value.asInstanceOf[js.Any])
  }
}
