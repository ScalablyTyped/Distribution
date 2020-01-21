package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a QuickReplies. */
trait IQuickReplies extends js.Object {
  /** QuickReplies quickReplies */
  var quickReplies: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** QuickReplies title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IQuickReplies {
  @scala.inline
  def apply(quickReplies: js.Array[String] = null, title: String = null): IQuickReplies = {
    val __obj = js.Dynamic.literal()
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuickReplies]
  }
}

