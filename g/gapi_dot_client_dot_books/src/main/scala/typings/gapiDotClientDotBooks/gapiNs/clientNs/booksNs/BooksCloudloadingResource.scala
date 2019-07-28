package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooksCloudloadingResource extends js.Object {
  var author: js.UndefOr[String] = js.undefined
  var processingState: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var volumeId: js.UndefOr[String] = js.undefined
}

object BooksCloudloadingResource {
  @scala.inline
  def apply(
    author: String = null,
    processingState: String = null,
    title: String = null,
    volumeId: String = null
  ): BooksCloudloadingResource = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (processingState != null) __obj.updateDynamic("processingState")(processingState)
    if (title != null) __obj.updateDynamic("title")(title)
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[BooksCloudloadingResource]
  }
}

