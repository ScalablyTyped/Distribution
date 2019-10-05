package typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.FileOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[
      typings.googleDashProtobuf.googleProtobufDescriptorUnderscorePbMod.UninterpretedOption.AsObject
    ],
    ccEnableArenas: js.UndefOr[Boolean] = js.undefined,
    ccGenericServices: js.UndefOr[Boolean] = js.undefined,
    csharpNamespace: String = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    goPackage: String = null,
    javaGenerateEqualsAndHash: js.UndefOr[Boolean] = js.undefined,
    javaGenericServices: js.UndefOr[Boolean] = js.undefined,
    javaMultipleFiles: js.UndefOr[Boolean] = js.undefined,
    javaOuterClassname: String = null,
    javaPackage: String = null,
    javaStringCheckUtf8: js.UndefOr[Boolean] = js.undefined,
    objcClassPrefix: String = null,
    optimizeFor: OptimizeMode = null,
    phpClassPrefix: String = null,
    phpGenericServices: js.UndefOr[Boolean] = js.undefined,
    phpMetadataNamespace: String = null,
    phpNamespace: String = null,
    pyGenericServices: js.UndefOr[Boolean] = js.undefined,
    rubyPackage: String = null,
    swiftPrefix: String = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList)
    if (!js.isUndefined(ccEnableArenas)) __obj.updateDynamic("ccEnableArenas")(ccEnableArenas)
    if (!js.isUndefined(ccGenericServices)) __obj.updateDynamic("ccGenericServices")(ccGenericServices)
    if (csharpNamespace != null) __obj.updateDynamic("csharpNamespace")(csharpNamespace)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (goPackage != null) __obj.updateDynamic("goPackage")(goPackage)
    if (!js.isUndefined(javaGenerateEqualsAndHash)) __obj.updateDynamic("javaGenerateEqualsAndHash")(javaGenerateEqualsAndHash)
    if (!js.isUndefined(javaGenericServices)) __obj.updateDynamic("javaGenericServices")(javaGenericServices)
    if (!js.isUndefined(javaMultipleFiles)) __obj.updateDynamic("javaMultipleFiles")(javaMultipleFiles)
    if (javaOuterClassname != null) __obj.updateDynamic("javaOuterClassname")(javaOuterClassname)
    if (javaPackage != null) __obj.updateDynamic("javaPackage")(javaPackage)
    if (!js.isUndefined(javaStringCheckUtf8)) __obj.updateDynamic("javaStringCheckUtf8")(javaStringCheckUtf8)
    if (objcClassPrefix != null) __obj.updateDynamic("objcClassPrefix")(objcClassPrefix)
    if (optimizeFor != null) __obj.updateDynamic("optimizeFor")(optimizeFor)
    if (phpClassPrefix != null) __obj.updateDynamic("phpClassPrefix")(phpClassPrefix)
    if (!js.isUndefined(phpGenericServices)) __obj.updateDynamic("phpGenericServices")(phpGenericServices)
    if (phpMetadataNamespace != null) __obj.updateDynamic("phpMetadataNamespace")(phpMetadataNamespace)
    if (phpNamespace != null) __obj.updateDynamic("phpNamespace")(phpNamespace)
    if (!js.isUndefined(pyGenericServices)) __obj.updateDynamic("pyGenericServices")(pyGenericServices)
    if (rubyPackage != null) __obj.updateDynamic("rubyPackage")(rubyPackage)
    if (swiftPrefix != null) __obj.updateDynamic("swiftPrefix")(swiftPrefix)
    __obj.asInstanceOf[AsObject]
  }
}

