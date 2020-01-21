package typings.googleFeeds

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
    val __obj = js.Dynamic.literal(feed = feed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (xmlDocument != null) __obj.updateDynamic("xmlDocument")(xmlDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedResult]
  }
}

