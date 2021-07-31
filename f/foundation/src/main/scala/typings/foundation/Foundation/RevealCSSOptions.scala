package typings.foundation.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://foundation.zurb.com/docs/components/reveal.html
trait RevealCSSOptions extends StObject {
  
  var display: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var visibility: js.UndefOr[String] = js.undefined
}
object RevealCSSOptions {
  
  @scala.inline
  def apply(): RevealCSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevealCSSOptions]
  }
  
  @scala.inline
  implicit class RevealCSSOptionsMutableBuilder[Self <: RevealCSSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
