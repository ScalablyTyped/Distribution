package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

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
    if (embedHeight != null) __obj.updateDynamic("embedHeight")(embedHeight.asInstanceOf[js.Any])
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml.asInstanceOf[js.Any])
    if (embedWidth != null) __obj.updateDynamic("embedWidth")(embedWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayer]
  }
}

