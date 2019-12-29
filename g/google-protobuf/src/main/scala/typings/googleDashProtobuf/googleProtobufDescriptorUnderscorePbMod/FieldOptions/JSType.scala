package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FieldOptions

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JSType extends js.Object

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldOptions.JSType")
@js.native
object JSType extends js.Object {
  @js.native
  sealed trait JS_NORMAL extends JSType
  
  @js.native
  sealed trait JS_NUMBER extends JSType
  
  @js.native
  sealed trait JS_STRING extends JSType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JSType with Double] = js.native
  /* 0 */ @js.native
  object JS_NORMAL extends TopLevel[JS_NORMAL with Double]
  
  /* 2 */ @js.native
  object JS_NUMBER extends TopLevel[JS_NUMBER with Double]
  
  /* 1 */ @js.native
  object JS_STRING extends TopLevel[JS_STRING with Double]
  
}

