package typings.googleProtobuf.mod.BinaryConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WireType extends js.Object
@JSImport("google-protobuf", "BinaryConstants.WireType")
@js.native
object WireType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WireType with Double] = js.native
  
  @js.native
  sealed trait DELIMITED extends WireType
  /* 2 */ @js.native
  object DELIMITED extends TopLevel[DELIMITED with Double]
  
  @js.native
  sealed trait END_GROUP extends WireType
  /* 4 */ @js.native
  object END_GROUP extends TopLevel[END_GROUP with Double]
  
  @js.native
  sealed trait FIXED32 extends WireType
  /* 5 */ @js.native
  object FIXED32 extends TopLevel[FIXED32 with Double]
  
  @js.native
  sealed trait FIXED64 extends WireType
  /* 1 */ @js.native
  object FIXED64 extends TopLevel[FIXED64 with Double]
  
  @js.native
  sealed trait INVALID extends WireType
  /* -1 */ @js.native
  object INVALID extends TopLevel[INVALID with Double]
  
  @js.native
  sealed trait START_GROUP extends WireType
  /* 3 */ @js.native
  object START_GROUP extends TopLevel[START_GROUP with Double]
  
  @js.native
  sealed trait VARINT extends WireType
  /* 0 */ @js.native
  object VARINT extends TopLevel[VARINT with Double]
}
