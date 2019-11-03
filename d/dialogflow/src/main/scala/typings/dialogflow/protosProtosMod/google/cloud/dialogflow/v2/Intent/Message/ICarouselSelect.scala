package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.IItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CarouselSelect. */
trait ICarouselSelect extends js.Object {
  /** CarouselSelect items */
  var items: js.UndefOr[js.Array[IItem] | Null] = js.undefined
}

object ICarouselSelect {
  @scala.inline
  def apply(items: js.Array[IItem] = null): ICarouselSelect = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[ICarouselSelect]
  }
}

