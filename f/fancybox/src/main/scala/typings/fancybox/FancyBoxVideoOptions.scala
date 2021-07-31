package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxVideoOptions extends StObject {
  
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var tpl: js.UndefOr[String] = js.undefined
}
object FancyBoxVideoOptions {
  
  @scala.inline
  def apply(): FancyBoxVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxVideoOptions]
  }
  
  @scala.inline
  implicit class FancyBoxVideoOptionsMutableBuilder[Self <: FancyBoxVideoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setTpl(value: String): Self = StObject.set(x, "tpl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTplUndefined: Self = StObject.set(x, "tpl", js.undefined)
  }
}
