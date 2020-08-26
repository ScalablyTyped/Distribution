package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.IconPath
import typings.firefoxWebextBrowser.browser.manifest.MatchPattern
import typings.firefoxWebextBrowser.browser.manifest.MatchPatternRestricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Defaulticon extends js.Object {
  var browser_style: js.UndefOr[Boolean] = js.native
  var default_icon: js.UndefOr[IconPath] = js.native
  var default_popup: js.UndefOr[String] = js.native
  var default_title: js.UndefOr[String] = js.native
  var hide_matches: js.UndefOr[js.Array[MatchPatternRestricted]] = js.native
  var pinned: js.UndefOr[Boolean] = js.native
  var show_matches: js.UndefOr[js.Array[MatchPattern]] = js.native
}

object Defaulticon {
  @scala.inline
  def apply(): Defaulticon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaulticon]
  }
  @scala.inline
  implicit class DefaulticonOps[Self <: Defaulticon] (val x: Self) extends AnyVal {
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
    def setBrowser_style(value: Boolean): Self = this.set("browser_style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser_style: Self = this.set("browser_style", js.undefined)
    @scala.inline
    def setDefault_icon(value: IconPath): Self = this.set("default_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_icon: Self = this.set("default_icon", js.undefined)
    @scala.inline
    def setDefault_popup(value: String): Self = this.set("default_popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_popup: Self = this.set("default_popup", js.undefined)
    @scala.inline
    def setDefault_title(value: String): Self = this.set("default_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_title: Self = this.set("default_title", js.undefined)
    @scala.inline
    def setHide_matchesVarargs(value: MatchPatternRestricted*): Self = this.set("hide_matches", js.Array(value :_*))
    @scala.inline
    def setHide_matches(value: js.Array[MatchPatternRestricted]): Self = this.set("hide_matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide_matches: Self = this.set("hide_matches", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setShow_matchesVarargs(value: MatchPattern*): Self = this.set("show_matches", js.Array(value :_*))
    @scala.inline
    def setShow_matches(value: js.Array[MatchPattern]): Self = this.set("show_matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow_matches: Self = this.set("show_matches", js.undefined)
  }
  
}

