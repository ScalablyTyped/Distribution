package typings.devextreme

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesUploaded extends js.Object {
  var bytesUploaded: js.UndefOr[Double] = js.undefined
  var chunkBlob: js.UndefOr[Blob] = js.undefined
  var chunkCount: js.UndefOr[Double] = js.undefined
  var chunkIndex: js.UndefOr[Double] = js.undefined
  var customData: js.UndefOr[js.Any] = js.undefined
}

object AnonBytesUploaded {
  @scala.inline
  def apply(
    bytesUploaded: Int | Double = null,
    chunkBlob: Blob = null,
    chunkCount: Int | Double = null,
    chunkIndex: Int | Double = null,
    customData: js.Any = null
  ): AnonBytesUploaded = {
    val __obj = js.Dynamic.literal()
    if (bytesUploaded != null) __obj.updateDynamic("bytesUploaded")(bytesUploaded.asInstanceOf[js.Any])
    if (chunkBlob != null) __obj.updateDynamic("chunkBlob")(chunkBlob.asInstanceOf[js.Any])
    if (chunkCount != null) __obj.updateDynamic("chunkCount")(chunkCount.asInstanceOf[js.Any])
    if (chunkIndex != null) __obj.updateDynamic("chunkIndex")(chunkIndex.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesUploaded]
  }
}

