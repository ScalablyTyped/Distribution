package typings
package googleDotFeedsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait feedJSON extends js.Object {
  var author: java.lang.String
  var description: java.lang.String
  var entries: js.Array[feedEntry]
  var feedURL: java.lang.String
  var link: java.lang.String
}

object feedJSON {
  @scala.inline
  def apply(
    author: java.lang.String,
    description: java.lang.String,
    entries: js.Array[feedEntry],
    feedURL: java.lang.String,
    link: java.lang.String
  ): feedJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("entries")(entries)
    __obj.updateDynamic("feedURL")(feedURL)
    __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[feedJSON]
  }
}

