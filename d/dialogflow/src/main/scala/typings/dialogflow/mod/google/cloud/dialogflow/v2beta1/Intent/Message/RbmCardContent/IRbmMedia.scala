package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmMedia. */
trait IRbmMedia extends js.Object {
  /** RbmMedia fileUri */
  var fileUri: js.UndefOr[String | Null] = js.undefined
  /** RbmMedia height */
  var height: js.UndefOr[
    Height | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height * / any */ String) | Null
  ] = js.undefined
  /** RbmMedia thumbnailUri */
  var thumbnailUri: js.UndefOr[String | Null] = js.undefined
}

object IRbmMedia {
  @scala.inline
  def apply(
    fileUri: js.UndefOr[Null | String] = js.undefined,
    height: js.UndefOr[
      Null | Height | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.RbmMedia.Height * / any */ String)
    ] = js.undefined,
    thumbnailUri: js.UndefOr[Null | String] = js.undefined
  ): IRbmMedia = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileUri)) __obj.updateDynamic("fileUri")(fileUri.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(thumbnailUri)) __obj.updateDynamic("thumbnailUri")(thumbnailUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRbmMedia]
  }
}

