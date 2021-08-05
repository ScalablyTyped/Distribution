package typings.fancybox

import typings.jquery.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FancyBoxAjaxOption extends StObject {
  
  /**
    * Object containing settings for ajax request
    */
  var settings: JQueryAjaxSettings
}
object FancyBoxAjaxOption {
  
  inline def apply(settings: JQueryAjaxSettings): FancyBoxAjaxOption = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxAjaxOption]
  }
  
  extension [Self <: FancyBoxAjaxOption](x: Self) {
    
    inline def setSettings(value: JQueryAjaxSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
