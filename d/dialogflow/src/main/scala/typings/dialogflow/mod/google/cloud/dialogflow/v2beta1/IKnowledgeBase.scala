package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a KnowledgeBase. */
trait IKnowledgeBase extends js.Object {
  /** KnowledgeBase displayName */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /** KnowledgeBase languageCode */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  /** KnowledgeBase name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IKnowledgeBase {
  @scala.inline
  def apply(
    displayName: js.UndefOr[Null | String] = js.undefined,
    languageCode: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): IKnowledgeBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(languageCode)) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKnowledgeBase]
  }
}

