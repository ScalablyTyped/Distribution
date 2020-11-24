package typings.googleProtobuf.descriptorPbMod.FileOptions

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OptimizeMode extends js.Object
@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions.OptimizeMode")
@js.native
object OptimizeMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OptimizeMode with Double] = js.native
  
  @js.native
  sealed trait CODE_SIZE extends OptimizeMode
  /* 2 */ @js.native
  object CODE_SIZE extends TopLevel[CODE_SIZE with Double]
  
  @js.native
  sealed trait LITE_RUNTIME extends OptimizeMode
  /* 3 */ @js.native
  object LITE_RUNTIME extends TopLevel[LITE_RUNTIME with Double]
  
  @js.native
  sealed trait SPEED extends OptimizeMode
  /* 1 */ @js.native
  object SPEED extends TopLevel[SPEED with Double]
}
