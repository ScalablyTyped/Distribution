package typings
package googleDashProtobufLib.googleProtobufStructUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NullValue extends js.Object

@JSImport("google-protobuf/google/protobuf/struct_pb", "NullValue")
@js.native
object NullValue extends js.Object {
  @js.native
  sealed trait NULL_VALUE
    extends googleDashProtobufLib.googleProtobufStructUnderscorePbMod.NullValue
  
  /* 0 */ val NULL_VALUE: NULL_VALUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashProtobufLib.googleProtobufStructUnderscorePbMod.NullValue with scala.Double
  ] = js.native
}

