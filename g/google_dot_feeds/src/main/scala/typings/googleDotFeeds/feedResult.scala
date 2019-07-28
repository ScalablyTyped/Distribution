package typings.googleDotFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait feedResult extends js.Object {
  var error: js.UndefOr[feedError] = js.undefined
  var feed: feedJSON
  var xmlDocument: js.UndefOr[String] = js.undefined
}

object feedResult {
  @scala.inline
  def apply(feed: feedJSON, error: feedError = null, xmlDocument: String = null): feedResult = {
    val __obj = js.Dynamic.literal(feed = feed)
    if (error != null) __obj.updateDynamic("error")(error)
    if (xmlDocument != null) __obj.updateDynamic("xmlDocument")(xmlDocument)
    __obj.asInstanceOf[feedResult]
  }
}

