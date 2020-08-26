package typings.fineUploader.mod

import typings.fineUploader.coreMod.ScalingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIScalingOptions extends ScalingOptions {
  /**
    * Set this to true if you do not want any scaled images to be displayed in the file list
    *
    * @default `false`
    */
  var hideScaled: js.UndefOr[Boolean] = js.native
}

object UIScalingOptions {
  @scala.inline
  def apply(): UIScalingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIScalingOptions]
  }
  @scala.inline
  implicit class UIScalingOptionsOps[Self <: UIScalingOptions] (val x: Self) extends AnyVal {
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
    def setHideScaled(value: Boolean): Self = this.set("hideScaled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideScaled: Self = this.set("hideScaled", js.undefined)
  }
  
}

