package typings.fancybox

import typings.jquery.JQueryAjaxSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxAjaxOption extends js.Object {
  /**
    * Object containing settings for ajax request
    */
  var settings: JQueryAjaxSettings
}

object FancyBoxAjaxOption {
  @scala.inline
  def apply(settings: JQueryAjaxSettings): FancyBoxAjaxOption = {
    val __obj = js.Dynamic.literal(settings = settings)
  
    __obj.asInstanceOf[FancyBoxAjaxOption]
  }
}

