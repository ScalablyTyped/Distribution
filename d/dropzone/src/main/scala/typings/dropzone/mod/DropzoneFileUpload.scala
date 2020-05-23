package typings.dropzone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneFileUpload extends js.Object {
  var bytesSent: Double
  var progress: Double
  var total: Double
  var totalChunkCount: js.UndefOr[Double] = js.undefined
  var uuid: String
}

object DropzoneFileUpload {
  @scala.inline
  def apply(
    bytesSent: Double,
    progress: Double,
    total: Double,
    uuid: String,
    totalChunkCount: js.UndefOr[Double] = js.undefined
  ): DropzoneFileUpload = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    if (!js.isUndefined(totalChunkCount)) __obj.updateDynamic("totalChunkCount")(totalChunkCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneFileUpload]
  }
}

