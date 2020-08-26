package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEqualizerOptions extends js.Object {
  var equalizeByRow: js.UndefOr[Boolean] = js.native
  var equalizeOn: js.UndefOr[String] = js.native
  var equalizeOnStack: js.UndefOr[Boolean] = js.native
}

object IEqualizerOptions {
  @scala.inline
  def apply(): IEqualizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEqualizerOptions]
  }
  @scala.inline
  implicit class IEqualizerOptionsOps[Self <: IEqualizerOptions] (val x: Self) extends AnyVal {
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
    def setEqualizeByRow(value: Boolean): Self = this.set("equalizeByRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualizeByRow: Self = this.set("equalizeByRow", js.undefined)
    @scala.inline
    def setEqualizeOn(value: String): Self = this.set("equalizeOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualizeOn: Self = this.set("equalizeOn", js.undefined)
    @scala.inline
    def setEqualizeOnStack(value: Boolean): Self = this.set("equalizeOnStack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualizeOnStack: Self = this.set("equalizeOnStack", js.undefined)
  }
  
}

