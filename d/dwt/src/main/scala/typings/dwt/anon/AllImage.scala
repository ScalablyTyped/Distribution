package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllImage extends StObject {
  
  var allImage: js.UndefOr[DisplayName] = js.native
  
  var besides: js.UndefOr[`0`] = js.native
  
  var viewPort: js.UndefOr[`0`] = js.native
  
  var visibility: js.UndefOr[Boolean] = js.native
}
object AllImage {
  
  @scala.inline
  def apply(): AllImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllImage]
  }
  
  @scala.inline
  implicit class AllImageMutableBuilder[Self <: AllImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllImage(value: DisplayName): Self = StObject.set(x, "allImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllImageUndefined: Self = StObject.set(x, "allImage", js.undefined)
    
    @scala.inline
    def setBesides(value: `0`): Self = StObject.set(x, "besides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBesidesUndefined: Self = StObject.set(x, "besides", js.undefined)
    
    @scala.inline
    def setViewPort(value: `0`): Self = StObject.set(x, "viewPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPortUndefined: Self = StObject.set(x, "viewPort", js.undefined)
    
    @scala.inline
    def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
