package typings.googleProtobuf.mod.BinaryConstants

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends js.Object
@JSImport("google-protobuf", "BinaryConstants.FieldType")
@js.native
object FieldType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
  
  @js.native
  sealed trait BOOL extends FieldType
  /* 8 */ @js.native
  object BOOL extends TopLevel[BOOL with Double]
  
  @js.native
  sealed trait BYTES extends FieldType
  /* 12 */ @js.native
  object BYTES extends TopLevel[BYTES with Double]
  
  @js.native
  sealed trait DOUBLE extends FieldType
  /* 1 */ @js.native
  object DOUBLE extends TopLevel[DOUBLE with Double]
  
  @js.native
  sealed trait ENUM extends FieldType
  /* 14 */ @js.native
  object ENUM extends TopLevel[ENUM with Double]
  
  @js.native
  sealed trait FHASH64 extends FieldType
  /* 30 */ @js.native
  object FHASH64 extends TopLevel[FHASH64 with Double]
  
  @js.native
  sealed trait FIXED32 extends FieldType
  /* 7 */ @js.native
  object FIXED32 extends TopLevel[FIXED32 with Double]
  
  @js.native
  sealed trait FIXED64 extends FieldType
  /* 6 */ @js.native
  object FIXED64 extends TopLevel[FIXED64 with Double]
  
  @js.native
  sealed trait FLOAT extends FieldType
  /* 2 */ @js.native
  object FLOAT extends TopLevel[FLOAT with Double]
  
  @js.native
  sealed trait GROUP extends FieldType
  /* 10 */ @js.native
  object GROUP extends TopLevel[GROUP with Double]
  
  @js.native
  sealed trait INT32 extends FieldType
  /* 5 */ @js.native
  object INT32 extends TopLevel[INT32 with Double]
  
  @js.native
  sealed trait INT64 extends FieldType
  /* 3 */ @js.native
  object INT64 extends TopLevel[INT64 with Double]
  
  @js.native
  sealed trait INVALID extends FieldType
  /* -1 */ @js.native
  object INVALID extends TopLevel[INVALID with Double]
  
  @js.native
  sealed trait MESSAGE extends FieldType
  /* 11 */ @js.native
  object MESSAGE extends TopLevel[MESSAGE with Double]
  
  @js.native
  sealed trait SFIXED32 extends FieldType
  /* 15 */ @js.native
  object SFIXED32 extends TopLevel[SFIXED32 with Double]
  
  @js.native
  sealed trait SFIXED64 extends FieldType
  /* 16 */ @js.native
  object SFIXED64 extends TopLevel[SFIXED64 with Double]
  
  @js.native
  sealed trait SINT32 extends FieldType
  /* 17 */ @js.native
  object SINT32 extends TopLevel[SINT32 with Double]
  
  @js.native
  sealed trait SINT64 extends FieldType
  /* 18 */ @js.native
  object SINT64 extends TopLevel[SINT64 with Double]
  
  @js.native
  sealed trait STRING extends FieldType
  /* 9 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
  @js.native
  sealed trait UINT32 extends FieldType
  /* 13 */ @js.native
  object UINT32 extends TopLevel[UINT32 with Double]
  
  @js.native
  sealed trait UINT64 extends FieldType
  /* 4 */ @js.native
  object UINT64 extends TopLevel[UINT64 with Double]
  
  @js.native
  sealed trait VHASH64 extends FieldType
  /* 31 */ @js.native
  object VHASH64 extends TopLevel[VHASH64 with Double]
}
