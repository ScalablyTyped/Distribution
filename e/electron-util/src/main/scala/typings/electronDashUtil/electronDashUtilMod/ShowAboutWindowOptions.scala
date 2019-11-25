package typings.electronDashUtil.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowAboutWindowOptions extends js.Object {
  /**
  	The copyright text.
  	*/
  val copyright: js.UndefOr[String] = js.undefined
  /**
  	An absolute path to the app icon.
  	Only used on Linux and Windows.
  	*/
  val icon: js.UndefOr[String] = js.undefined
  /**
  	Some additional text if needed.
  	Only used on Windows.
  	*/
  val text: js.UndefOr[String] = js.undefined
  /**
  	Customizable for localization. Used in the menu item label and window title (Windows-only).
  	The app name is automatically appended at runtime.
  	Only used on Linux and Windows.
  	@default 'About'
  	*/
  val title: js.UndefOr[String] = js.undefined
  /**
  	The URL to the app's website.
  	Only used on Linux.
  	*/
  val website: js.UndefOr[String] = js.undefined
}

object ShowAboutWindowOptions {
  @scala.inline
  def apply(
    copyright: String = null,
    icon: String = null,
    text: String = null,
    title: String = null,
    website: String = null
  ): ShowAboutWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (website != null) __obj.updateDynamic("website")(website.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAboutWindowOptions]
  }
}

