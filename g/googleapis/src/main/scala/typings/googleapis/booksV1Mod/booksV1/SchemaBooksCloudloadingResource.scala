package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBooksCloudloadingResource extends js.Object {
  var author: js.UndefOr[String] = js.native
  var processingState: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var volumeId: js.UndefOr[String] = js.native
}

object SchemaBooksCloudloadingResource {
  @scala.inline
  def apply(
    author: String = null,
    processingState: String = null,
    title: String = null,
    volumeId: String = null
  ): SchemaBooksCloudloadingResource = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (processingState != null) __obj.updateDynamic("processingState")(processingState.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBooksCloudloadingResource]
  }
}

