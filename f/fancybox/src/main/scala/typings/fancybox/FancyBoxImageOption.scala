package typings.fancybox

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
  var preload: Boolean
}

object FancyBoxImageOption {
  @scala.inline
  def apply(preload: Boolean): FancyBoxImageOption = {
    val __obj = js.Dynamic.literal(preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxImageOption]
  }
}

