package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard

import org.scalablytyped.runtime.TopLevel
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.BLURRED_BACKGROUND
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.CROPPED
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.GRAY
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.IMAGE_DISPLAY_OPTIONS_UNSPECIFIED
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.BrowseCarouselCard.ImageDisplayOptions.WHITE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImageDisplayOptions with Double] = js.native
  /* 4 */ @js.native
  object BLURRED_BACKGROUND extends TopLevel[BLURRED_BACKGROUND with Double]
  
  /* 3 */ @js.native
  object CROPPED extends TopLevel[CROPPED with Double]
  
  /* 1 */ @js.native
  object GRAY extends TopLevel[GRAY with Double]
  
  /* 0 */ @js.native
  object IMAGE_DISPLAY_OPTIONS_UNSPECIFIED extends TopLevel[IMAGE_DISPLAY_OPTIONS_UNSPECIFIED with Double]
  
  /* 2 */ @js.native
  object WHITE extends TopLevel[WHITE with Double]
  
}

