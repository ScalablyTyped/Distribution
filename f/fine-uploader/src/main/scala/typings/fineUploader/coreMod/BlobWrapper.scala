package typings.fineUploader.coreMod

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobWrapper extends js.Object {
  /**
    * the bytes of the `Blob` object being uploaded
    */
  var blob: js.UndefOr[Blob] = js.undefined
  /**
    * the name of the `Blob`
    */
  var name: js.UndefOr[String] = js.undefined
}

object BlobWrapper {
  @scala.inline
  def apply(blob: Blob = null, name: String = null): BlobWrapper = {
    val __obj = js.Dynamic.literal()
    if (blob != null) __obj.updateDynamic("blob")(blob.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobWrapper]
  }
}

