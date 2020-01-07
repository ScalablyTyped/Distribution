package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Display extends js.Object {
  var display: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var iconLink: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var preferences: js.UndefOr[StringDictionary[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Anon_Display {
  @scala.inline
  def apply(
    display: String = null,
    height: Int | Double = null,
    iconLink: String = null,
    link: String = null,
    preferences: StringDictionary[String] = null,
    title: String = null,
    `type`: String = null,
    width: Int | Double = null
  ): Anon_Display = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (preferences != null) __obj.updateDynamic("preferences")(preferences.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Display]
  }
}

