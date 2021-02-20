package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpriteOptions extends StObject {
  
  var animation: js.UndefOr[js.Any] = js.native
  
  var callback: js.UndefOr[js.Function0[_]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var posx: js.UndefOr[Double] = js.native
  
  var posy: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SpriteOptions {
  
  @scala.inline
  def apply(): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpriteOptions]
  }
  
  @scala.inline
  implicit class SpriteOptionsMutableBuilder[Self <: SpriteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: js.Any): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setCallback(value: () => _): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPosx(value: Double): Self = StObject.set(x, "posx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosxUndefined: Self = StObject.set(x, "posx", js.undefined)
    
    @scala.inline
    def setPosy(value: Double): Self = StObject.set(x, "posy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosyUndefined: Self = StObject.set(x, "posy", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
