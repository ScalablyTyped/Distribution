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
  /** @name dxHtmlEditor.format(formatName, formatValue) */
  def format(
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** @name dxHtmlEditor.formatLine(index, length, formatName, formatValue) */
  def formatLine(
    index: Double,
    length: Double,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** @name dxHtmlEditor.formatLine(index, length, formats) */
  def formatLine(index: Double, length: Double, formats: js.Any): Unit = js.native
  /** @name dxHtmlEditor.formatText(index, length, formatName, formatValue) */
  def formatText(
    index: Double,
    length: Double,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block` | String,
    formatValue: js.Any
  ): Unit = js.native
  /** @name dxHtmlEditor.formatText(index, length, formats) */
  def formatText(index: Double, length: Double, formats: js.Any): Unit = js.native
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

