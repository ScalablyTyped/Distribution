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

