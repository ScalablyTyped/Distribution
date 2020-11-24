package typings.googleProtobuf.descriptorPbMod.FieldDescriptorProto

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Label extends js.Object
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FieldDescriptorProto.Label")
@js.native
object Label extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Label with Double] = js.native
  
  @js.native
  sealed trait LABEL_OPTIONAL extends Label
  /* 1 */ @js.native
  object LABEL_OPTIONAL extends TopLevel[LABEL_OPTIONAL with Double]
  
  @js.native
  sealed trait LABEL_REPEATED extends Label
  /* 3 */ @js.native
  object LABEL_REPEATED extends TopLevel[LABEL_REPEATED with Double]
  
  @js.native
  sealed trait LABEL_REQUIRED extends Label
  /* 2 */ @js.native
  object LABEL_REQUIRED extends TopLevel[LABEL_REQUIRED with Double]
}
