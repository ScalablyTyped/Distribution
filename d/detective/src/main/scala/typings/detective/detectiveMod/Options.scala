package typings.detective.detectiveMod

import typings.detective.detectiveStrings.module
import typings.detective.detectiveStrings.never
import typings.detective.detectiveStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * When this is enabled (off by default), if the code starts with the
    * characters #! (as in a shellscript), the first line will be treated as a comment.
    */
  var allowHashBang: js.UndefOr[Boolean] = js.undefined
  /**
    * By default, import and export declarations can only appear at a program's top level.
    * Setting this option to true allows them anywhere where a statement is allowed.
    */
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, using a reserved word will generate an error. Defaults to true for ecmaVersion 3,
    * false for higher versions. When given the value "never", reserved words and keywords can
    * also not be used as property names (as in Internet Explorer's old parser).
    */
  var allowReserved: js.UndefOr[Boolean | never] = js.undefined
  /**
    * By default, a return statement at the top level raises an error. Set this to true to accept such code.
    */
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the ECMAScript version to parse. Must be either 3, 5, 6 (2015),
    * 7 (2016), 8 (2017), 9 (2018) or 10 (2019, partial support). This influences
    * support for strict mode, the set of reserved words, and support for new syntax features.
    * Default is 9.
    */
  var ecmaVersion: js.UndefOr[String | Double] = js.undefined
  /**
    * a function returning whether an AST CallExpression node is a require call
    */
  var isRequire: js.UndefOr[js.Function1[/* node */ js.Any, Boolean]] = js.undefined
  /**
    * When true, each node has a loc object attached with start and end subobjects, each of which
    * contains the one-based line and zero-based column numbers in {line, column} form. Default is false.
    */
  var locations: js.UndefOr[Boolean] = js.undefined
  /**
    * when true, populate found.nodes
    */
  var nodes: js.UndefOr[String] = js.undefined
  /**
    * supply options directly to acorn with some support for esprima-style options range and loc
    */
  var parse: js.UndefOr[typings.acorn.acornMod.Options] = js.undefined
  /**
    * Nodes have their start and end characters offsets recorded in start and end properties
    * (directly on the node, rather than the loc object, which holds line/column data.
    * To also add a semi-standardized range property holding a [start, end] array with
    * the same numbers, set the ranges option to true.
    */
  var ranges: js.UndefOr[String] = js.undefined
  /**
    * Indicate the mode the code should be parsed in. Can be either "script" or "module".
    * This influences global strict mode and parsing of import and export declarations.
    */
  var sourceType: js.UndefOr[script | module] = js.undefined
  /**
    * specify a different function name instead of "require"
    */
  var word: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHashBang: js.UndefOr[Boolean] = js.undefined,
    allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined,
    allowReserved: Boolean | never = null,
    allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined,
    ecmaVersion: String | Double = null,
    isRequire: /* node */ js.Any => Boolean = null,
    locations: js.UndefOr[Boolean] = js.undefined,
    nodes: String = null,
    parse: typings.acorn.acornMod.Options = null,
    ranges: String = null,
    sourceType: script | module = null,
    word: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHashBang)) __obj.updateDynamic("allowHashBang")(allowHashBang.asInstanceOf[js.Any])
    if (!js.isUndefined(allowImportExportEverywhere)) __obj.updateDynamic("allowImportExportEverywhere")(allowImportExportEverywhere.asInstanceOf[js.Any])
    if (allowReserved != null) __obj.updateDynamic("allowReserved")(allowReserved.asInstanceOf[js.Any])
    if (!js.isUndefined(allowReturnOutsideFunction)) __obj.updateDynamic("allowReturnOutsideFunction")(allowReturnOutsideFunction.asInstanceOf[js.Any])
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (isRequire != null) __obj.updateDynamic("isRequire")(js.Any.fromFunction1(isRequire))
    if (!js.isUndefined(locations)) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

