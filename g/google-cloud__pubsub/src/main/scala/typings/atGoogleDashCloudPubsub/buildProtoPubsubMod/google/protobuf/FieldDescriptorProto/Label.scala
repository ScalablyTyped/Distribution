package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.protobuf.FieldDescriptorProto

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Label extends js.Object

/** Label enum. */
@JSImport("@google-cloud/pubsub/build/proto/pubsub", "google.protobuf.FieldDescriptorProto.Label")
@js.native
object Label extends js.Object {
  @js.native
  sealed trait LABEL_OPTIONAL extends Label
  
  @js.native
  sealed trait LABEL_REPEATED extends Label
  
  @js.native
  sealed trait LABEL_REQUIRED extends Label
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Label with Double] = js.native
  /* 1 */ @js.native
  object LABEL_OPTIONAL extends TopLevel[LABEL_OPTIONAL with Double]
  
  /* 3 */ @js.native
  object LABEL_REPEATED extends TopLevel[LABEL_REPEATED with Double]
  
  /* 2 */ @js.native
  object LABEL_REQUIRED extends TopLevel[LABEL_REQUIRED with Double]
  
}

