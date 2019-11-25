package typings.escodegen.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatOptions extends js.Object {
  /**
    * Do not include superfluous whitespace characters and line terminators. Default is false.
    */
  var compact: js.UndefOr[Boolean] = js.undefined
  /**
    * Escape as few characters in string literals as necessary. Default is false.
    */
  var escapeless: js.UndefOr[Boolean] = js.undefined
  /**
    * Generate hexadecimal a numeric literal if it is shorter than its equivalents. Requires option.format.renumber. Default is false.
    */
  var hexadecimal: js.UndefOr[Boolean] = js.undefined
  /**
    * The indent options
    */
  var indent: js.UndefOr[IndentOptions] = js.undefined
  /**
    * Enforce JSON format of numeric and string literals. This option takes precedence over option.format.hexadecimal and option.format.quotes. Default is false.
    */
  var json: js.UndefOr[Boolean] = js.undefined
  /**
    * New line string. Default is '\n'.
    */
  var newline: js.UndefOr[String] = js.undefined
  /**
    * Preserve parentheses in new expressions that have no arguments. Default is true.
    */
  var parentheses: js.UndefOr[Boolean] = js.undefined
  var preserveBlankLines: js.UndefOr[Boolean] = js.undefined
  /**
    * Delimiter to use for string literals. Accepted values are: 'single', 'double', and 'auto'. When 'auto' is specified, escodegen selects a delimiter that results in a shorter literal. Default is 'single'.
    */
  var quotes: js.UndefOr[String] = js.undefined
  /**
    * Try to generate shorter numeric literals than toString() (9.8.1). Default is false.
    */
  var renumber: js.UndefOr[Boolean] = js.undefined
  var safeConcatenation: js.UndefOr[Boolean] = js.undefined
  /**
    * Preserve semicolons at the end of blocks and programs. Default is true.
    */
  var semicolons: js.UndefOr[Boolean] = js.undefined
  /**
    * White space string. Default is standard ' ' (\x20).
    */
  var space: js.UndefOr[String] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    escapeless: js.UndefOr[Boolean] = js.undefined,
    hexadecimal: js.UndefOr[Boolean] = js.undefined,
    indent: IndentOptions = null,
    json: js.UndefOr[Boolean] = js.undefined,
    newline: String = null,
    parentheses: js.UndefOr[Boolean] = js.undefined,
    preserveBlankLines: js.UndefOr[Boolean] = js.undefined,
    quotes: String = null,
    renumber: js.UndefOr[Boolean] = js.undefined,
    safeConcatenation: js.UndefOr[Boolean] = js.undefined,
    semicolons: js.UndefOr[Boolean] = js.undefined,
    space: String = null
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeless)) __obj.updateDynamic("escapeless")(escapeless.asInstanceOf[js.Any])
    if (!js.isUndefined(hexadecimal)) __obj.updateDynamic("hexadecimal")(hexadecimal.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (!js.isUndefined(parentheses)) __obj.updateDynamic("parentheses")(parentheses.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveBlankLines)) __obj.updateDynamic("preserveBlankLines")(preserveBlankLines.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(renumber)) __obj.updateDynamic("renumber")(renumber.asInstanceOf[js.Any])
    if (!js.isUndefined(safeConcatenation)) __obj.updateDynamic("safeConcatenation")(safeConcatenation.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolons)) __obj.updateDynamic("semicolons")(semicolons.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

