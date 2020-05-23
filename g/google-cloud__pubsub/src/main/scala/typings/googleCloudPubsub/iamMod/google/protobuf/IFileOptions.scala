package typings.googleCloudPubsub.iamMod.google.protobuf

import typings.googleCloudPubsub.iamMod.google.protobuf.FileOptions.OptimizeMode
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
  /** FileOptions pyGenericServices */
  var pyGenericServices: js.UndefOr[Boolean | Null] = js.undefined
  /** FileOptions swiftPrefix */
  var swiftPrefix: js.UndefOr[String | Null] = js.undefined
  /** FileOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
    ccEnableArenas: js.UndefOr[Null | Boolean] = js.undefined,
    ccGenericServices: js.UndefOr[Null | Boolean] = js.undefined,
    csharpNamespace: js.UndefOr[Null | String] = js.undefined,
    deprecated: js.UndefOr[Null | Boolean] = js.undefined,
    goPackage: js.UndefOr[Null | String] = js.undefined,
    javaGenerateEqualsAndHash: js.UndefOr[Null | Boolean] = js.undefined,
    javaGenericServices: js.UndefOr[Null | Boolean] = js.undefined,
    javaMultipleFiles: js.UndefOr[Null | Boolean] = js.undefined,
    javaOuterClassname: js.UndefOr[Null | String] = js.undefined,
    javaPackage: js.UndefOr[Null | String] = js.undefined,
    javaStringCheckUtf8: js.UndefOr[Null | Boolean] = js.undefined,
    objcClassPrefix: js.UndefOr[Null | String] = js.undefined,
    optimizeFor: js.UndefOr[Null | OptimizeMode] = js.undefined,
    phpClassPrefix: js.UndefOr[Null | String] = js.undefined,
    pyGenericServices: js.UndefOr[Null | Boolean] = js.undefined,
    swiftPrefix: js.UndefOr[Null | String] = js.undefined,
    uninterpretedOption: js.UndefOr[Null | js.Array[IUninterpretedOption]] = js.undefined
  ): IFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ccEnableArenas)) __obj.updateDynamic("ccEnableArenas")(ccEnableArenas.asInstanceOf[js.Any])
    if (!js.isUndefined(ccGenericServices)) __obj.updateDynamic("ccGenericServices")(ccGenericServices.asInstanceOf[js.Any])
    if (!js.isUndefined(csharpNamespace)) __obj.updateDynamic("csharpNamespace")(csharpNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (!js.isUndefined(goPackage)) __obj.updateDynamic("goPackage")(goPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(javaGenerateEqualsAndHash)) __obj.updateDynamic("javaGenerateEqualsAndHash")(javaGenerateEqualsAndHash.asInstanceOf[js.Any])
    if (!js.isUndefined(javaGenericServices)) __obj.updateDynamic("javaGenericServices")(javaGenericServices.asInstanceOf[js.Any])
    if (!js.isUndefined(javaMultipleFiles)) __obj.updateDynamic("javaMultipleFiles")(javaMultipleFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(javaOuterClassname)) __obj.updateDynamic("javaOuterClassname")(javaOuterClassname.asInstanceOf[js.Any])
    if (!js.isUndefined(javaPackage)) __obj.updateDynamic("javaPackage")(javaPackage.asInstanceOf[js.Any])
    if (!js.isUndefined(javaStringCheckUtf8)) __obj.updateDynamic("javaStringCheckUtf8")(javaStringCheckUtf8.asInstanceOf[js.Any])
    if (!js.isUndefined(objcClassPrefix)) __obj.updateDynamic("objcClassPrefix")(objcClassPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeFor)) __obj.updateDynamic("optimizeFor")(optimizeFor.asInstanceOf[js.Any])
    if (!js.isUndefined(phpClassPrefix)) __obj.updateDynamic("phpClassPrefix")(phpClassPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(pyGenericServices)) __obj.updateDynamic("pyGenericServices")(pyGenericServices.asInstanceOf[js.Any])
    if (!js.isUndefined(swiftPrefix)) __obj.updateDynamic("swiftPrefix")(swiftPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(uninterpretedOption)) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOptions]
  }
}

