package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooksCloudloadingResource extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var processingState: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

object BooksCloudloadingResource {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    processingState: java.lang.String = null,
    title: java.lang.String = null,
    volumeId: java.lang.String = null
  ): BooksCloudloadingResource = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (processingState != null) __obj.updateDynamic("processingState")(processingState)
    if (title != null) __obj.updateDynamic("title")(title)
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[BooksCloudloadingResource]
  }
}

