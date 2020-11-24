package typings.googleProtobuf.descriptorPbMod.FieldOptions

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JSType extends js.Object
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.JSType")
@js.native
object JSType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JSType with Double] = js.native
  
  @js.native
  sealed trait JS_NORMAL extends JSType
  /* 0 */ @js.native
  object JS_NORMAL extends TopLevel[JS_NORMAL with Double]
  
  @js.native
  sealed trait JS_NUMBER extends JSType
  /* 2 */ @js.native
  object JS_NUMBER extends TopLevel[JS_NUMBER with Double]
  
  @js.native
  sealed trait JS_STRING extends JSType
  /* 1 */ @js.native
  object JS_STRING extends TopLevel[JS_STRING with Double]
}
