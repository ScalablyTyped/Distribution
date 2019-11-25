package typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.protobuf.FieldDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Label extends js.Object

/** Label enum. */
@JSImport("@google-cloud/pubsub/build/proto/iam", "google.protobuf.FieldDescriptorProto.Label")
@js.native
object Label extends js.Object {
  @js.native
  sealed trait LABEL_OPTIONAL extends Label
  
  @js.native
  sealed trait LABEL_REPEATED extends Label
  
  @js.native
  sealed trait LABEL_REQUIRED extends Label
  
  /* 1 */ val LABEL_OPTIONAL: typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.protobuf.FieldDescriptorProto.Label.LABEL_OPTIONAL with Double = js.native
  /* 3 */ val LABEL_REPEATED: typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REPEATED with Double = js.native
  /* 2 */ val LABEL_REQUIRED: typings.atGoogleDashCloudPubsub.buildProtoIamMod.google.protobuf.FieldDescriptorProto.Label.LABEL_REQUIRED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Label with Double] = js.native
}

