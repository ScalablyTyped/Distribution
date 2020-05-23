package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.TrainingPhrase

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
    alias: js.UndefOr[Null | String] = js.undefined,
    entityType: js.UndefOr[Null | String] = js.undefined,
    text: js.UndefOr[Null | String] = js.undefined,
    userDefined: js.UndefOr[Null | Boolean] = js.undefined
  ): IPart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(entityType)) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(userDefined)) __obj.updateDynamic("userDefined")(userDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPart]
  }
}

