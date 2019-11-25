package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TitleUrlString extends js.Object {
  /** The new title for the URL. */
  var title: String
  /** The URL for which the title has changed */
  var url: String
}

object Anon_TitleUrlString {
  @scala.inline
  def apply(title: String, url: String): Anon_TitleUrlString = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TitleUrlString]
  }
}

