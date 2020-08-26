package typings.escodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptions extends js.Object {
  /**
    * Do not include superfluous whitespace characters and line terminators. Default is false.
    */
  var compact: js.UndefOr[Boolean] = js.native
  /**
    * Escape as few characters in string literals as necessary. Default is false.
    */
  var escapeless: js.UndefOr[Boolean] = js.native
  /**
    * Generate hexadecimal a numeric literal if it is shorter than its equivalents. Requires option.format.renumber. Default is false.
    */
  var hexadecimal: js.UndefOr[Boolean] = js.native
  /**
    * The indent options
    */
  var indent: js.UndefOr[IndentOptions] = js.native
  /**
    * Enforce JSON format of numeric and string literals. This option takes precedence over option.format.hexadecimal and option.format.quotes. Default is false.
    */
  var json: js.UndefOr[Boolean] = js.native
  /**
    * New line string. Default is '\n'.
    */
  var newline: js.UndefOr[String] = js.native
  /**
    * Preserve parentheses in new expressions that have no arguments. Default is true.
    */
  var parentheses: js.UndefOr[Boolean] = js.native
  var preserveBlankLines: js.UndefOr[Boolean] = js.native
  /**
    * Delimiter to use for string literals. Accepted values are: 'single', 'double', and 'auto'. When 'auto' is specified, escodegen selects a delimiter that results in a shorter literal. Default is 'single'.
    */
  var quotes: js.UndefOr[String] = js.native
  /**
    * Try to generate shorter numeric literals than toString() (9.8.1). Default is false.
    */
  var renumber: js.UndefOr[Boolean] = js.native
  var safeConcatenation: js.UndefOr[Boolean] = js.native
  /**
    * Preserve semicolons at the end of blocks and programs. Default is true.
    */
  var semicolons: js.UndefOr[Boolean] = js.native
  /**
    * White space string. Default is standard ' ' (\x20).
    */
  var space: js.UndefOr[String] = js.native
}

object FormatOptions {
  @scala.inline
  def apply(): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setEscapeless(value: Boolean): Self = this.set("escapeless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscapeless: Self = this.set("escapeless", js.undefined)
    @scala.inline
    def setHexadecimal(value: Boolean): Self = this.set("hexadecimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHexadecimal: Self = this.set("hexadecimal", js.undefined)
    @scala.inline
    def setIndent(value: IndentOptions): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setNewline(value: String): Self = this.set("newline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline: Self = this.set("newline", js.undefined)
    @scala.inline
    def setParentheses(value: Boolean): Self = this.set("parentheses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentheses: Self = this.set("parentheses", js.undefined)
    @scala.inline
    def setPreserveBlankLines(value: Boolean): Self = this.set("preserveBlankLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveBlankLines: Self = this.set("preserveBlankLines", js.undefined)
    @scala.inline
    def setQuotes(value: String): Self = this.set("quotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    @scala.inline
    def setRenumber(value: Boolean): Self = this.set("renumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenumber: Self = this.set("renumber", js.undefined)
    @scala.inline
    def setSafeConcatenation(value: Boolean): Self = this.set("safeConcatenation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeConcatenation: Self = this.set("safeConcatenation", js.undefined)
    @scala.inline
    def setSemicolons(value: Boolean): Self = this.set("semicolons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSemicolons: Self = this.set("semicolons", js.undefined)
    @scala.inline
    def setSpace(value: String): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
  
}

