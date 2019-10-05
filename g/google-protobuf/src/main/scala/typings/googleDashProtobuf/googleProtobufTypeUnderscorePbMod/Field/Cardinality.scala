package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Cardinality extends js.Object

@JSImport("google-protobuf/google/protobuf/type_pb", "Field.Cardinality")
@js.native
object Cardinality extends js.Object {
  @js.native
  sealed trait CARDINALITY_OPTIONAL extends Cardinality
  
  @js.native
  sealed trait CARDINALITY_REPEATED extends Cardinality
  
  @js.native
  sealed trait CARDINALITY_REQUIRED extends Cardinality
  
  @js.native
  sealed trait CARDINALITY_UNKNOWN extends Cardinality
  
  /* 1 */ val CARDINALITY_OPTIONAL: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field.Cardinality.CARDINALITY_OPTIONAL with Double = js.native
  /* 3 */ val CARDINALITY_REPEATED: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field.Cardinality.CARDINALITY_REPEATED with Double = js.native
  /* 2 */ val CARDINALITY_REQUIRED: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field.Cardinality.CARDINALITY_REQUIRED with Double = js.native
  /* 0 */ val CARDINALITY_UNKNOWN: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Field.Cardinality.CARDINALITY_UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Cardinality with Double] = js.native
}

