package typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants

import org.scalablytyped.runtime.TopLevel
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.DELIMITED
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.END_GROUP
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.FIXED32
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.FIXED64
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.INVALID
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.START_GROUP
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryConstants.WireType.VARINT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WireType with Double] = js.native
  /* 2 */ @js.native
  object DELIMITED extends TopLevel[DELIMITED with Double]
  
  /* 4 */ @js.native
  object END_GROUP extends TopLevel[END_GROUP with Double]
  
  /* 5 */ @js.native
  object FIXED32 extends TopLevel[FIXED32 with Double]
  
  /* 1 */ @js.native
  object FIXED64 extends TopLevel[FIXED64 with Double]
  
  /* -1 */ @js.native
  object INVALID extends TopLevel[INVALID with Double]
  
  /* 3 */ @js.native
  object START_GROUP extends TopLevel[START_GROUP with Double]
  
  /* 0 */ @js.native
  object VARINT extends TopLevel[VARINT with Double]
  
}

