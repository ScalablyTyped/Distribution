package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayer extends js.Object {
  var embedHeight: js.UndefOr[String] = js.undefined
  var embedHtml: js.UndefOr[String] = js.undefined
  var embedWidth: js.UndefOr[String] = js.undefined
}

object VideoPlayer {
  @scala.inline
  def apply(embedHeight: String = null, embedHtml: String = null, embedWidth: String = null): VideoPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHeight != null) __obj.updateDynamic("embedHeight")(embedHeight)
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml)
    if (embedWidth != null) __obj.updateDynamic("embedWidth")(embedWidth)
    __obj.asInstanceOf[VideoPlayer]
  }
}

