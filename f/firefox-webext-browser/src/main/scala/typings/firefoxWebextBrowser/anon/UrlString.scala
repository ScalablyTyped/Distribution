package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlString extends js.Object {
  /** The URL to remove. */
  var url: String
}

object UrlString {
  @scala.inline
  def apply(url: String): UrlString = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlString]
  }
}

