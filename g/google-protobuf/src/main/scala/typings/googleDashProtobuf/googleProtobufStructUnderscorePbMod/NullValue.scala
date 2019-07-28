package typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NullValue extends js.Object

@JSImport("google-protobuf/google/protobuf/struct_pb", "NullValue")
@js.native
object NullValue extends js.Object {
  @js.native
  sealed trait NULL_VALUE extends NullValue
  
  /* 0 */ val NULL_VALUE: typings.googleDashProtobuf.googleProtobufStructUnderscorePbMod.NullValue.NULL_VALUE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NullValue with Double] = js.native
}

