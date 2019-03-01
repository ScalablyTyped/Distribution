package typings
package dtsDashBundleLib.dtsDashBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
  var emitOnIncludedFileNotFound: js.UndefOr[scala.Boolean] = js.undefined
  var emitOnNoIncludedFileNotFound: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[
    stdLib.RegExp | (js.Function2[/* file */ java.lang.String, /* external */ scala.Boolean, scala.Boolean])
  ] = js.undefined
  var externals: js.UndefOr[scala.Boolean] = js.undefined
  var headerPath: js.UndefOr[java.lang.String] = js.undefined
  var headerText: js.UndefOr[java.lang.String] = js.undefined
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var main: java.lang.String
  var name: java.lang.String
  var newLine: js.UndefOr[java.lang.String] = js.undefined
  var out: js.UndefOr[java.lang.String] = js.undefined
  var outputAsModuleFolder: js.UndefOr[scala.Boolean] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var referenceExternals: js.UndefOr[scala.Boolean] = js.undefined
  var removeSource: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    main: java.lang.String,
    name: java.lang.String,
    baseDir: java.lang.String = null,
    emitOnIncludedFileNotFound: js.UndefOr[scala.Boolean] = js.undefined,
    emitOnNoIncludedFileNotFound: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: stdLib.RegExp | (js.Function2[/* file */ java.lang.String, /* external */ scala.Boolean, scala.Boolean]) = null,
    externals: js.UndefOr[scala.Boolean] = js.undefined,
    headerPath: java.lang.String = null,
    headerText: java.lang.String = null,
    indent: java.lang.String = null,
    newLine: java.lang.String = null,
    out: java.lang.String = null,
    outputAsModuleFolder: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    referenceExternals: js.UndefOr[scala.Boolean] = js.undefined,
    removeSource: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("main")(main)
    __obj.updateDynamic("name")(name)
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    if (!js.isUndefined(emitOnIncludedFileNotFound)) __obj.updateDynamic("emitOnIncludedFileNotFound")(emitOnIncludedFileNotFound)
    if (!js.isUndefined(emitOnNoIncludedFileNotFound)) __obj.updateDynamic("emitOnNoIncludedFileNotFound")(emitOnNoIncludedFileNotFound)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(externals)) __obj.updateDynamic("externals")(externals)
    if (headerPath != null) __obj.updateDynamic("headerPath")(headerPath)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (newLine != null) __obj.updateDynamic("newLine")(newLine)
    if (out != null) __obj.updateDynamic("out")(out)
    if (!js.isUndefined(outputAsModuleFolder)) __obj.updateDynamic("outputAsModuleFolder")(outputAsModuleFolder)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(referenceExternals)) __obj.updateDynamic("referenceExternals")(referenceExternals)
    if (!js.isUndefined(removeSource)) __obj.updateDynamic("removeSource")(removeSource)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Options]
  }
}

