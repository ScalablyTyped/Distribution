package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxImageOption extends js.Object {
  /**
    * Wait for images to load before displaying
    *   true  - wait for image to load and then display;
    *   false - display thumbnail and load the full-sized image over top,
    *               requires predefined image dimensions (`data-width` and `data-height` attributes)
    */
  var preload: Boolean = js.native
}

object FancyBoxImageOption {
  @scala.inline
  def apply(preload: Boolean): FancyBoxImageOption = {
    val __obj = js.Dynamic.literal(preload = preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxImageOption]
  }
  @scala.inline
  implicit class FancyBoxImageOptionOps[Self <: FancyBoxImageOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
  }
  
}

