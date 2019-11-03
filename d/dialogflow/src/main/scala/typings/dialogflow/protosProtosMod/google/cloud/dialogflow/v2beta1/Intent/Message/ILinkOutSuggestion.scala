package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message

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
  def apply(destinationName: String = null, uri: String = null): ILinkOutSuggestion = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ILinkOutSuggestion]
  }
}

