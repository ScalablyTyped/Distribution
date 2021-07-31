package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxImageOption extends StObject {
  
  /**
    * Wait for images to load before displaying
    *   true  - wait for image to load and then display;
    *   false - display thumbnail and load the full-sized image over top,
    *               requires predefined image dimensions (`data-width` and `data-height` attributes)
    */
  var preload: Boolean
}
object FancyBoxImageOption {
  
  @scala.inline
  def apply(preload: Boolean): FancyBoxImageOption = {
    val __obj = js.Dynamic.literal(preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxImageOption]
  }
  
  @scala.inline
  implicit class FancyBoxImageOptionMutableBuilder[Self <: FancyBoxImageOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
  }
}
