package typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WireType extends js.Object

@JSImport("google-protobuf", "BinaryConstants.WireType")
@js.native
object WireType extends js.Object {
  @js.native
  sealed trait DELIMITED extends WireType
  
  @js.native
  sealed trait END_GROUP extends WireType
  
  @js.native
  sealed trait FIXED32 extends WireType
  
  @js.native
  sealed trait FIXED64 extends WireType
  
  @js.native
  sealed trait INVALID extends WireType
  
  @js.native
  sealed trait START_GROUP extends WireType
  
  @js.native
  sealed trait VARINT extends WireType
  
  /* 2 */ val DELIMITED: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.DELIMITED with Double = js.native
  /* 4 */ val END_GROUP: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.END_GROUP with Double = js.native
  /* 5 */ val FIXED32: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.FIXED32 with Double = js.native
  /* 1 */ val FIXED64: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.FIXED64 with Double = js.native
  /* -1 */ val INVALID: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.INVALID with Double = js.native
  /* 3 */ val START_GROUP: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.START_GROUP with Double = js.native
  /* 0 */ val VARINT: typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.VARINT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WireType with Double] = js.native
}

