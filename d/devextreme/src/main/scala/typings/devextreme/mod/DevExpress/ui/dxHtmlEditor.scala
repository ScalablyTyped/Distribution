package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.`code-block`
import typings.devextreme.devextremeStrings.align
import typings.devextreme.devextremeStrings.background
import typings.devextreme.devextremeStrings.blockquote
import typings.devextreme.devextremeStrings.bold
import typings.devextreme.devextremeStrings.color
import typings.devextreme.devextremeStrings.font
import typings.devextreme.devextremeStrings.header
import typings.devextreme.devextremeStrings.indent
import typings.devextreme.devextremeStrings.italic
import typings.devextreme.devextremeStrings.link
import typings.devextreme.devextremeStrings.list
import typings.devextreme.devextremeStrings.script
import typings.devextreme.devextremeStrings.size
import typings.devextreme.devextremeStrings.strike
import typings.devextreme.devextremeStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxHtmlEditor extends Editor {
  /** @name dxHtmlEditor.clearHistory() */
  def clearHistory(): Unit = js.native
  /** @name dxHtmlEditor.delete(index, length) */
  def delete(index: Double, length: Double): Unit = js.native
  def format(formatName: String, formatValue: js.Any): Unit = js.native
  def formatLine(index: Double, length: Double, formatName: String, formatValue: js.Any): Unit = js.native
  /** @name dxHtmlEditor.formatLine(index, length, formats) */
  def formatLine(index: Double, length: Double, formats: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_align(index: Double, length: Double, formatName: align, formatValue: js.Any): Unit = js.native
  /** @name dxHtmlEditor.formatLine(index, length, formatName, formatValue) */
  @JSName("formatLine")
  def formatLine_background(index: Double, length: Double, formatName: background, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_blockquote(index: Double, length: Double, formatName: blockquote, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_bold(index: Double, length: Double, formatName: bold, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_codeblock(index: Double, length: Double, formatName: `code-block`, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_color(index: Double, length: Double, formatName: color, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_font(index: Double, length: Double, formatName: font, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_header(index: Double, length: Double, formatName: header, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_indent(index: Double, length: Double, formatName: indent, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_italic(index: Double, length: Double, formatName: italic, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_link(index: Double, length: Double, formatName: link, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_list(index: Double, length: Double, formatName: list, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_script(index: Double, length: Double, formatName: script, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_size(index: Double, length: Double, formatName: size, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_strike(index: Double, length: Double, formatName: strike, formatValue: js.Any): Unit = js.native
  @JSName("formatLine")
  def formatLine_underline(index: Double, length: Double, formatName: underline, formatValue: js.Any): Unit = js.native
  def formatText(index: Double, length: Double, formatName: String, formatValue: js.Any): Unit = js.native
  /** @name dxHtmlEditor.formatText(index, length, formats) */
  def formatText(index: Double, length: Double, formats: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_align(index: Double, length: Double, formatName: align, formatValue: js.Any): Unit = js.native
  /** @name dxHtmlEditor.formatText(index, length, formatName, formatValue) */
  @JSName("formatText")
  def formatText_background(index: Double, length: Double, formatName: background, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_blockquote(index: Double, length: Double, formatName: blockquote, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_bold(index: Double, length: Double, formatName: bold, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_codeblock(index: Double, length: Double, formatName: `code-block`, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_color(index: Double, length: Double, formatName: color, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_font(index: Double, length: Double, formatName: font, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_header(index: Double, length: Double, formatName: header, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_indent(index: Double, length: Double, formatName: indent, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_italic(index: Double, length: Double, formatName: italic, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_link(index: Double, length: Double, formatName: link, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_list(index: Double, length: Double, formatName: list, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_script(index: Double, length: Double, formatName: script, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_size(index: Double, length: Double, formatName: size, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_strike(index: Double, length: Double, formatName: strike, formatValue: js.Any): Unit = js.native
  @JSName("formatText")
  def formatText_underline(index: Double, length: Double, formatName: underline, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_align(formatName: align, formatValue: js.Any): Unit = js.native
  /** @name dxHtmlEditor.format(formatName, formatValue) */
  @JSName("format")
  def format_background(formatName: background, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_blockquote(formatName: blockquote, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_bold(formatName: bold, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_codeblock(formatName: `code-block`, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_color(formatName: color, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_font(formatName: font, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_header(formatName: header, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_indent(formatName: indent, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_italic(formatName: italic, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_link(formatName: link, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_list(formatName: list, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_script(formatName: script, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_size(formatName: size, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_strike(formatName: strike, formatValue: js.Any): Unit = js.native
  @JSName("format")
  def format_underline(formatName: underline, formatValue: js.Any): Unit = js.native
  /** @name dxHtmlEditor.get(componentPath) */
  def get(componentPath: String): js.Any = js.native
  /** @name dxHtmlEditor.getFormat(index, length) */
  def getFormat(index: Double, length: Double): js.Any = js.native
  /** @name dxHtmlEditor.getLength() */
  def getLength(): Double = js.native
  /** @name dxHtmlEditor.getQuillInstance() */
  def getQuillInstance(): js.Any = js.native
  /** @name dxHtmlEditor.getSelection() */
  def getSelection(): js.Any = js.native
  /** @name dxHtmlEditor.insertEmbed(index, type, config) */
  def insertEmbed(index: Double, `type`: String, config: js.Any): Unit = js.native
  /** @name dxHtmlEditor.insertText(index, text, formats) */
  def insertText(index: Double, text: String, formats: js.Any): Unit = js.native
  /** @name dxHtmlEditor.redo() */
  def redo(): Unit = js.native
  /** @name dxHtmlEditor.register(components) */
  def register(modules: js.Any): Unit = js.native
  /** @name dxHtmlEditor.removeFormat(index, length) */
  def removeFormat(index: Double, length: Double): Unit = js.native
  /** @name dxHtmlEditor.setSelection(index, length) */
  def setSelection(index: Double, length: Double): Unit = js.native
  /** @name dxHtmlEditor.undo() */
  def undo(): Unit = js.native
}

