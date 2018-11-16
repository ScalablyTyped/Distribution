package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Syntax extends js.Object

@JSImport("google-protobuf/google/protobuf/type_pb", "Syntax")
@js.native
object Syntax extends js.Object {
  @js.native
  sealed trait SYNTAX_PROTO2
    extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax
  
  @js.native
  sealed trait SYNTAX_PROTO3
    extends googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax
  
  /* 0 */ val SYNTAX_PROTO2: SYNTAX_PROTO2 with scala.Double = js.native
  /* 1 */ val SYNTAX_PROTO3: SYNTAX_PROTO3 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.Syntax with scala.Double] = js.native
}

