package typings
package electronDashUtilLib.electronDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowAboutWindowOptions extends js.Object {
  /**
  	The copyright text.
  	*/
  val copyright: js.UndefOr[java.lang.String] = js.undefined
  /**
  	An absolute path to the app icon.
  	*/
  val icon: js.UndefOr[java.lang.String] = js.undefined
  /**
  	Some additional text if needed.
  	*/
  val text: js.UndefOr[java.lang.String] = js.undefined
  /**
  	Customizable for localization. Used in the menu item label and window title.
  	The app name is automatically appended at runtime.
  	@default 'about'
  	*/
  val title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	The URL to the app's website.
  	For Linux only.
  	*/
  val website: js.UndefOr[java.lang.String] = js.undefined
}

object ShowAboutWindowOptions {
  @scala.inline
  def apply(
    copyright: java.lang.String = null,
    icon: java.lang.String = null,
    text: java.lang.String = null,
    title: java.lang.String = null,
    website: java.lang.String = null
  ): ShowAboutWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[ShowAboutWindowOptions]
  }
}

