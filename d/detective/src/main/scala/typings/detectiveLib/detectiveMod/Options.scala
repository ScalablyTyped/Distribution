package typings
package detectiveLib.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When this is enabled (off by default), if the code starts with the
    * characters #! (as in a shellscript), the first line will be treated as a comment.
    */
  var allowHashBang: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If false, using a reserved word will generate an error. Defaults to true for ecmaVersion 3,
    * false for higher versions. When given the value "never", reserved words and keywords can
    * also not be used as property names (as in Internet Explorer's old parser).
    */
  var allowReserved: js.UndefOr[scala.Boolean | detectiveLib.detectiveLibStrings.never] = js.undefined
  /**
    * By default, a return statement at the top level raises an error. Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates the ECMAScript version to parse. Must be either 3, 5, 6 (2015),
    * 7 (2016), 8 (2017), 9 (2018) or 10 (2019, partial support). This influences
    * support for strict mode, the set of reserved words, and support for new syntax features.
    * Default is 9.
    */
  var ecmaVersion: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * a function returning whether an AST CallExpression node is a require call
    */
  var isRequire: js.UndefOr[js.Function1[/* node */ js.Any, scala.Boolean]] = js.undefined
  /**
    * When true, each node has a loc object attached with start and end subobjects, each of which
    * contains the one-based line and zero-based column numbers in {line, column} form. Default is false.
    */
  var locations: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * when true, populate found.nodes
    */
  var nodes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * supply options directly to acorn with some support for esprima-style options range and loc
    */
  var parse: js.UndefOr[acornLib.acornMod.Options] = js.undefined
  /**
    * Nodes have their start and end characters offsets recorded in start and end properties
    * (directly on the node, rather than the loc object, which holds line/column data.
    * To also add a semi-standardized range property holding a [start, end] array with
    * the same numbers, set the ranges option to true.
    */
  var ranges: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicate the mode the code should be parsed in. Can be either "script" or "module".
    * This influences global strict mode and parsing of import and export declarations.
    */
  var sourceType: js.UndefOr[
    detectiveLib.detectiveLibStrings.script | detectiveLib.detectiveLibStrings.module
  ] = js.undefined
  /**
    * specify a different function name instead of "require"
    */
  var word: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHashBang: js.UndefOr[scala.Boolean] = js.undefined,
    allowImportExportEverywhere: js.UndefOr[scala.Boolean] = js.undefined,
    allowReserved: scala.Boolean | detectiveLib.detectiveLibStrings.never = null,
    allowReturnOutsideFunction: js.UndefOr[scala.Boolean] = js.undefined,
    ecmaVersion: java.lang.String | scala.Double = null,
    isRequire: /* node */ js.Any => scala.Boolean = null,
    locations: js.UndefOr[scala.Boolean] = js.undefined,
    nodes: java.lang.String = null,
    parse: acornLib.acornMod.Options = null,
    ranges: java.lang.String = null,
    sourceType: detectiveLib.detectiveLibStrings.script | detectiveLib.detectiveLibStrings.module = null,
    word: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHashBang)) __obj.updateDynamic("allowHashBang")(allowHashBang)
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere)
    if (allowReserved != null) __obj.updateDynamic("allowReserved")(allowReserved.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction)
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (isRequire != null) __obj.updateDynamic("isRequire")(js.Any.fromFunction1(isRequire))
    if (!js.isUndefined(locations)) __obj.updateDynamic("locations")(locations)
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word)
    __obj.asInstanceOf[Options]
  }
}

