package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxIframeSettings extends StObject {
  
  /**
    * Iframe tag attributes
    */
  var attr: js.UndefOr[FancyBoxPlainObject] = js.native
  
  /**
    * Custom CSS styling for iframe wrapping element
    * You can use this to set custom iframe dimensions
    */
  var css: js.UndefOr[FancyBoxPlainObject] = js.native
  
  /**
    * Preload iframe before displaying it
    * This allows to calculate iframe content width and height
    * (note: Due to "Same Origin Policy", you can't get cross domain data).
    */
  var preload: js.UndefOr[Boolean] = js.native
  
  /**
    * Iframe template
    */
  var tpl: js.UndefOr[String] = js.native
}
object FancyBoxIframeSettings {
  
  @scala.inline
  def apply(): FancyBoxIframeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxIframeSettings]
  }
  
  @scala.inline
  implicit class FancyBoxIframeSettingsMutableBuilder[Self <: FancyBoxIframeSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: FancyBoxPlainObject): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    @scala.inline
    def setCss(value: FancyBoxPlainObject): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    @scala.inline
    def setTpl(value: String): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
