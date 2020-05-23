package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SelectItemInfo. */
trait ISelectItemInfo extends js.Object {
  /** SelectItemInfo key */
  var key: js.UndefOr[String | Null] = js.undefined
  /** SelectItemInfo synonyms */
  var synonyms: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object ISelectItemInfo {
  @scala.inline
  def apply(
    key: js.UndefOr[Null | String] = js.undefined,
    synonyms: js.UndefOr[Null | js.Array[String]] = js.undefined
  ): ISelectItemInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectItemInfo]
  }
}

