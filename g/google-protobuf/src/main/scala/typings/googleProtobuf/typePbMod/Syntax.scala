package typings.googleProtobuf.typePbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Syntax extends StObject
@JSImport("google-protobuf/google/protobuf/type_pb", "Syntax")
@js.native
object Syntax extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Syntax with Double] = js.native
  
  @js.native
  sealed trait SYNTAX_PROTO2 extends Syntax
  /* 0 */ val SYNTAX_PROTO2: typings.googleProtobuf.typePbMod.Syntax.SYNTAX_PROTO2 with Double = js.native
  
  @js.native
  sealed trait SYNTAX_PROTO3 extends Syntax
  /* 1 */ val SYNTAX_PROTO3: typings.googleProtobuf.typePbMod.Syntax.SYNTAX_PROTO3 with Double = js.native
}
