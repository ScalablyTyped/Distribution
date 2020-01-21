package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.MediaContent

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseMediaType with Double] = js.native
  /* 1 */ @js.native
  object AUDIO extends TopLevel[AUDIO with Double]
  
  /* 0 */ @js.native
  object RESPONSE_MEDIA_TYPE_UNSPECIFIED extends TopLevel[RESPONSE_MEDIA_TYPE_UNSPECIFIED with Double]
  
}

