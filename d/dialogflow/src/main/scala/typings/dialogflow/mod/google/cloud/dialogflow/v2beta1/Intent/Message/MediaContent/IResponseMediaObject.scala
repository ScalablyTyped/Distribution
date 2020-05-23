package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IImage
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
    contentUrl: js.UndefOr[Null | String] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    icon: js.UndefOr[Null | IImage] = js.undefined,
    largeImage: js.UndefOr[Null | IImage] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IResponseMediaObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentUrl)) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(largeImage)) __obj.updateDynamic("largeImage")(largeImage.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponseMediaObject]
  }
}

