package typings.googleProtobuf.descriptorPbMod.FileOptions

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
  var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject],
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
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
    if (!js.isUndefined(ccEnableArenas)) __obj.updateDynamic("ccEnableArenas")(ccEnableArenas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ccGenericServices)) __obj.updateDynamic("ccGenericServices")(ccGenericServices.get.asInstanceOf[js.Any])
    if (csharpNamespace != null) __obj.updateDynamic("csharpNamespace")(csharpNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.get.asInstanceOf[js.Any])
    if (goPackage != null) __obj.updateDynamic("goPackage")(goPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(javaGenerateEqualsAndHash)) __obj.updateDynamic("javaGenerateEqualsAndHash")(javaGenerateEqualsAndHash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(javaGenericServices)) __obj.updateDynamic("javaGenericServices")(javaGenericServices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(javaMultipleFiles)) __obj.updateDynamic("javaMultipleFiles")(javaMultipleFiles.get.asInstanceOf[js.Any])
    if (javaOuterClassname != null) __obj.updateDynamic("javaOuterClassname")(javaOuterClassname.asInstanceOf[js.Any])
    if (javaPackage != null) __obj.updateDynamic("javaPackage")(javaPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(javaStringCheckUtf8)) __obj.updateDynamic("javaStringCheckUtf8")(javaStringCheckUtf8.get.asInstanceOf[js.Any])
    if (objcClassPrefix != null) __obj.updateDynamic("objcClassPrefix")(objcClassPrefix.asInstanceOf[js.Any])
    if (optimizeFor != null) __obj.updateDynamic("optimizeFor")(optimizeFor.asInstanceOf[js.Any])
    if (phpClassPrefix != null) __obj.updateDynamic("phpClassPrefix")(phpClassPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(phpGenericServices)) __obj.updateDynamic("phpGenericServices")(phpGenericServices.get.asInstanceOf[js.Any])
    if (phpMetadataNamespace != null) __obj.updateDynamic("phpMetadataNamespace")(phpMetadataNamespace.asInstanceOf[js.Any])
    if (phpNamespace != null) __obj.updateDynamic("phpNamespace")(phpNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(pyGenericServices)) __obj.updateDynamic("pyGenericServices")(pyGenericServices.get.asInstanceOf[js.Any])
    if (rubyPackage != null) __obj.updateDynamic("rubyPackage")(rubyPackage.asInstanceOf[js.Any])
    if (swiftPrefix != null) __obj.updateDynamic("swiftPrefix")(swiftPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

