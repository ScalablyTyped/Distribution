package typings.googleDotFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait feedJSON extends js.Object {
  var author: String
  var description: String
  var entries: js.Array[feedEntry]
  var feedURL: String
  var link: String
}

object feedJSON {
  @scala.inline
  def apply(author: String, description: String, entries: js.Array[feedEntry], feedURL: String, link: String): feedJSON = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], feedURL = feedURL.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[feedJSON]
  }
}

