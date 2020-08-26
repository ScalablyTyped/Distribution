package typings.electronUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowAboutWindowOptions extends js.Object {
  /**
  	The copyright text.
  	*/
  val copyright: js.UndefOr[String] = js.native
  /**
  	An absolute path to the app icon.
  	Only used on Linux and Windows.
  	*/
  val icon: js.UndefOr[String] = js.native
  /**
  	Some additional text if needed.
  	Only used on Windows.
  	*/
  val text: js.UndefOr[String] = js.native
  /**
  	Customizable for localization. Used in the menu item label and window title (Windows-only).
  	The app name is automatically appended at runtime.
  	Only used on Linux and Windows.
  	@default 'About'
  	*/
  val title: js.UndefOr[String] = js.native
  /**
  	The URL to the app's website.
  	Only used on Linux.
  	*/
  val website: js.UndefOr[String] = js.native
}

object ShowAboutWindowOptions {
  @scala.inline
  def apply(): ShowAboutWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowAboutWindowOptions]
  }
  @scala.inline
  implicit class ShowAboutWindowOptionsOps[Self <: ShowAboutWindowOptions] (val x: Self) extends AnyVal {
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
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
  
}

