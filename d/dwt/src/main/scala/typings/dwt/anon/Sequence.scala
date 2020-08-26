package typings.dwt.anon

import typings.dwt.dwtNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sequence extends js.Object {
   // Example: 'viewMenu'
  var iconClass: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var onButtonClick: js.UndefOr[String] = js.native
   // Example: 'icon-wipe'
  var sequence: js.UndefOr[`6`] = js.native
  var visibility: js.UndefOr[Boolean] = js.native
}

object Sequence {
  @scala.inline
  def apply(): Sequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sequence]
  }
  @scala.inline
  implicit class SequenceOps[Self <: Sequence] (val x: Self) extends AnyVal {
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setOnButtonClick(value: String): Self = this.set("onButtonClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnButtonClick: Self = this.set("onButtonClick", js.undefined)
    @scala.inline
    def setSequence(value: `6`): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    @scala.inline
    def setVisibility(value: Boolean): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

