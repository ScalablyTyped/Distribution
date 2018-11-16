package typings
package googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions")
@js.native
object FileOptionsNs extends js.Object {
  
  trait AsObject extends js.Object {
    var ccEnableArenas: js.UndefOr[scala.Boolean] = js.undefined
    var ccGenericServices: js.UndefOr[scala.Boolean] = js.undefined
    var csharpNamespace: js.UndefOr[java.lang.String] = js.undefined
    var deprecated: js.UndefOr[scala.Boolean] = js.undefined
    var goPackage: js.UndefOr[java.lang.String] = js.undefined
    var javaGenerateEqualsAndHash: js.UndefOr[scala.Boolean] = js.undefined
    var javaGenericServices: js.UndefOr[scala.Boolean] = js.undefined
    var javaMultipleFiles: js.UndefOr[scala.Boolean] = js.undefined
    var javaOuterClassname: js.UndefOr[java.lang.String] = js.undefined
    var javaPackage: js.UndefOr[java.lang.String] = js.undefined
    var javaStringCheckUtf8: js.UndefOr[scala.Boolean] = js.undefined
    var objcClassPrefix: js.UndefOr[java.lang.String] = js.undefined
    var optimizeFor: js.UndefOr[OptimizeMode] = js.undefined
    var pyGenericServices: js.UndefOr[scala.Boolean] = js.undefined
    var swiftPrefix: js.UndefOr[java.lang.String] = js.undefined
    var uninterpretedOptionList: js.Array[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
      ]
  }
  
  @js.native
  sealed trait OptimizeMode extends js.Object
  
  @js.native
  object OptimizeMode extends js.Object {
    @js.native
    sealed trait CODE_SIZE
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode
    
    @js.native
    sealed trait LITE_RUNTIME
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode
    
    @js.native
    sealed trait SPEED
      extends googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode
    
    /* 2 */ val CODE_SIZE: CODE_SIZE with scala.Double = js.native
    /* 3 */ val LITE_RUNTIME: LITE_RUNTIME with scala.Double = js.native
    /* 1 */ val SPEED: SPEED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        googleDashProtobufLib.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode with scala.Double
      ] = js.native
  }
  
}

