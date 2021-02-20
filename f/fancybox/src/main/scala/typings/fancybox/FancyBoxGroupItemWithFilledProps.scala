package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxGroupItemWithFilledProps extends FancyBoxGroupItem {
  
  @JSName("$thumb")
  var $thumb: js.UndefOr[JQuery] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var thumb: js.UndefOr[js.Any] = js.native
}
object FancyBoxGroupItemWithFilledProps {
  
  @scala.inline
  def apply(src: String): FancyBoxGroupItemWithFilledProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItemWithFilledProps]
  }
  
  @scala.inline
  implicit class FancyBoxGroupItemWithFilledPropsMutableBuilder[Self <: FancyBoxGroupItemWithFilledProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$thumb(value: JQuery): Self = StObject.set(x, "$thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$thumbUndefined: Self = StObject.set(x, "$thumb", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setThumb(value: js.Any): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
  }
}
