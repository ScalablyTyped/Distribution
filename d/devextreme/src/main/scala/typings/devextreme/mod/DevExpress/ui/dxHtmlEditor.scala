package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxHtmlEditor.HtmlEditorFormat
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxHtmlEditor
  extends StObject
     with Editor[dxHtmlEditorOptions] {
  
  /**
    * Removes focus from the content field of the editor.
    */
  def blur(): Unit = js.native
  
  /**
    * Clears the history of changes.
    */
  def clearHistory(): Unit = js.native
  
  /**
    * Deletes content from the given range.
    */
  def delete(index: Double, length: Double): Unit = js.native
  
  def format(formatName: String, formatValue: Any): Unit = js.native
  /**
    * Applies a format to the selected content. Cannot be used with embedded formats.
    */
  def format(formatName: HtmlEditorFormat, formatValue: Any): Unit = js.native
  
  def formatLine(index: Double, length: Double, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Applies a single block format to all lines in the given range.
    */
  def formatLine(index: Double, length: Double, formatName: HtmlEditorFormat, formatValue: Any): Unit = js.native
  /**
    * Applies several block formats to all lines in the given range.
    */
  def formatLine(index: Double, length: Double, formats: Any): Unit = js.native
  
  def formatText(index: Double, length: Double, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Applies a single text format to all characters in the given range.
    */
  def formatText(index: Double, length: Double, formatName: HtmlEditorFormat, formatValue: Any): Unit = js.native
  /**
    * Applies several text formats to all characters in the given range.
    */
  def formatText(index: Double, length: Double, formats: Any): Unit = js.native
  
  /**
    * Gets a format, module, or Parchment.
    */
  def get(componentPath: String): Any = js.native
  
  /**
    * Retrieves the pixel position and size of a selection at a specified location.
    */
  def getBounds(index: Double, length: Double): Any = js.native
  
  /**
    * Retrieves formatting of the text within the current selection range.
    */
  def getFormat(): Any = js.native
  /**
    * Gets formats applied to the content in the specified range.
    */
  def getFormat(index: Double, length: Double): Any = js.native
  
  /**
    * Gets the entire content&apos;s length.
    */
  def getLength(): Double = js.native
  
  /**
    * Gets the instance of a module.
    */
  def getModule(moduleName: String): Any = js.native
  
  /**
    * Gets the DevExtreme Quill&apos;s instance.
    */
  def getQuillInstance(): Any = js.native
  
  /**
    * Gets the selected content&apos;s position and length.
    */
  def getSelection(): Any = js.native
  def getSelection(focus: Boolean): Any = js.native
  
  /**
    * Retrieves text content from the HtmlEditor.
    */
  def getText(index: Double, length: Double): String = js.native
  
  /**
    * Inserts an embedded content at the specified position.
    */
  def insertEmbed(index: Double, `type`: String, config: Any): Unit = js.native
  
  def insertText(index: Double, text: String, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Inserts text into the HtmlEditor.
    */
  def insertText(index: Double, text: String, formatName: HtmlEditorFormat, formatValue: Any): Unit = js.native
  /**
    * Inserts formatted text at the specified position. Used with all formats except embedded.
    */
  def insertText(index: Double, text: String, formats: Any): Unit = js.native
  
  /**
    * Reapplies the most recent undone change. Repeated calls reapply preceding undone changes.
    */
  def redo(): Unit = js.native
  
  /**
    * Registers custom formats and modules.
    */
  def register(modules: Any): Unit = js.native
  
  /**
    * Removes all formatting and embedded content from the specified range.
    */
  def removeFormat(index: Double, length: Double): Unit = js.native
  
  /**
    * Selects and highlights content in the specified range.
    */
  def setSelection(index: Double, length: Double): Unit = js.native
  
  /**
    * Reverses the most recent change. Repeated calls reverse preceding changes.
    */
  def undo(): Unit = js.native
}
object dxHtmlEditor {
  
  type ContentReadyEvent = EventInfo[dxHtmlEditor]
  
  type ContextMenuItem = dxHtmlEditorTableContextMenuItem
  
  type DisposingEvent = EventInfo[dxHtmlEditor]
  
  type FocusInEvent = NativeEventInfo[dxHtmlEditor, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxHtmlEditor, FocusEvent]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.background
    - typings.devextreme.devextremeStrings.bold
    - typings.devextreme.devextremeStrings.color
    - typings.devextreme.devextremeStrings.font
    - typings.devextreme.devextremeStrings.italic
    - typings.devextreme.devextremeStrings.link
    - typings.devextreme.devextremeStrings.size
    - typings.devextreme.devextremeStrings.strike
    - typings.devextreme.devextremeStrings.script
    - typings.devextreme.devextremeStrings.underline
    - typings.devextreme.devextremeStrings.blockquote
    - typings.devextreme.devextremeStrings.header
    - typings.devextreme.devextremeStrings.indent
    - typings.devextreme.devextremeStrings.list
    - typings.devextreme.devextremeStrings.align
    - typings.devextreme.devextremeStrings.`code-block`
  */
  trait HtmlEditorFormat extends StObject
  object HtmlEditorFormat {
    
    inline def align: typings.devextreme.devextremeStrings.align = "align".asInstanceOf[typings.devextreme.devextremeStrings.align]
    
    inline def background: typings.devextreme.devextremeStrings.background = "background".asInstanceOf[typings.devextreme.devextremeStrings.background]
    
    inline def blockquote: typings.devextreme.devextremeStrings.blockquote = "blockquote".asInstanceOf[typings.devextreme.devextremeStrings.blockquote]
    
    inline def bold: typings.devextreme.devextremeStrings.bold = "bold".asInstanceOf[typings.devextreme.devextremeStrings.bold]
    
    inline def `code-block`: typings.devextreme.devextremeStrings.`code-block` = "code-block".asInstanceOf[typings.devextreme.devextremeStrings.`code-block`]
    
    inline def color: typings.devextreme.devextremeStrings.color = "color".asInstanceOf[typings.devextreme.devextremeStrings.color]
    
    inline def font: typings.devextreme.devextremeStrings.font = "font".asInstanceOf[typings.devextreme.devextremeStrings.font]
    
    inline def header: typings.devextreme.devextremeStrings.header = "header".asInstanceOf[typings.devextreme.devextremeStrings.header]
    
    inline def indent: typings.devextreme.devextremeStrings.indent = "indent".asInstanceOf[typings.devextreme.devextremeStrings.indent]
    
    inline def italic: typings.devextreme.devextremeStrings.italic = "italic".asInstanceOf[typings.devextreme.devextremeStrings.italic]
    
    inline def link: typings.devextreme.devextremeStrings.link = "link".asInstanceOf[typings.devextreme.devextremeStrings.link]
    
    inline def list: typings.devextreme.devextremeStrings.list = "list".asInstanceOf[typings.devextreme.devextremeStrings.list]
    
    inline def script: typings.devextreme.devextremeStrings.script = "script".asInstanceOf[typings.devextreme.devextremeStrings.script]
    
    inline def size: typings.devextreme.devextremeStrings.size = "size".asInstanceOf[typings.devextreme.devextremeStrings.size]
    
    inline def strike: typings.devextreme.devextremeStrings.strike = "strike".asInstanceOf[typings.devextreme.devextremeStrings.strike]
    
    inline def underline: typings.devextreme.devextremeStrings.underline = "underline".asInstanceOf[typings.devextreme.devextremeStrings.underline]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.base64
    - typings.devextreme.devextremeStrings.server
    - typings.devextreme.devextremeStrings.both
  */
  trait HtmlEditorImageUploadMode extends StObject
  object HtmlEditorImageUploadMode {
    
    inline def base64: typings.devextreme.devextremeStrings.base64 = "base64".asInstanceOf[typings.devextreme.devextremeStrings.base64]
    
    inline def both: typings.devextreme.devextremeStrings.both = "both".asInstanceOf[typings.devextreme.devextremeStrings.both]
    
    inline def server: typings.devextreme.devextremeStrings.server = "server".asInstanceOf[typings.devextreme.devextremeStrings.server]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.url
    - typings.devextreme.devextremeStrings.file
  */
  trait HtmlEditorImageUploadTab extends StObject
  object HtmlEditorImageUploadTab {
    
    inline def file: typings.devextreme.devextremeStrings.file = "file".asInstanceOf[typings.devextreme.devextremeStrings.file]
    
    inline def url: typings.devextreme.devextremeStrings.url = "url".asInstanceOf[typings.devextreme.devextremeStrings.url]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.background
    - typings.devextreme.devextremeStrings.bold
    - typings.devextreme.devextremeStrings.color
    - typings.devextreme.devextremeStrings.font
    - typings.devextreme.devextremeStrings.italic
    - typings.devextreme.devextremeStrings.link
    - typings.devextreme.devextremeStrings.image
    - typings.devextreme.devextremeStrings.strike
    - typings.devextreme.devextremeStrings.subscript
    - typings.devextreme.devextremeStrings.superscript
    - typings.devextreme.devextremeStrings.underline
    - typings.devextreme.devextremeStrings.blockquote
    - typings.devextreme.devextremeStrings.increaseIndent
    - typings.devextreme.devextremeStrings.decreaseIndent
    - typings.devextreme.devextremeStrings.orderedList
    - typings.devextreme.devextremeStrings.bulletList
    - typings.devextreme.devextremeStrings.alignLeft
    - typings.devextreme.devextremeStrings.alignCenter
    - typings.devextreme.devextremeStrings.alignRight
    - typings.devextreme.devextremeStrings.alignJustify
    - typings.devextreme.devextremeStrings.codeBlock
    - typings.devextreme.devextremeStrings.variable
    - typings.devextreme.devextremeStrings.undo
    - typings.devextreme.devextremeStrings.redo
    - typings.devextreme.devextremeStrings.clear
    - typings.devextreme.devextremeStrings.insertTable
    - typings.devextreme.devextremeStrings.insertHeaderRow
    - typings.devextreme.devextremeStrings.insertRowAbove
    - typings.devextreme.devextremeStrings.insertRowBelow
    - typings.devextreme.devextremeStrings.insertColumnLeft
    - typings.devextreme.devextremeStrings.insertColumnRight
    - typings.devextreme.devextremeStrings.deleteColumn
    - typings.devextreme.devextremeStrings.deleteRow
    - typings.devextreme.devextremeStrings.deleteTable
    - typings.devextreme.devextremeStrings.cellProperties
    - typings.devextreme.devextremeStrings.tableProperties
  */
  trait HtmlEditorPredefinedContextMenuItem extends StObject
  object HtmlEditorPredefinedContextMenuItem {
    
    inline def alignCenter: typings.devextreme.devextremeStrings.alignCenter = "alignCenter".asInstanceOf[typings.devextreme.devextremeStrings.alignCenter]
    
    inline def alignJustify: typings.devextreme.devextremeStrings.alignJustify = "alignJustify".asInstanceOf[typings.devextreme.devextremeStrings.alignJustify]
    
    inline def alignLeft: typings.devextreme.devextremeStrings.alignLeft = "alignLeft".asInstanceOf[typings.devextreme.devextremeStrings.alignLeft]
    
    inline def alignRight: typings.devextreme.devextremeStrings.alignRight = "alignRight".asInstanceOf[typings.devextreme.devextremeStrings.alignRight]
    
    inline def background: typings.devextreme.devextremeStrings.background = "background".asInstanceOf[typings.devextreme.devextremeStrings.background]
    
    inline def blockquote: typings.devextreme.devextremeStrings.blockquote = "blockquote".asInstanceOf[typings.devextreme.devextremeStrings.blockquote]
    
    inline def bold: typings.devextreme.devextremeStrings.bold = "bold".asInstanceOf[typings.devextreme.devextremeStrings.bold]
    
    inline def bulletList: typings.devextreme.devextremeStrings.bulletList = "bulletList".asInstanceOf[typings.devextreme.devextremeStrings.bulletList]
    
    inline def cellProperties: typings.devextreme.devextremeStrings.cellProperties = "cellProperties".asInstanceOf[typings.devextreme.devextremeStrings.cellProperties]
    
    inline def clear: typings.devextreme.devextremeStrings.clear = "clear".asInstanceOf[typings.devextreme.devextremeStrings.clear]
    
    inline def codeBlock: typings.devextreme.devextremeStrings.codeBlock = "codeBlock".asInstanceOf[typings.devextreme.devextremeStrings.codeBlock]
    
    inline def color: typings.devextreme.devextremeStrings.color = "color".asInstanceOf[typings.devextreme.devextremeStrings.color]
    
    inline def decreaseIndent: typings.devextreme.devextremeStrings.decreaseIndent = "decreaseIndent".asInstanceOf[typings.devextreme.devextremeStrings.decreaseIndent]
    
    inline def deleteColumn: typings.devextreme.devextremeStrings.deleteColumn = "deleteColumn".asInstanceOf[typings.devextreme.devextremeStrings.deleteColumn]
    
    inline def deleteRow: typings.devextreme.devextremeStrings.deleteRow = "deleteRow".asInstanceOf[typings.devextreme.devextremeStrings.deleteRow]
    
    inline def deleteTable: typings.devextreme.devextremeStrings.deleteTable = "deleteTable".asInstanceOf[typings.devextreme.devextremeStrings.deleteTable]
    
    inline def font: typings.devextreme.devextremeStrings.font = "font".asInstanceOf[typings.devextreme.devextremeStrings.font]
    
    inline def image: typings.devextreme.devextremeStrings.image = "image".asInstanceOf[typings.devextreme.devextremeStrings.image]
    
    inline def increaseIndent: typings.devextreme.devextremeStrings.increaseIndent = "increaseIndent".asInstanceOf[typings.devextreme.devextremeStrings.increaseIndent]
    
    inline def insertColumnLeft: typings.devextreme.devextremeStrings.insertColumnLeft = "insertColumnLeft".asInstanceOf[typings.devextreme.devextremeStrings.insertColumnLeft]
    
    inline def insertColumnRight: typings.devextreme.devextremeStrings.insertColumnRight = "insertColumnRight".asInstanceOf[typings.devextreme.devextremeStrings.insertColumnRight]
    
    inline def insertHeaderRow: typings.devextreme.devextremeStrings.insertHeaderRow = "insertHeaderRow".asInstanceOf[typings.devextreme.devextremeStrings.insertHeaderRow]
    
    inline def insertRowAbove: typings.devextreme.devextremeStrings.insertRowAbove = "insertRowAbove".asInstanceOf[typings.devextreme.devextremeStrings.insertRowAbove]
    
    inline def insertRowBelow: typings.devextreme.devextremeStrings.insertRowBelow = "insertRowBelow".asInstanceOf[typings.devextreme.devextremeStrings.insertRowBelow]
    
    inline def insertTable: typings.devextreme.devextremeStrings.insertTable = "insertTable".asInstanceOf[typings.devextreme.devextremeStrings.insertTable]
    
    inline def italic: typings.devextreme.devextremeStrings.italic = "italic".asInstanceOf[typings.devextreme.devextremeStrings.italic]
    
    inline def link: typings.devextreme.devextremeStrings.link = "link".asInstanceOf[typings.devextreme.devextremeStrings.link]
    
    inline def orderedList: typings.devextreme.devextremeStrings.orderedList = "orderedList".asInstanceOf[typings.devextreme.devextremeStrings.orderedList]
    
    inline def redo: typings.devextreme.devextremeStrings.redo = "redo".asInstanceOf[typings.devextreme.devextremeStrings.redo]
    
    inline def strike: typings.devextreme.devextremeStrings.strike = "strike".asInstanceOf[typings.devextreme.devextremeStrings.strike]
    
    inline def subscript: typings.devextreme.devextremeStrings.subscript = "subscript".asInstanceOf[typings.devextreme.devextremeStrings.subscript]
    
    inline def superscript: typings.devextreme.devextremeStrings.superscript = "superscript".asInstanceOf[typings.devextreme.devextremeStrings.superscript]
    
    inline def tableProperties: typings.devextreme.devextremeStrings.tableProperties = "tableProperties".asInstanceOf[typings.devextreme.devextremeStrings.tableProperties]
    
    inline def underline: typings.devextreme.devextremeStrings.underline = "underline".asInstanceOf[typings.devextreme.devextremeStrings.underline]
    
    inline def undo: typings.devextreme.devextremeStrings.undo = "undo".asInstanceOf[typings.devextreme.devextremeStrings.undo]
    
    inline def variable: typings.devextreme.devextremeStrings.variable = "variable".asInstanceOf[typings.devextreme.devextremeStrings.variable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.background
    - typings.devextreme.devextremeStrings.bold
    - typings.devextreme.devextremeStrings.color
    - typings.devextreme.devextremeStrings.font
    - typings.devextreme.devextremeStrings.italic
    - typings.devextreme.devextremeStrings.link
    - typings.devextreme.devextremeStrings.image
    - typings.devextreme.devextremeStrings.size
    - typings.devextreme.devextremeStrings.strike
    - typings.devextreme.devextremeStrings.subscript
    - typings.devextreme.devextremeStrings.superscript
    - typings.devextreme.devextremeStrings.underline
    - typings.devextreme.devextremeStrings.blockquote
    - typings.devextreme.devextremeStrings.header
    - typings.devextreme.devextremeStrings.increaseIndent
    - typings.devextreme.devextremeStrings.decreaseIndent
    - typings.devextreme.devextremeStrings.orderedList
    - typings.devextreme.devextremeStrings.bulletList
    - typings.devextreme.devextremeStrings.alignLeft
    - typings.devextreme.devextremeStrings.alignCenter
    - typings.devextreme.devextremeStrings.alignRight
    - typings.devextreme.devextremeStrings.alignJustify
    - typings.devextreme.devextremeStrings.codeBlock
    - typings.devextreme.devextremeStrings.variable
    - typings.devextreme.devextremeStrings.separator
    - typings.devextreme.devextremeStrings.undo
    - typings.devextreme.devextremeStrings.redo
    - typings.devextreme.devextremeStrings.clear
    - typings.devextreme.devextremeStrings.cellProperties
    - typings.devextreme.devextremeStrings.tableProperties
    - typings.devextreme.devextremeStrings.insertTable
    - typings.devextreme.devextremeStrings.insertHeaderRow
    - typings.devextreme.devextremeStrings.insertRowAbove
    - typings.devextreme.devextremeStrings.insertRowBelow
    - typings.devextreme.devextremeStrings.insertColumnLeft
    - typings.devextreme.devextremeStrings.insertColumnRight
    - typings.devextreme.devextremeStrings.deleteColumn
    - typings.devextreme.devextremeStrings.deleteRow
    - typings.devextreme.devextremeStrings.deleteTable
  */
  trait HtmlEditorPredefinedToolbarItem extends StObject
  object HtmlEditorPredefinedToolbarItem {
    
    inline def alignCenter: typings.devextreme.devextremeStrings.alignCenter = "alignCenter".asInstanceOf[typings.devextreme.devextremeStrings.alignCenter]
    
    inline def alignJustify: typings.devextreme.devextremeStrings.alignJustify = "alignJustify".asInstanceOf[typings.devextreme.devextremeStrings.alignJustify]
    
    inline def alignLeft: typings.devextreme.devextremeStrings.alignLeft = "alignLeft".asInstanceOf[typings.devextreme.devextremeStrings.alignLeft]
    
    inline def alignRight: typings.devextreme.devextremeStrings.alignRight = "alignRight".asInstanceOf[typings.devextreme.devextremeStrings.alignRight]
    
    inline def background: typings.devextreme.devextremeStrings.background = "background".asInstanceOf[typings.devextreme.devextremeStrings.background]
    
    inline def blockquote: typings.devextreme.devextremeStrings.blockquote = "blockquote".asInstanceOf[typings.devextreme.devextremeStrings.blockquote]
    
    inline def bold: typings.devextreme.devextremeStrings.bold = "bold".asInstanceOf[typings.devextreme.devextremeStrings.bold]
    
    inline def bulletList: typings.devextreme.devextremeStrings.bulletList = "bulletList".asInstanceOf[typings.devextreme.devextremeStrings.bulletList]
    
    inline def cellProperties: typings.devextreme.devextremeStrings.cellProperties = "cellProperties".asInstanceOf[typings.devextreme.devextremeStrings.cellProperties]
    
    inline def clear: typings.devextreme.devextremeStrings.clear = "clear".asInstanceOf[typings.devextreme.devextremeStrings.clear]
    
    inline def codeBlock: typings.devextreme.devextremeStrings.codeBlock = "codeBlock".asInstanceOf[typings.devextreme.devextremeStrings.codeBlock]
    
    inline def color: typings.devextreme.devextremeStrings.color = "color".asInstanceOf[typings.devextreme.devextremeStrings.color]
    
    inline def decreaseIndent: typings.devextreme.devextremeStrings.decreaseIndent = "decreaseIndent".asInstanceOf[typings.devextreme.devextremeStrings.decreaseIndent]
    
    inline def deleteColumn: typings.devextreme.devextremeStrings.deleteColumn = "deleteColumn".asInstanceOf[typings.devextreme.devextremeStrings.deleteColumn]
    
    inline def deleteRow: typings.devextreme.devextremeStrings.deleteRow = "deleteRow".asInstanceOf[typings.devextreme.devextremeStrings.deleteRow]
    
    inline def deleteTable: typings.devextreme.devextremeStrings.deleteTable = "deleteTable".asInstanceOf[typings.devextreme.devextremeStrings.deleteTable]
    
    inline def font: typings.devextreme.devextremeStrings.font = "font".asInstanceOf[typings.devextreme.devextremeStrings.font]
    
    inline def header: typings.devextreme.devextremeStrings.header = "header".asInstanceOf[typings.devextreme.devextremeStrings.header]
    
    inline def image: typings.devextreme.devextremeStrings.image = "image".asInstanceOf[typings.devextreme.devextremeStrings.image]
    
    inline def increaseIndent: typings.devextreme.devextremeStrings.increaseIndent = "increaseIndent".asInstanceOf[typings.devextreme.devextremeStrings.increaseIndent]
    
    inline def insertColumnLeft: typings.devextreme.devextremeStrings.insertColumnLeft = "insertColumnLeft".asInstanceOf[typings.devextreme.devextremeStrings.insertColumnLeft]
    
    inline def insertColumnRight: typings.devextreme.devextremeStrings.insertColumnRight = "insertColumnRight".asInstanceOf[typings.devextreme.devextremeStrings.insertColumnRight]
    
    inline def insertHeaderRow: typings.devextreme.devextremeStrings.insertHeaderRow = "insertHeaderRow".asInstanceOf[typings.devextreme.devextremeStrings.insertHeaderRow]
    
    inline def insertRowAbove: typings.devextreme.devextremeStrings.insertRowAbove = "insertRowAbove".asInstanceOf[typings.devextreme.devextremeStrings.insertRowAbove]
    
    inline def insertRowBelow: typings.devextreme.devextremeStrings.insertRowBelow = "insertRowBelow".asInstanceOf[typings.devextreme.devextremeStrings.insertRowBelow]
    
    inline def insertTable: typings.devextreme.devextremeStrings.insertTable = "insertTable".asInstanceOf[typings.devextreme.devextremeStrings.insertTable]
    
    inline def italic: typings.devextreme.devextremeStrings.italic = "italic".asInstanceOf[typings.devextreme.devextremeStrings.italic]
    
    inline def link: typings.devextreme.devextremeStrings.link = "link".asInstanceOf[typings.devextreme.devextremeStrings.link]
    
    inline def orderedList: typings.devextreme.devextremeStrings.orderedList = "orderedList".asInstanceOf[typings.devextreme.devextremeStrings.orderedList]
    
    inline def redo: typings.devextreme.devextremeStrings.redo = "redo".asInstanceOf[typings.devextreme.devextremeStrings.redo]
    
    inline def separator: typings.devextreme.devextremeStrings.separator = "separator".asInstanceOf[typings.devextreme.devextremeStrings.separator]
    
    inline def size: typings.devextreme.devextremeStrings.size = "size".asInstanceOf[typings.devextreme.devextremeStrings.size]
    
    inline def strike: typings.devextreme.devextremeStrings.strike = "strike".asInstanceOf[typings.devextreme.devextremeStrings.strike]
    
    inline def subscript: typings.devextreme.devextremeStrings.subscript = "subscript".asInstanceOf[typings.devextreme.devextremeStrings.subscript]
    
    inline def superscript: typings.devextreme.devextremeStrings.superscript = "superscript".asInstanceOf[typings.devextreme.devextremeStrings.superscript]
    
    inline def tableProperties: typings.devextreme.devextremeStrings.tableProperties = "tableProperties".asInstanceOf[typings.devextreme.devextremeStrings.tableProperties]
    
    inline def underline: typings.devextreme.devextremeStrings.underline = "underline".asInstanceOf[typings.devextreme.devextremeStrings.underline]
    
    inline def undo: typings.devextreme.devextremeStrings.undo = "undo".asInstanceOf[typings.devextreme.devextremeStrings.undo]
    
    inline def variable: typings.devextreme.devextremeStrings.variable = "variable".asInstanceOf[typings.devextreme.devextremeStrings.variable]
  }
  
  type ImageUploadTab = dxHtmlEditorImageUploadTabItem
  
  type InitializedEvent = InitializedEventInfo[dxHtmlEditor]
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.html
    - typings.devextreme.devextremeStrings.markdown
  */
  trait MarkupType extends StObject
  object MarkupType {
    
    inline def html: typings.devextreme.devextremeStrings.html = "html".asInstanceOf[typings.devextreme.devextremeStrings.html]
    
    inline def markdown: typings.devextreme.devextremeStrings.markdown = "markdown".asInstanceOf[typings.devextreme.devextremeStrings.markdown]
  }
  
  trait MentionTemplateData extends StObject {
    
    val id: js.UndefOr[String | Double] = js.undefined
    
    val marker: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object MentionTemplateData {
    
    inline def apply(marker: String): MentionTemplateData = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionTemplateData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MentionTemplateData] (val x: Self) extends AnyVal {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxHtmlEditor]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxHtmlEditor, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxHtmlEditorOptions
  
  type ToolbarItem = dxHtmlEditorToolbarItem
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxHtmlEditor, KeyboardEvent | ClipboardEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxHtmlEditor, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
