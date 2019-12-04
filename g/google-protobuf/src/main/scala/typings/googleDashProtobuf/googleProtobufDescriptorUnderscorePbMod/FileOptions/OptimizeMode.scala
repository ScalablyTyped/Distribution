package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OptimizeMode extends js.Object

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.OptimizeMode")
@js.native
object OptimizeMode extends js.Object {
  @js.native
  sealed trait CODE_SIZE extends OptimizeMode
  
  @js.native
  sealed trait LITE_RUNTIME extends OptimizeMode
  
  @js.native
  sealed trait SPEED extends OptimizeMode
  
  /* 2 */ val CODE_SIZE: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptions.OptimizeMode.CODE_SIZE with Double = js.native
  /* 3 */ val LITE_RUNTIME: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptions.OptimizeMode.LITE_RUNTIME with Double = js.native
  /* 1 */ val SPEED: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptions.OptimizeMode.SPEED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OptimizeMode with Double] = js.native
}

