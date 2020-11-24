package typings.googleProtobuf.structPbMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NullValue extends js.Object
@JSImport("google-protobuf/google/protobuf/struct_pb", "NullValue")
@js.native
object NullValue extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NullValue with Double] = js.native
  
  @js.native
  sealed trait NULL_VALUE extends NullValue
  /* 0 */ @js.native
  object NULL_VALUE extends TopLevel[NULL_VALUE with Double]
}
