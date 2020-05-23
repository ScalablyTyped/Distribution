package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.CarouselSelect

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.IImage
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ISelectItemInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Item. */
trait IItem extends js.Object {
  /** Item description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** Item image */
  var image: js.UndefOr[IImage | Null] = js.undefined
  /** Item info */
  var info: js.UndefOr[ISelectItemInfo | Null] = js.undefined
  /** Item title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    description: js.UndefOr[Null | String] = js.undefined,
    image: js.UndefOr[Null | IImage] = js.undefined,
    info: js.UndefOr[Null | ISelectItemInfo] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): IItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
}

