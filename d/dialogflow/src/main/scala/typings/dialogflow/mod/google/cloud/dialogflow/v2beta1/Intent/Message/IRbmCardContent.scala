package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.IRbmMedia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmCardContent. */
trait IRbmCardContent extends js.Object {
  /** RbmCardContent description */
  var description: js.UndefOr[String | Null] = js.undefined
  /** RbmCardContent media */
  var media: js.UndefOr[IRbmMedia | Null] = js.undefined
  /** RbmCardContent suggestions */
  var suggestions: js.UndefOr[js.Array[IRbmSuggestion] | Null] = js.undefined
  /** RbmCardContent title */
  var title: js.UndefOr[String | Null] = js.undefined
}

object IRbmCardContent {
  @scala.inline
  def apply(
    description: js.UndefOr[Null | String] = js.undefined,
    media: js.UndefOr[Null | IRbmMedia] = js.undefined,
    suggestions: js.UndefOr[Null | js.Array[IRbmSuggestion]] = js.undefined,
    title: js.UndefOr[Null | String] = js.undefined
  ): IRbmCardContent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(media)) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (!js.isUndefined(suggestions)) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmCardContent]
  }
}

