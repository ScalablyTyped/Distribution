package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TableCardCell. */
trait ITableCardCell extends js.Object {
  /** TableCardCell text */
  var text: js.UndefOr[String | Null] = js.undefined
}

object ITableCardCell {
  @scala.inline
  def apply(text: String = null): ITableCardCell = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ITableCardCell]
  }
}

