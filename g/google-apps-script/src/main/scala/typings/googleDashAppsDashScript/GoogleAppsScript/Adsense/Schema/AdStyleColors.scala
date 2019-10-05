package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdStyleColors extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AdStyleColors {
  @scala.inline
  def apply(
    background: String = null,
    border: String = null,
    text: String = null,
    title: String = null,
    url: String = null
  ): AdStyleColors = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AdStyleColors]
  }
}

