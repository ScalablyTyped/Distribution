package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageDisplayOptions extends js.Object

/** ImageDisplayOptions enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions")
@js.native
object ImageDisplayOptions extends js.Object {
  @js.native
  sealed trait BLURRED_BACKGROUND extends ImageDisplayOptions
  
  @js.native
  sealed trait CROPPED extends ImageDisplayOptions
  
  @js.native
  sealed trait GRAY extends ImageDisplayOptions
  
  @js.native
  sealed trait IMAGE_DISPLAY_OPTIONS_UNSPECIFIED extends ImageDisplayOptions
  
  @js.native
  sealed trait WHITE extends ImageDisplayOptions
  
  /* 4 */ val BLURRED_BACKGROUND: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.BLURRED_BACKGROUND with Double = js.native
  /* 3 */ val CROPPED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.CROPPED with Double = js.native
  /* 1 */ val GRAY: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.GRAY with Double = js.native
  /* 0 */ val IMAGE_DISPLAY_OPTIONS_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.IMAGE_DISPLAY_OPTIONS_UNSPECIFIED with Double = js.native
  /* 2 */ val WHITE: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.WHITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageDisplayOptions with Double] = js.native
}

