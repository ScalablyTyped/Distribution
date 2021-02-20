package typings.fancybox

import typings.jquery.JQueryAjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxAjaxOption extends StObject {
  
  /**
    * Object containing settings for ajax request
    */
  var settings: JQueryAjaxSettings = js.native
}
object FancyBoxAjaxOption {
  
  @scala.inline
  def apply(settings: JQueryAjaxSettings): FancyBoxAjaxOption = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxAjaxOption]
  }
  
  @scala.inline
  implicit class FancyBoxAjaxOptionMutableBuilder[Self <: FancyBoxAjaxOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettings(value: JQueryAjaxSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
  }
}
