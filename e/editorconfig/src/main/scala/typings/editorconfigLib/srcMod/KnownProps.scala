package typings
package editorconfigLib.srcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownProps extends js.Object {
  var charset: js.UndefOr[java.lang.String | editorconfigLib.editorconfigLibStrings.unset] = js.undefined
  var end_of_line: js.UndefOr[
    editorconfigLib.editorconfigLibStrings.lf | editorconfigLib.editorconfigLibStrings.crlf | editorconfigLib.editorconfigLibStrings.unset
  ] = js.undefined
  var indent_size: js.UndefOr[
    scala.Double | editorconfigLib.editorconfigLibStrings.tab | editorconfigLib.editorconfigLibStrings.unset
  ] = js.undefined
  var indent_style: js.UndefOr[
    editorconfigLib.editorconfigLibStrings.tab | editorconfigLib.editorconfigLibStrings.space | editorconfigLib.editorconfigLibStrings.unset
  ] = js.undefined
  var insert_final_newline: js.UndefOr[
    editorconfigLib.editorconfigLibNumbers.`true` | editorconfigLib.editorconfigLibNumbers.`false` | editorconfigLib.editorconfigLibStrings.unset
  ] = js.undefined
  var tab_width: js.UndefOr[scala.Double | editorconfigLib.editorconfigLibStrings.unset] = js.undefined
  var trim_trailing_whitespace: js.UndefOr[
    editorconfigLib.editorconfigLibNumbers.`true` | editorconfigLib.editorconfigLibNumbers.`false` | editorconfigLib.editorconfigLibStrings.unset
  ] = js.undefined
}

object KnownProps {
  @scala.inline
  def apply(
    charset: java.lang.String | editorconfigLib.editorconfigLibStrings.unset = null,
    end_of_line: editorconfigLib.editorconfigLibStrings.lf | editorconfigLib.editorconfigLibStrings.crlf | editorconfigLib.editorconfigLibStrings.unset = null,
    indent_size: scala.Double | editorconfigLib.editorconfigLibStrings.tab | editorconfigLib.editorconfigLibStrings.unset = null,
    indent_style: editorconfigLib.editorconfigLibStrings.tab | editorconfigLib.editorconfigLibStrings.space | editorconfigLib.editorconfigLibStrings.unset = null,
    insert_final_newline: editorconfigLib.editorconfigLibNumbers.`true` | editorconfigLib.editorconfigLibNumbers.`false` | editorconfigLib.editorconfigLibStrings.unset = null,
    tab_width: scala.Double | editorconfigLib.editorconfigLibStrings.unset = null,
    trim_trailing_whitespace: editorconfigLib.editorconfigLibNumbers.`true` | editorconfigLib.editorconfigLibNumbers.`false` | editorconfigLib.editorconfigLibStrings.unset = null
  ): KnownProps = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (end_of_line != null) __obj.updateDynamic("end_of_line")(end_of_line.asInstanceOf[js.Any])
    if (indent_size != null) __obj.updateDynamic("indent_size")(indent_size.asInstanceOf[js.Any])
    if (indent_style != null) __obj.updateDynamic("indent_style")(indent_style.asInstanceOf[js.Any])
    if (insert_final_newline != null) __obj.updateDynamic("insert_final_newline")(insert_final_newline.asInstanceOf[js.Any])
    if (tab_width != null) __obj.updateDynamic("tab_width")(tab_width.asInstanceOf[js.Any])
    if (trim_trailing_whitespace != null) __obj.updateDynamic("trim_trailing_whitespace")(trim_trailing_whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownProps]
  }
}

