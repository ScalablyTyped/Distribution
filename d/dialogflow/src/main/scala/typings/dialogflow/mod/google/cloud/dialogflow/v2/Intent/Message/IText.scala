package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Text. */
trait IText extends js.Object {
  /** Text text */
  var text: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IText {
  @scala.inline
  def apply(text: js.Array[String] = null): IText = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IText]
  }
}

