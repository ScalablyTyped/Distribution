package typings
package escodegenLib.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FormatOptions extends js.Object {
  /**
       * Do not include superfluous whitespace characters and line terminators. Default is false.
       */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Escape as few characters in string literals as necessary. Default is false.
       */
  var escapeless: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Generate hexadecimal a numeric literal if it is shorter than its equivalents. Requires option.format.renumber. Default is false.
       */
  var hexadecimal: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The indent options
       */
  var indent: js.UndefOr[IndentOptions] = js.undefined
  /**
       * Enforce JSON format of numeric and string literals. This option takes precedence over option.format.hexadecimal and option.format.quotes. Default is false.
       */
  var json: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * New line string. Default is '\n'.
       */
  var newline: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Preserve parentheses in new expressions that have no arguments. Default is true.
       */
  var parentheses: js.UndefOr[scala.Boolean] = js.undefined
  var preserveBlankLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Delimiter to use for string literals. Accepted values are: 'single', 'double', and 'auto'. When 'auto' is specified, escodegen selects a delimiter that results in a shorter literal. Default is 'single'.
       */
  var quotes: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Try to generate shorter numeric literals than toString() (9.8.1). Default is false.
       */
  var renumber: js.UndefOr[scala.Boolean] = js.undefined
  var safeConcatenation: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Preserve semicolons at the end of blocks and programs. Default is true.
       */
  var semicolons: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * White space string. Default is standard ' ' (\x20).
       */
  var space: js.UndefOr[java.lang.String] = js.undefined
}

