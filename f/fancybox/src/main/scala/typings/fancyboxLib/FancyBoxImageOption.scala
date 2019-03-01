package typings
package fancyboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxImageOption extends js.Object {
  /**
    * Wait for images to load before displaying
    *   true  - wait for image to load and then display;
    *   false - display thumbnail and load the full-sized image over top,
    *               requires predefined image dimensions (`data-width` and `data-height` attributes)
    */
  var preload: scala.Boolean
}

object FancyBoxImageOption {
  @scala.inline
  def apply(preload: scala.Boolean): FancyBoxImageOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preload")(preload)
    __obj.asInstanceOf[FancyBoxImageOption]
  }
}

