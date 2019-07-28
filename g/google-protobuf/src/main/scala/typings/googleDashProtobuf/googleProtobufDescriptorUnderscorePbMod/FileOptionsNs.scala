package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod

import typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "FileOptions")
@js.native
object FileOptionsNs extends js.Object {
  trait AsObject extends js.Object {
    var ccEnableArenas: js.UndefOr[Boolean] = js.undefined
    var ccGenericServices: js.UndefOr[Boolean] = js.undefined
    var csharpNamespace: js.UndefOr[String] = js.undefined
    var deprecated: js.UndefOr[Boolean] = js.undefined
    var goPackage: js.UndefOr[String] = js.undefined
    var javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.undefined
    var javaGenericServices: js.UndefOr[Boolean] = js.undefined
    var javaMultipleFiles: js.UndefOr[Boolean] = js.undefined
    var javaOuterClassname: js.UndefOr[String] = js.undefined
    var javaPackage: js.UndefOr[String] = js.undefined
    var javaStringCheckUtf8: js.UndefOr[Boolean] = js.undefined
    var objcClassPrefix: js.UndefOr[String] = js.undefined
    var optimizeFor: js.UndefOr[OptimizeMode] = js.undefined
    var phpClassPrefix: js.UndefOr[String] = js.undefined
    var phpGenericServices: js.UndefOr[Boolean] = js.undefined
    var phpMetadataNamespace: js.UndefOr[String] = js.undefined
    var phpNamespace: js.UndefOr[String] = js.undefined
    var pyGenericServices: js.UndefOr[Boolean] = js.undefined
    var rubyPackage: js.UndefOr[String] = js.undefined
    var swiftPrefix: js.UndefOr[String] = js.undefined
    var uninterpretedOptionList: js.Array[
        typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOptionNs.AsObject
      ]
  }
  
  @js.native
  sealed trait OptimizeMode extends js.Object
  
  @js.native
  object OptimizeMode extends js.Object {
    @js.native
    sealed trait CODE_SIZE extends OptimizeMode
    
    @js.native
    sealed trait LITE_RUNTIME extends OptimizeMode
    
    @js.native
    sealed trait SPEED extends OptimizeMode
    
    /* 2 */ val CODE_SIZE: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode.CODE_SIZE with Double = js.native
    /* 3 */ val LITE_RUNTIME: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode.LITE_RUNTIME with Double = js.native
    /* 1 */ val SPEED: typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptionsNs.OptimizeMode.SPEED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OptimizeMode with Double] = js.native
  }
  
}

