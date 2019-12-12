package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod

import org.scalablytyped.runtime.TopLevel
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax.SYNTAX_PROTO2
import typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Syntax.SYNTAX_PROTO3
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Syntax with Double] = js.native
  /* 0 */ @js.native
  object SYNTAX_PROTO2 extends TopLevel[SYNTAX_PROTO2 with Double]
  
  /* 1 */ @js.native
  object SYNTAX_PROTO3 extends TopLevel[SYNTAX_PROTO3 with Double]
  
}

