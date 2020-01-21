package typings.googleCloudPubsub.pubsubMod.google.protobuf

import typings.googleCloudPubsub.pubsubMod.google.protobuf.FileOptions.OptimizeMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FileOptions. */
trait IFileOptions extends js.Object {
  /** FileOptions ccEnableArenas */
  var ccEnableArenas: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions ccGenericServices */
  var ccGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions csharpNamespace */
  var csharpNamespace: js.UndefOr[String | Null] = js.undefined
  /** FileOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions goPackage */
  var goPackage: js.UndefOr[String | Null] = js.undefined
  /** FileOptions javaGenerateEqualsAndHash */
  var javaGenerateEqualsAndHash: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions javaGenericServices */
  var javaGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions javaMultipleFiles */
  var javaMultipleFiles: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions javaOuterClassname */
  var javaOuterClassname: js.UndefOr[String | Null] = js.undefined
  /** FileOptions javaPackage */
  var javaPackage: js.UndefOr[String | Null] = js.undefined
  /** FileOptions javaStringCheckUtf8 */
  var javaStringCheckUtf8: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions objcClassPrefix */
  var objcClassPrefix: js.UndefOr[String | Null] = js.undefined
  /** FileOptions optimizeFor */
  var optimizeFor: js.UndefOr[OptimizeMode | Null] = js.undefined
  /** FileOptions phpClassPrefix */
  var phpClassPrefix: js.UndefOr[String | Null] = js.undefined
  /** FileOptions phpGenericServices */
  var phpGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions phpMetadataNamespace */
  var phpMetadataNamespace: js.UndefOr[String | Null] = js.undefined
  /** FileOptions phpNamespace */
  var phpNamespace: js.UndefOr[String | Null] = js.undefined
  /** FileOptions pyGenericServices */
  var pyGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions rubyPackage */
  var rubyPackage: js.UndefOr[String | Null] = js.undefined
  /** FileOptions swiftPrefix */
  var swiftPrefix: js.UndefOr[String | Null] = js.undefined
  /** FileOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
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
    swiftPrefix: String = null,
    uninterpretedOption: js.Array[IUninterpretedOption] = null
  ): IFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ccEnableArenas)) __obj.updateDynamic("ccEnableArenas")(ccEnableArenas.asInstanceOf[js.Any])
    if (!js.isUndefined(ccGenericServices)) __obj.updateDynamic("ccGenericServices")(ccGenericServices.asInstanceOf[js.Any])
    if (csharpNamespace != null) __obj.updateDynamic("csharpNamespace")(csharpNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (goPackage != null) __obj.updateDynamic("goPackage")(goPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(javaGenerateEqualsAndHash)) __obj.updateDynamic("javaGenerateEqualsAndHash")(javaGenerateEqualsAndHash.asInstanceOf[js.Any])
    if (!js.isUndefined(javaGenericServices)) __obj.updateDynamic("javaGenericServices")(javaGenericServices.asInstanceOf[js.Any])
    if (!js.isUndefined(javaMultipleFiles)) __obj.updateDynamic("javaMultipleFiles")(javaMultipleFiles.asInstanceOf[js.Any])
    if (javaOuterClassname != null) __obj.updateDynamic("javaOuterClassname")(javaOuterClassname.asInstanceOf[js.Any])
    if (javaPackage != null) __obj.updateDynamic("javaPackage")(javaPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(javaStringCheckUtf8)) __obj.updateDynamic("javaStringCheckUtf8")(javaStringCheckUtf8.asInstanceOf[js.Any])
    if (objcClassPrefix != null) __obj.updateDynamic("objcClassPrefix")(objcClassPrefix.asInstanceOf[js.Any])
    if (optimizeFor != null) __obj.updateDynamic("optimizeFor")(optimizeFor.asInstanceOf[js.Any])
    if (phpClassPrefix != null) __obj.updateDynamic("phpClassPrefix")(phpClassPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(phpGenericServices)) __obj.updateDynamic("phpGenericServices")(phpGenericServices.asInstanceOf[js.Any])
    if (phpMetadataNamespace != null) __obj.updateDynamic("phpMetadataNamespace")(phpMetadataNamespace.asInstanceOf[js.Any])
    if (phpNamespace != null) __obj.updateDynamic("phpNamespace")(phpNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(pyGenericServices)) __obj.updateDynamic("pyGenericServices")(pyGenericServices.asInstanceOf[js.Any])
    if (rubyPackage != null) __obj.updateDynamic("rubyPackage")(rubyPackage.asInstanceOf[js.Any])
    if (swiftPrefix != null) __obj.updateDynamic("swiftPrefix")(swiftPrefix.asInstanceOf[js.Any])
    if (uninterpretedOption != null) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOptions]
  }
}

