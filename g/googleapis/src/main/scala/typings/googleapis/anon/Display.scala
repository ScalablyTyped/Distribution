package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Display extends js.Object {
  var display: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var iconLink: js.UndefOr[String] = js.native
  var link: js.UndefOr[String] = js.native
  var preferences: js.UndefOr[StringDictionary[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Display {
  @scala.inline
  def apply(
    display: String = null,
    height: js.UndefOr[Double] = js.undefined,
    iconLink: String = null,
    link: String = null,
    preferences: StringDictionary[String] = null,
    title: String = null,
    `type`: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Display = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (iconLink != null) __obj.updateDynamic("iconLink")(iconLink.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (preferences != null) __obj.updateDynamic("preferences")(preferences.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
}

