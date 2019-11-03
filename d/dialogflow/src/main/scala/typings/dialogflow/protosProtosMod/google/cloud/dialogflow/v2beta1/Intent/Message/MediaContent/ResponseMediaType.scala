package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResponseMediaType extends js.Object

/** ResponseMediaType enum. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType")
@js.native
object ResponseMediaType extends js.Object {
  @js.native
  sealed trait AUDIO extends ResponseMediaType
  
  @js.native
  sealed trait RESPONSE_MEDIA_TYPE_UNSPECIFIED extends ResponseMediaType
  
  /* 1 */ val AUDIO: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType.AUDIO with Double = js.native
  /* 0 */ val RESPONSE_MEDIA_TYPE_UNSPECIFIED: typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent.ResponseMediaType.RESPONSE_MEDIA_TYPE_UNSPECIFIED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseMediaType with Double] = js.native
}

