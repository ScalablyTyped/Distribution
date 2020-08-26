package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsAlignment
import typings.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsTiling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Additionalbackgroundsalignment extends js.Object {
  var additional_backgrounds_alignment: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsAlignment]] = js.native
  var additional_backgrounds_tiling: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsTiling]] = js.native
}

object Additionalbackgroundsalignment {
  @scala.inline
  def apply(): Additionalbackgroundsalignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Additionalbackgroundsalignment]
  }
  @scala.inline
  implicit class AdditionalbackgroundsalignmentOps[Self <: Additionalbackgroundsalignment] (val x: Self) extends AnyVal {
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
    def setAdditional_backgrounds_alignmentVarargs(value: ThemeTypeAdditionalBackgroundsAlignment*): Self = this.set("additional_backgrounds_alignment", js.Array(value :_*))
    @scala.inline
    def setAdditional_backgrounds_alignment(value: js.Array[ThemeTypeAdditionalBackgroundsAlignment]): Self = this.set("additional_backgrounds_alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditional_backgrounds_alignment: Self = this.set("additional_backgrounds_alignment", js.undefined)
    @scala.inline
    def setAdditional_backgrounds_tilingVarargs(value: ThemeTypeAdditionalBackgroundsTiling*): Self = this.set("additional_backgrounds_tiling", js.Array(value :_*))
    @scala.inline
    def setAdditional_backgrounds_tiling(value: js.Array[ThemeTypeAdditionalBackgroundsTiling]): Self = this.set("additional_backgrounds_tiling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditional_backgrounds_tiling: Self = this.set("additional_backgrounds_tiling", js.undefined)
  }
  
}

