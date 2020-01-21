package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a KnowledgeBase. */
trait IKnowledgeBase extends js.Object {
  /** KnowledgeBase displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /** KnowledgeBase name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IKnowledgeBase {
  @scala.inline
  def apply(displayName: String = null, name: String = null): IKnowledgeBase = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnowledgeBase]
  }
}

