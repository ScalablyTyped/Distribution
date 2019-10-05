package typings.gapiDotPlus.gapi.client.plus.people

import typings.gapiDotPlus.gapiDotPlusStrings.`plus#peopleFeed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Search response
trait PeopleFeed extends js.Object {
  var etag: String
  var items: js.Array[Person]
  var kind: `plus#peopleFeed`
  var nextPageToken: String
  var selfLink: String
  var title: String
  var totalItems: Double
}

object PeopleFeed {
  @scala.inline
  def apply(
    etag: String,
    items: js.Array[Person],
    kind: `plus#peopleFeed`,
    nextPageToken: String,
    selfLink: String,
    title: String,
    totalItems: Double
  ): PeopleFeed = {
    val __obj = js.Dynamic.literal(etag = etag, items = items, kind = kind, nextPageToken = nextPageToken, selfLink = selfLink, title = title, totalItems = totalItems)
  
    __obj.asInstanceOf[PeopleFeed]
  }
}

