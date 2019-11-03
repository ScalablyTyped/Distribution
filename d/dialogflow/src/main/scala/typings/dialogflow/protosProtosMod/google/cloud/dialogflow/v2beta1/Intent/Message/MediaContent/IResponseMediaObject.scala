package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.IImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ResponseMediaObject. */
trait IResponseMediaObject extends js.Object {
  /** ResponseMediaObject contentUrl */
  var contentUrl: js.UndefOr[String | Null] = js.undefined
  /** ResponseMediaObject description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** ResponseMediaObject icon */
  var icon: js.UndefOr[IImage | Null] = js.undefined
  /** ResponseMediaObject largeImage */
  var largeImage: js.UndefOr[IImage | Null] = js.undefined
  /** ResponseMediaObject name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IResponseMediaObject {
  @scala.inline
  def apply(
    contentUrl: String = null,
    description: String = null,
    icon: IImage = null,
    largeImage: IImage = null,
    name: String = null
  ): IResponseMediaObject = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (description != null) __obj.updateDynamic("description")(description)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (largeImage != null) __obj.updateDynamic("largeImage")(largeImage)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IResponseMediaObject]
  }
}

