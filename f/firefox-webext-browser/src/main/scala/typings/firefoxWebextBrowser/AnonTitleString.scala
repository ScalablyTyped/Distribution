package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitleString extends js.Object {
  /** The new title for the URL. */
  var title: String
  /** The URL for which the title has changed */
  var url: String
}

object AnonTitleString {
  @scala.inline
  def apply(title: String, url: String): AnonTitleString = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTitleString]
  }
}

