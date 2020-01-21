package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmMedia. */
trait IRbmMedia extends js.Object {
  /** RbmMedia fileUri */
  var fileUri: js.UndefOr[String | Null] = js.undefined
  /** RbmMedia height */
  var height: js.UndefOr[Height | Null] = js.undefined
  /** RbmMedia thumbnailUri */
  var thumbnailUri: js.UndefOr[String | Null] = js.undefined
}

object IRbmMedia {
  @scala.inline
  def apply(fileUri: String = null, height: Height = null, thumbnailUri: String = null): IRbmMedia = {
    val __obj = js.Dynamic.literal()
    if (fileUri != null) __obj.updateDynamic("fileUri")(fileUri.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (thumbnailUri != null) __obj.updateDynamic("thumbnailUri")(thumbnailUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmMedia]
  }
}

