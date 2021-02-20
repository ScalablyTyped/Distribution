package typings.fancybox

import typings.fancybox.fancyboxStrings.x
import typings.fancybox.fancyboxStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyThumbsOptions extends StObject {
  
  /**
    * Display thumbnails on opening
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertical (y) or horizontal (x) scrolling
    */
  var axis: js.UndefOr[x | y] = js.native
  
  /**
    * Hide thumbnail grid when closing animation starts
    */
  var hideOnClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[String] = js.native
}
object FancyThumbsOptions {
  
  @scala.inline
  def apply(): FancyThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyThumbsOptions]
  }
  
  @scala.inline
  implicit class FancyThumbsOptionsMutableBuilder[Self <: FancyThumbsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    @scala.inline
    def setAxis(value: typings.fancybox.fancyboxStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setHideOnClose(value: Boolean): Self = StObject.set(x, "hideOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnCloseUndefined: Self = StObject.set(x, "hideOnClose", js.undefined)
    
    @scala.inline
    def setParentEl(value: String): Self = StObject.set(x, "parentEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElUndefined: Self = StObject.set(x, "parentEl", js.undefined)
  }
}
