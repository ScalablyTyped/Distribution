package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxAjaxOption extends js.Object {
  /**
    * Object containing settings for ajax request
    */
  var settings: jqueryLib.JQueryAjaxSettings
}

object FancyBoxAjaxOption {
  @scala.inline
  def apply(settings: jqueryLib.JQueryAjaxSettings): FancyBoxAjaxOption = {
    val __obj = js.Dynamic.literal(settings = settings)
  
    __obj.asInstanceOf[FancyBoxAjaxOption]
  }
}

