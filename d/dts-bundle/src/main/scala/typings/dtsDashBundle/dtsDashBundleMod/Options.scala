package typings.dtsDashBundle.dtsDashBundleMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var baseDir: js.UndefOr[String] = js.undefined
  var emitOnIncludedFileNotFound: js.UndefOr[Boolean] = js.undefined
  var emitOnNoIncludedFileNotFound: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[RegExp | (js.Function2[/* file */ String, /* external */ Boolean, Boolean])] = js.undefined
  var externals: js.UndefOr[Boolean] = js.undefined
  var headerPath: js.UndefOr[String] = js.undefined
  var headerText: js.UndefOr[String] = js.undefined
  var indent: js.UndefOr[String] = js.undefined
  var main: String
  var name: String
  var newLine: js.UndefOr[String] = js.undefined
  var out: js.UndefOr[String] = js.undefined
  var outputAsModuleFolder: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var referenceExternals: js.UndefOr[Boolean] = js.undefined
  var removeSource: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    main: String,
    name: String,
    baseDir: String = null,
    emitOnIncludedFileNotFound: js.UndefOr[Boolean] = js.undefined,
    emitOnNoIncludedFileNotFound: js.UndefOr[Boolean] = js.undefined,
    exclude: RegExp | (js.Function2[/* file */ String, /* external */ Boolean, Boolean]) = null,
    externals: js.UndefOr[Boolean] = js.undefined,
    headerPath: String = null,
    headerText: String = null,
    indent: String = null,
    newLine: String = null,
    out: String = null,
    outputAsModuleFolder: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    referenceExternals: js.UndefOr[Boolean] = js.undefined,
    removeSource: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(main = main, name = name)
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

