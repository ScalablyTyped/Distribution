package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a LinkOutSuggestion. */
trait ILinkOutSuggestion extends js.Object {
  /** LinkOutSuggestion destinationName */
  var destinationName: js.UndefOr[String | Null] = js.undefined
  /** LinkOutSuggestion uri */
  var uri: js.UndefOr[String | Null] = js.undefined
}

object ILinkOutSuggestion {
  @scala.inline
  def apply(
    destinationName: js.UndefOr[Null | String] = js.undefined,
    uri: js.UndefOr[Null | String] = js.undefined
  ): ILinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(destinationName)) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (!js.isUndefined(uri)) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkOutSuggestion]
  }
}

