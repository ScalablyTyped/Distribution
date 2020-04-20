package typings.gapiPlus.gapi.client.plus.people

import typings.gapiPlus.gapiPlusStrings.plusNumbersignpeopleFeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Search response
trait PeopleFeed extends js.Object {
  var etag: String
  var items: js.Array[Person]
  var kind: plusNumbersignpeopleFeed
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
    kind: plusNumbersignpeopleFeed,
    nextPageToken: String,
    selfLink: String,
    title: String,
    totalItems: Double
  ): PeopleFeed = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeopleFeed]
  }
}

