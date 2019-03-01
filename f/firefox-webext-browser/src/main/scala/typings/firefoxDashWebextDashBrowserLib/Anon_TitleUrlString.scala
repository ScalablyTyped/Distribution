package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TitleUrlString extends js.Object {
  /** The new title for the URL. */
  var title: java.lang.String
  /** The URL for which the title has changed */
  var url: java.lang.String
}

object Anon_TitleUrlString {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String): Anon_TitleUrlString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_TitleUrlString]
  }
}

