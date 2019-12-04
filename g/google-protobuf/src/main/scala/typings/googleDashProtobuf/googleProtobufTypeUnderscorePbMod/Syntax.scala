package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Syntax extends js.Object

@JSImport("google-protobuf/google/protobuf/type_pb", "Syntax")
@js.native
object Syntax extends js.Object {
  @js.native
  sealed trait SYNTAX_PROTO2 extends Syntax
  
  @js.native
  sealed trait SYNTAX_PROTO3 extends Syntax
  
  /* 0 */ val SYNTAX_PROTO2: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax.SYNTAX_PROTO2 with Double = js.native
  /* 1 */ val SYNTAX_PROTO3: typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax.SYNTAX_PROTO3 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Syntax with Double] = js.native
}

