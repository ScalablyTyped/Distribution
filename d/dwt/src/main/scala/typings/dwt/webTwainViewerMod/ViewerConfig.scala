package typings.dwt.webTwainViewerMod

import typings.dwt.anon.AllImage
import typings.dwt.anon.AsideBackground
import typings.dwt.anon.AsideMenu
import typings.dwt.anon.AutoFit
import typings.dwt.anon.BackgroundColor
import typings.dwt.anon.Crop
import typings.dwt.anon.CropBar
import typings.dwt.anon.DisplayMode
import typings.dwt.anon.Global
import typings.dwt.anon.GoToThumbnail
import typings.dwt.anon.IfResize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewerConfig extends js.Object {
  var buttonResize: js.UndefOr[IfResize] = js.native
  var buttons: js.UndefOr[AutoFit] = js.native
  /**
    * Specify which components are shown.
    */
  var component: js.UndefOr[AsideMenu] = js.native
  var content: js.UndefOr[AllImage] = js.native
  var cropStyle: js.UndefOr[CropBar] = js.native
  var group: js.UndefOr[Global] = js.native
  var presetMode: js.UndefOr[String] = js.native
  var skinColor: js.UndefOr[AsideBackground] = js.native
  var tag: js.UndefOr[DisplayMode] = js.native
   // Example: 'basic'
  var theme: js.UndefOr[String] = js.native
  var thumbnail: js.UndefOr[BackgroundColor] = js.native
  var tipsConfig: js.UndefOr[Crop] = js.native
  var tree: js.UndefOr[GoToThumbnail] = js.native
}

object ViewerConfig {
  @scala.inline
  def apply(): ViewerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewerConfig]
  }
  @scala.inline
  implicit class ViewerConfigOps[Self <: ViewerConfig] (val x: Self) extends AnyVal {
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
    def setButtonResize(value: IfResize): Self = this.set("buttonResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonResize: Self = this.set("buttonResize", js.undefined)
    @scala.inline
    def setButtons(value: AutoFit): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setComponent(value: AsideMenu): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setContent(value: AllImage): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCropStyle(value: CropBar): Self = this.set("cropStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropStyle: Self = this.set("cropStyle", js.undefined)
    @scala.inline
    def setGroup(value: Global): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setPresetMode(value: String): Self = this.set("presetMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresetMode: Self = this.set("presetMode", js.undefined)
    @scala.inline
    def setSkinColor(value: AsideBackground): Self = this.set("skinColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkinColor: Self = this.set("skinColor", js.undefined)
    @scala.inline
    def setTag(value: DisplayMode): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setThumbnail(value: BackgroundColor): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    @scala.inline
    def setTipsConfig(value: Crop): Self = this.set("tipsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTipsConfig: Self = this.set("tipsConfig", js.undefined)
    @scala.inline
    def setTree(value: GoToThumbnail): Self = this.set("tree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTree: Self = this.set("tree", js.undefined)
  }
  
}

