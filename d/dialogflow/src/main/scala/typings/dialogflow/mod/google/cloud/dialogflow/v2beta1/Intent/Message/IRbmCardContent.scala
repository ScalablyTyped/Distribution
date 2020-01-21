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
    description: String = null,
    media: IRbmMedia = null,
    suggestions: js.Array[IRbmSuggestion] = null,
    title: String = null
  ): IRbmCardContent = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmCardContent]
  }
}

