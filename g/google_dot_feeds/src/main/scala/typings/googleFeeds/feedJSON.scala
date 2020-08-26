package typings.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait feedJSON extends js.Object {
  var author: String = js.native
  var description: String = js.native
  var entries: js.Array[feedEntry] = js.native
  var feedURL: String = js.native
  var link: String = js.native
}

object feedJSON {
  @scala.inline
  def apply(author: String, description: String, entries: js.Array[feedEntry], feedURL: String, link: String): feedJSON = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], feedURL = feedURL.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedJSON]
  }
  @scala.inline
  implicit class feedJSONOps[Self <: feedJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntriesVarargs(value: feedEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[feedEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeedURL(value: String): Self = this.set("feedURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
  }
  
}

