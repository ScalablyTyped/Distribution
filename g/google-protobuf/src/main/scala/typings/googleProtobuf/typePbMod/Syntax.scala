package typings.googleProtobuf.typePbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Syntax extends js.Object
@JSImport("google-protobuf/google/protobuf/type_pb", "Syntax")
@js.native
object Syntax extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Syntax with Double] = js.native
  
  @js.native
  sealed trait SYNTAX_PROTO2 extends Syntax
  /* 0 */ @js.native
  object SYNTAX_PROTO2 extends TopLevel[SYNTAX_PROTO2 with Double]
  
  @js.native
  sealed trait SYNTAX_PROTO3 extends Syntax
  /* 1 */ @js.native
  object SYNTAX_PROTO3 extends TopLevel[SYNTAX_PROTO3 with Double]
}
