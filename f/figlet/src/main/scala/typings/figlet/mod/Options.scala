package typings.figlet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var font: js.UndefOr[Fonts_] = js.native
  var horizontalLayout: js.UndefOr[KerningMethods] = js.native
  var printDirection: js.UndefOr[PrintDirection] = js.native
  var showHardBlanks: js.UndefOr[Boolean] = js.native
  var verticalLayout: js.UndefOr[KerningMethods] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFont(value: Fonts_): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalLayout(value: KerningMethods): Self = this.set("horizontalLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalLayout: Self = this.set("horizontalLayout", js.undefined)
    @scala.inline
    def setPrintDirection(value: PrintDirection): Self = this.set("printDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrintDirection: Self = this.set("printDirection", js.undefined)
    @scala.inline
    def setShowHardBlanks(value: Boolean): Self = this.set("showHardBlanks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHardBlanks: Self = this.set("showHardBlanks", js.undefined)
    @scala.inline
    def setVerticalLayout(value: KerningMethods): Self = this.set("verticalLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalLayout: Self = this.set("verticalLayout", js.undefined)
  }
  
}

