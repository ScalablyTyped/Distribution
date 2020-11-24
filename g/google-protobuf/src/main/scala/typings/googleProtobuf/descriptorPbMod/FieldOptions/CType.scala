package typings.googleProtobuf.descriptorPbMod.FieldOptions

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CType extends js.Object
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.CType")
@js.native
object CType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CType with Double] = js.native
  
  @js.native
  sealed trait CORD extends CType
  /* 1 */ @js.native
  object CORD extends TopLevel[CORD with Double]
  
  @js.native
  sealed trait STRING extends CType
  /* 0 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
  @js.native
  sealed trait STRING_PIECE extends CType
  /* 2 */ @js.native
  object STRING_PIECE extends TopLevel[STRING_PIECE with Double]
}
