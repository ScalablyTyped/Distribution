package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Label extends js.Object

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto.Label")
@js.native
object Label extends js.Object {
  @js.native
  sealed trait LABEL_OPTIONAL extends Label
  
  @js.native
  sealed trait LABEL_REPEATED extends Label
  
  @js.native
  sealed trait LABEL_REQUIRED extends Label
  
  /* 1 */ val LABEL_OPTIONAL: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.Label.LABEL_OPTIONAL with Double = js.native
  /* 3 */ val LABEL_REPEATED: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.Label.LABEL_REPEATED with Double = js.native
  /* 2 */ val LABEL_REQUIRED: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldDescriptorProto.Label.LABEL_REQUIRED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Label with Double] = js.native
}

