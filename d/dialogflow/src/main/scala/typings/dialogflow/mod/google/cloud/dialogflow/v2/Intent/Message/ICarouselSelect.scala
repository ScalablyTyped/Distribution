package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.IItem
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
  def apply(items: js.UndefOr[Null | js.Array[IItem]] = js.undefined): ICarouselSelect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICarouselSelect]
  }
}

