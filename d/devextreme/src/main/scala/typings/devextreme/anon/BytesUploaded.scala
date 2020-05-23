package typings.devextreme.anon

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesUploaded extends js.Object {
  var bytesUploaded: js.UndefOr[Double] = js.undefined
  var chunkBlob: js.UndefOr[Blob] = js.undefined
  var chunkCount: js.UndefOr[Double] = js.undefined
  var chunkIndex: js.UndefOr[Double] = js.undefined
  var customData: js.UndefOr[js.Any] = js.undefined
}

object BytesUploaded {
  @scala.inline
  def apply(
    bytesUploaded: js.UndefOr[Double] = js.undefined,
    chunkBlob: Blob = null,
    chunkCount: js.UndefOr[Double] = js.undefined,
    chunkIndex: js.UndefOr[Double] = js.undefined,
    customData: js.Any = null
  ): BytesUploaded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytesUploaded)) __obj.updateDynamic("bytesUploaded")(bytesUploaded.get.asInstanceOf[js.Any])
    if (chunkBlob != null) __obj.updateDynamic("chunkBlob")(chunkBlob.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkCount)) __obj.updateDynamic("chunkCount")(chunkCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkIndex)) __obj.updateDynamic("chunkIndex")(chunkIndex.get.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesUploaded]
  }
}

