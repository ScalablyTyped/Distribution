package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Part. */
trait IPart extends js.Object {
  /** Part alias */
  var alias: js.UndefOr[String | Null] = js.undefined
  /** Part entityType */
  var entityType: js.UndefOr[String | Null] = js.undefined
  /** Part text */
  var text: js.UndefOr[String | Null] = js.undefined
  /** Part userDefined */
  var userDefined: js.UndefOr[Boolean | Null] = js.undefined
}

object IPart {
  @scala.inline
  def apply(
    alias: String = null,
    entityType: String = null,
    text: String = null,
    userDefined: js.UndefOr[Boolean] = js.undefined
  ): IPart = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (entityType != null) __obj.updateDynamic("entityType")(entityType)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(userDefined)) __obj.updateDynamic("userDefined")(userDefined)
    __obj.asInstanceOf[IPart]
  }
}

