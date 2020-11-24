package typings.googleProtobuf.typePbMod.Field

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Kind extends js.Object
@JSImport("google-protobuf/google/protobuf/type_pb", "Field.Kind")
@js.native
object Kind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Kind with Double] = js.native
  
  @js.native
  sealed trait TYPE_BOOL extends Kind
  /* 8 */ @js.native
  object TYPE_BOOL extends TopLevel[TYPE_BOOL with Double]
  
  @js.native
  sealed trait TYPE_BYTES extends Kind
  /* 12 */ @js.native
  object TYPE_BYTES extends TopLevel[TYPE_BYTES with Double]
  
  @js.native
  sealed trait TYPE_DOUBLE extends Kind
  /* 1 */ @js.native
  object TYPE_DOUBLE extends TopLevel[TYPE_DOUBLE with Double]
  
  @js.native
  sealed trait TYPE_ENUM extends Kind
  /* 14 */ @js.native
  object TYPE_ENUM extends TopLevel[TYPE_ENUM with Double]
  
  @js.native
  sealed trait TYPE_FIXED32 extends Kind
  /* 7 */ @js.native
  object TYPE_FIXED32 extends TopLevel[TYPE_FIXED32 with Double]
  
  @js.native
  sealed trait TYPE_FIXED64 extends Kind
  /* 6 */ @js.native
  object TYPE_FIXED64 extends TopLevel[TYPE_FIXED64 with Double]
  
  @js.native
  sealed trait TYPE_FLOAT extends Kind
  /* 2 */ @js.native
  object TYPE_FLOAT extends TopLevel[TYPE_FLOAT with Double]
  
  @js.native
  sealed trait TYPE_GROUP extends Kind
  /* 10 */ @js.native
  object TYPE_GROUP extends TopLevel[TYPE_GROUP with Double]
  
  @js.native
  sealed trait TYPE_INT32 extends Kind
  /* 5 */ @js.native
  object TYPE_INT32 extends TopLevel[TYPE_INT32 with Double]
  
  @js.native
  sealed trait TYPE_INT64 extends Kind
  /* 3 */ @js.native
  object TYPE_INT64 extends TopLevel[TYPE_INT64 with Double]
  
  @js.native
  sealed trait TYPE_MESSAGE extends Kind
  /* 11 */ @js.native
  object TYPE_MESSAGE extends TopLevel[TYPE_MESSAGE with Double]
  
  @js.native
  sealed trait TYPE_SFIXED32 extends Kind
  /* 15 */ @js.native
  object TYPE_SFIXED32 extends TopLevel[TYPE_SFIXED32 with Double]
  
  @js.native
  sealed trait TYPE_SFIXED64 extends Kind
  /* 16 */ @js.native
  object TYPE_SFIXED64 extends TopLevel[TYPE_SFIXED64 with Double]
  
  @js.native
  sealed trait TYPE_SINT32 extends Kind
  /* 17 */ @js.native
  object TYPE_SINT32 extends TopLevel[TYPE_SINT32 with Double]
  
  @js.native
  sealed trait TYPE_SINT64 extends Kind
  /* 18 */ @js.native
  object TYPE_SINT64 extends TopLevel[TYPE_SINT64 with Double]
  
  @js.native
  sealed trait TYPE_STRING extends Kind
  /* 9 */ @js.native
  object TYPE_STRING extends TopLevel[TYPE_STRING with Double]
  
  @js.native
  sealed trait TYPE_UINT32 extends Kind
  /* 13 */ @js.native
  object TYPE_UINT32 extends TopLevel[TYPE_UINT32 with Double]
  
  @js.native
  sealed trait TYPE_UINT64 extends Kind
  /* 4 */ @js.native
  object TYPE_UINT64 extends TopLevel[TYPE_UINT64 with Double]
  
  @js.native
  sealed trait TYPE_UNKNOWN extends Kind
  /* 0 */ @js.native
  object TYPE_UNKNOWN extends TopLevel[TYPE_UNKNOWN with Double]
}
