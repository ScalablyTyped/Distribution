package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrlString extends js.Object {
  /** The URL to remove. */
  var url: String
}

object AnonUrlString {
  @scala.inline
  def apply(url: String): AnonUrlString = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrlString]
  }
}

