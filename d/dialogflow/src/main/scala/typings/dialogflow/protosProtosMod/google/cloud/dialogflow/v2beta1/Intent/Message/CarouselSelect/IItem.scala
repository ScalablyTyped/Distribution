package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.CarouselSelect

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.IImage
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.ISelectItemInfo
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
    description: String = null,
    image: IImage = null,
    info: ISelectItemInfo = null,
    title: String = null
  ): IItem = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    if (info != null) __obj.updateDynamic("info")(info)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IItem]
  }
}

