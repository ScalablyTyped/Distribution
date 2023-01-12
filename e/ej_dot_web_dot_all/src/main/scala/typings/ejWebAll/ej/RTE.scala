package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTE
  extends StObject
     with Widget_ {
  
  /** Returns the range object.
    * @returns {any}
    */
  def createRange(): Any = js.native
  
  var defaults: Model = js.native
  
  /** Disables the RTE control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Disables the corresponding tool in the RTE ToolBar.
    * @returns {void}
    */
  def disableToolbarItem(): Unit = js.native
  
  /** Enables the RTE control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Enables the corresponding tool in the toolbar when the tool is disabled.
    * @returns {void}
    */
  def enableToolbarItem(): Unit = js.native
  
  /** Performs the action value based on the given command.
    * @param {string} Command Name.
    * @param {any} Content to be inserted as argument.
    * @param {boolean} Boolean value to specify whether the argument is textNode or not, this is optional.
    * @returns {void}
    */
  def executeCommand(cmdName: String, args: Any): Unit = js.native
  def executeCommand(cmdName: String, args: Any, textnodeType: Boolean): Unit = js.native
  
  /** Focuses the RTE control.
    * @returns {void}
    */
  def focus(): Unit = js.native
  
  /** Gets the command status of the selected text based on the given comment in the RTE control.
    * @returns {boolean}
    */
  def getCommandStatus(): Boolean = js.native
  
  /** Gets the Document from the RTE control.
    * @returns {Document}
    */
  def getDocument(): Document = js.native
  
  /** Gets the HTML string from the RTE control.
    * @returns {HTMLElement}
    */
  def getHtml(): HTMLElement = js.native
  
  /** Gets the selected HTML string from the RTE control.
    * @returns {HTMLElement}
    */
  def getSelectedHtml(): HTMLElement = js.native
  
  /** Gets the content as string from the RTE control.
    * @returns {string}
    */
  def getText(): String = js.native
  
  /** Hides the RTE control.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  /** Add a table column at the right or left of the specified cell
    * @param {boolean} If itâ€™s true, add a column at the left of the cell, otherwise add a column at the right of the cell
    * @param {JQuery} Column will be added based on the given cell element
    * @returns {HTMLElement}
    */
  def insertColumn(): HTMLElement = js.native
  def insertColumn(before: Boolean): HTMLElement = js.native
  def insertColumn(before: Boolean, cell: JQuery): HTMLElement = js.native
  def insertColumn(before: Unit, cell: JQuery): HTMLElement = js.native
  
  /** Inserts new item to the target contextmenu node.
    * @returns {void}
    */
  def insertMenuOption(): Unit = js.native
  
  /** To add a table row below or above the specified cell.
    * @param {boolean} If itâ€™s true, add a row before the cell, otherwise add a row after the cell
    * @param {JQuery} Row will be added based on the given cell element
    * @returns {HTMLElement}
    */
  def insertRow(): HTMLElement = js.native
  def insertRow(before: Boolean): HTMLElement = js.native
  def insertRow(before: Boolean, cell: JQuery): HTMLElement = js.native
  def insertRow(before: Unit, cell: JQuery): HTMLElement = js.native
  
  @JSName("model")
  var model_RTE: Model = js.native
  
  /** This method helps to insert/paste the content at the current cursor (caret) position or the selected content to be replaced with our text by passing the value as parameter to the
    * pasteContent method in the Editor.
    * @param {string} paste content
    * @returns {void}
    */
  def pasteContent(html: String): Unit = js.native
  
  /** Refreshes the RTE control.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Removes the specified table column.
    * @param {JQuery} Remove the given column element
    * @returns {void}
    */
  def removeColumn(): Unit = js.native
  def removeColumn(cell: JQuery): Unit = js.native
  
  /** Removes the target menu item from the RTE contextmenu.
    * @returns {void}
    */
  def removeMenuOption(): Unit = js.native
  
  /** Removes the specified table row.
    * @param {JQuery} Remove the given row element
    * @returns {void}
    */
  def removeRow(): Unit = js.native
  def removeRow(cell: JQuery): Unit = js.native
  
  /** Deletes the specified table.
    * @param {JQuery} Remove the given table
    * @returns {void}
    */
  def removeTable(): Unit = js.native
  def removeTable(table: JQuery): Unit = js.native
  
  /** Removes the given tool from the RTE Toolbar.
    * @returns {void}
    */
  def removeToolbarItem(): Unit = js.native
  
  /** Selects all the contents within the RTE.
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  
  /** Selects the contents in the given range.
    * @returns {void}
    */
  def selectRange(): Unit = js.native
  
  /** Sets the color picker model type rendered initially in the RTE control.
    * @returns {void}
    */
  def setColorPickerType(): Unit = js.native
  
  /** Sets the HTML string from the RTE control.
    * @returns {void}
    */
  def setHtml(): Unit = js.native
  
  /** Displays the RTE control.
    * @returns {void}
    */
  def show(): Unit = js.native
}
object RTE {
  
  @js.native
  sealed trait ToolbarOverflowMode extends StObject
  @JSGlobal("ej.RTE.ToolbarOverflowMode")
  @js.native
  object ToolbarOverflowMode extends StObject {
    
    ///To display the RTE toolbar overflow items as inline toolbar
    @js.native
    sealed trait Inline
      extends StObject
         with ToolbarOverflowMode
    
    ///To display the RTE toolbar overflow items as popup
    @js.native
    sealed trait Popup
      extends StObject
         with ToolbarOverflowMode
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** When the event is canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the RTE model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextMenuClickEventArgs extends StObject {
    
    /** returns clicked menu item element.
      */
    var element: js.UndefOr[Any] = js.undefined
    
    /** returns the selected item.
      */
    var selectedItem: js.UndefOr[Double] = js.undefined
    
    /** returns clicked menu item text.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object ContextMenuClickEventArgs {
    
    inline def apply(): ContextMenuClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setSelectedItem(value: Double): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** When the event is canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the RTE model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** When the event is canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the RTE model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExecuteEventArgs extends StObject {
    
    /** When the event is canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the RTE model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ExecuteEventArgs {
    
    inline def apply(): ExecuteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecuteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExportToPdfSettings extends StObject {
    
    /** Specifies the file name for the exported pdf file.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** This API is used to receive the server-side handler for export related operations.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ExportToPdfSettings {
    
    inline def apply(): ExportToPdfSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportToPdfSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportToPdfSettings] (val x: Self) extends AnyVal {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ExportToWordSettings extends StObject {
    
    /** Specifies the file name for the exported word file.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** This API is used to receive the server-side handler for export related operations.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ExportToWordSettings {
    
    inline def apply(): ExportToWordSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportToWordSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportToWordSettings] (val x: Self) extends AnyVal {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait FileBrowser extends StObject {
    
    /** This API is used to receive the server-side handler for file related operations.
      */
    var ajaxAction: js.UndefOr[String] = js.undefined
    
    /** Specifies the file type extension shown in the file browser window.
      */
    var extensionAllow: js.UndefOr[String] = js.undefined
    
    /** Specifies the directory to perform operations like create, delete and rename folder and files, and upload the selected files to the current directory.
      */
    var filePath: js.UndefOr[String] = js.undefined
  }
  object FileBrowser {
    
    inline def apply(): FileBrowser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileBrowser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileBrowser] (val x: Self) extends AnyVal {
      
      inline def setAjaxAction(value: String): Self = StObject.set(x, "ajaxAction", value.asInstanceOf[js.Any])
      
      inline def setAjaxActionUndefined: Self = StObject.set(x, "ajaxAction", js.undefined)
      
      inline def setExtensionAllow(value: String): Self = StObject.set(x, "extensionAllow", value.asInstanceOf[js.Any])
      
      inline def setExtensionAllowUndefined: Self = StObject.set(x, "extensionAllow", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    }
  }
  
  trait ImageBrowser extends StObject {
    
    /** This API is used to receive the server-side handler for the file related operations.
      */
    var ajaxAction: js.UndefOr[String] = js.undefined
    
    /** Specifies the file type extension shown in the image browser window.
      */
    var extensionAllow: js.UndefOr[String] = js.undefined
    
    /** Specifies the directory to perform operations like create, delete and rename folder and files, and upload the selected images to the current directory.
      */
    var filePath: js.UndefOr[String] = js.undefined
  }
  object ImageBrowser {
    
    inline def apply(): ImageBrowser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageBrowser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageBrowser] (val x: Self) extends AnyVal {
      
      inline def setAjaxAction(value: String): Self = StObject.set(x, "ajaxAction", value.asInstanceOf[js.Any])
      
      inline def setAjaxActionUndefined: Self = StObject.set(x, "ajaxAction", js.undefined)
      
      inline def setExtensionAllow(value: String): Self = StObject.set(x, "extensionAllow", value.asInstanceOf[js.Any])
      
      inline def setExtensionAllowUndefined: Self = StObject.set(x, "extensionAllow", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    }
  }
  
  trait ImportSettings extends StObject {
    
    /** This API is used to receive the server-side handler for import operations.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ImportSettings {
    
    inline def apply(): ImportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportSettings] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait KeydownEventArgs extends StObject {
    
    /** When the event is canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the RTE model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeydownEventArgs {
    
    inline def apply(): KeydownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeydownEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeydownEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait KeyupEventArgs extends StObject {
    
    /** When the event is canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the RTE model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeyupEventArgs {
    
    inline def apply(): KeyupEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyupEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyupEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Enables/disables the editing of the content.
      * @Default {True}
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /** RTE control can be accessed through the keyboard shortcut keys.
      * @Default {True}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** When the property is set to true, it focuses the RTE at the time of rendering.
      * @Default {false}
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    /** Based on the content size, its height is adjusted instead of adding the scrollbar.
      * @Default {false}
      */
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when changed successfully.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Sets the colorCode to display the color of the fontColor and backgroundColor in the font tools of the RTE.
      * @Default {[000000, FFFFFF, C4C4C4, ADADAD, 595959, 262626, 4f81bd, dbe5f1, b8cce4, 95b3d7, 366092, 244061, c0504d, f2dcdb, e5b9b7, d99694, 953734,632423, 9bbb59, ebf1dd, d7e3bc,
      * c3d69b, 76923c, 4f6128, 8064a2, e5e0ec, ccc1d9, b2a2c7, 5f497a, 3f3151, f79646, fdeada, fbd5b5, fac08f,e36c09, 974806]}
      */
    var colorCode: js.UndefOr[Any] = js.undefined
    
    /** The number of columns given are rendered in the color palate popup.
      * @Default {6}
      */
    var colorPaletteColumns: js.UndefOr[Double] = js.undefined
    
    /** The number of rows given are rendered in the color palate popup.
      * @Default {6}
      */
    var colorPaletteRows: js.UndefOr[Double] = js.undefined
    
    /** Fires when mouse click on menu items.
      */
    var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.undefined
    
    /** Fires when the RTE is created successfully
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root class for the RTE theme. This cssClass API helps the usage of custom skinning option for the RTE control by including this root class in CSS.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires before the RTE is destroyed.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** When the property is set to true, it returns the encrypted text.
      * @Default {false}
      */
    var enableHtmlEncode: js.UndefOr[Boolean] = js.undefined
    
    /** Maintain the values of the RTE after page reload.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Shows the RTE in the RTL direction.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Shows the resize icon and enables the resize option in the RTE.
      * @Default {True}
      */
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the tab key action with the RichTextEditor content.
      * @Default {True}
      */
    var enableTabKeyNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Formats the contents based on the XHTML rules.
      * @Default {false}
      */
    var enableXHTML: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the RTE controlâ€™s accessibility or interaction.
      * @Default {True}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when the commands are executed successfully.
      */
    var execute: js.UndefOr[js.Function1[/* e */ ExecuteEventArgs, Unit]] = js.undefined
    
    /** This API allows to enable url and fileName for pdf export.
      * @Default {null}
      */
    var exportToPdfSettings: js.UndefOr[ExportToPdfSettings] = js.undefined
    
    /** This API allows to enable url and fileName for word export.
      * @Default {null}
      */
    var exportToWordSettings: js.UndefOr[ExportToWordSettings] = js.undefined
    
    /** Load the external CSS file inside Iframe.
      * @Default {null}
      */
    var externalCSS: js.UndefOr[String] = js.undefined
    
    /** This API allows to enable the file browser support in the RTE control to browse, create, delete and upload the files in the specified current directory.
      * @Default {null}
      */
    var fileBrowser: js.UndefOr[FileBrowser] = js.undefined
    
    /** Sets the fontName in the RTE.
      * @Default {{text: Segoe UI, value: Segoe UI },{text: Arial, value: Arial,Helvetica,sans-serif },{text: Courier New, value: Courier New,Courier,Monospace },{text: Georgia, value:
      * Georgia,serif },{text: Impact, value: Impact,Charcoal,sans-serif },{text: Lucida Console, value: Lucida Console,Monaco,Monospace },{text: Tahoma, value: Tahoma,Geneva,sans-serif
      * },{text: Times New Roman, value: Times New Roman },{text: Trebuchet MS, value: Trebuchet MS,Helvetica,sans-serif },{text: Verdana, value: Verdana,Geneva,sans-serif}}
      */
    var fontName: js.UndefOr[Any] = js.undefined
    
    /** Sets the fontSize in the RTE.
      * @Default {{ text: 1, value: 1 },{ text: 2 (10pt), value: 2 },{ text: 3 (12pt), value: 3 },{ text: 4 (14pt), value: 4 },{ text: 5 (18pt), value: 5 },{ text: 6 (24pt), value: 6 },{
      * text: 7 (36pt), value: 7 }}
      */
    var fontSize: js.UndefOr[Any] = js.undefined
    
    /** Sets the format in the RTE.
      * @Default {{ text: Paragraph, value: &lt;p&gt;, spriteCssClass: e-paragraph },{ text: Quotation, value: &lt;blockquote&gt;, spriteCssClass: e-quotation },{ text: Heading 1, value:
      * &lt;h1&gt;, spriteCssClass: e-h1 },{ text: Heading 2, value: &lt;h2&gt;, spriteCssClass: e-h2 },{ text: Heading 3, value: &lt;h3&gt;, spriteCssClass: e-h3 },{ text: Heading 4,
      * value: &lt;h4&gt;, spriteCssClass: e-h4 },{ text: Heading 5, value: &lt;h5&gt;, spriteCssClass: e-h5 },{ text: Heading 6, value: &lt;h6&gt;, spriteCssClass: e-h6}}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Defines the height of the RTE textbox.
      * @Default {370}
      */
    var height: js.UndefOr[String | Double] = js.undefined
    
    /** Specifies the HTML Attributes of the ejRTE.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Sets the given attributes to the iframe body element.
      * @Default {{}}
      */
    var iframeAttributes: js.UndefOr[Any] = js.undefined
    
    /** This API allows the image browser to support in the RTE control to browse, create, delete, and upload the image files to the specified current directory.
      * @Default {null}
      */
    var imageBrowser: js.UndefOr[ImageBrowser] = js.undefined
    
    /** This API allows to enable the url for connecting to RTE import.
      * @Default {null}
      */
    var importSettings: js.UndefOr[ImportSettings] = js.undefined
    
    /** Enables/disables responsive support for the RTE control toolbar items during the window resizing time.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Fires when the keydown action is successful.
      */
    var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.undefined
    
    /** Fires when the keyup action is successful.
      */
    var keyup: js.UndefOr[js.Function1[/* e */ KeyupEventArgs, Unit]] = js.undefined
    
    /** Sets the culture in the RTE when you set the localization values are needs to be assigned to the corresponding text as follows.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Sets the maximum height for the RTE outer wrapper element.
      * @Default {null}
      */
    var maxHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the maximum length for the RTE outer wrapper element.
      * @Default {7000}
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /** Sets the maximum width for the RTE outer wrapper element.
      * @Default {null}
      */
    var maxWidth: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the minimum height for the RTE outer wrapper element.
      * @Default {280}
      */
    var minHeight: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the minimum width for the RTE outer wrapper element.
      * @Default {400}
      */
    var minWidth: js.UndefOr[String | Double] = js.undefined
    
    /** Sets the name in the RTE. When the name value is not initialized, the ID value is assigned to the name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** This API holds configuration setting for paste cleanup behavior.
      * @Default {{ listConversion: false, cleanCSS: false,	removeStyles: false, cleanElements: false }}
      */
    var pasteCleanupSettings: js.UndefOr[PasteCleanupSettings] = js.undefined
    
    /** Fires before the RTE Edit area is rendered and after the toolbar is rendered.
      */
    var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, Unit]] = js.undefined
    
    /** Fires when the text is selected in the text area
      */
    var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.undefined
    
    /** Counts the total characters and displays it in the RTE footer.
      * @Default {True}
      */
    var showCharCount: js.UndefOr[Boolean] = js.undefined
    
    /** Shows ClearAll icon in the RTE footer.
      * @Default {false}
      */
    var showClearAll: js.UndefOr[Boolean] = js.undefined
    
    /** Shows the clear format in the RTE footer.
      * @Default {true}
      */
    var showClearFormat: js.UndefOr[Boolean] = js.undefined
    
    /** The showContextMenu property helps to enable custom context menu within editor area.
      * @Default {True}
      */
    var showContextMenu: js.UndefOr[Boolean] = js.undefined
    
    /** Shows the Custom Table in the RTE.
      * @Default {True}
      */
    var showCustomTable: js.UndefOr[Boolean] = js.undefined
    
    /** This API is used to set the default dimensions for the image and video. When this property is set to true, the image and video dialog displays the dimension option.
      * @Default {false}
      */
    var showDimensions: js.UndefOr[Boolean] = js.undefined
    
    /** Shows the FontOption in the RTE.
      * @Default {True}
      */
    var showFontOption: js.UndefOr[Boolean] = js.undefined
    
    /** Shows footer in the RTE. When the footer is enabled, it displays the HTML tag, word Count, character count, clear format, resize icon and clear all the content icons, by default.
      * @Default {false}
      */
    var showFooter: js.UndefOr[Boolean] = js.undefined
    
    /** Shows the HtmlSource in the RTE footer.
      * @Default {false}
      */
    var showHtmlSource: js.UndefOr[Boolean] = js.undefined
    
    /** When the cursor is placed or when the text is selected in the RTE, it displays the tag info in the footer.
      * @Default {True}
      */
    var showHtmlTagInfo: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables rounded corner UI look for RTE.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Shows the toolbar in the RTE.
      * @Default {True}
      */
    var showToolbar: js.UndefOr[Boolean] = js.undefined
    
    /** Counts the total words and displays it in the RTE footer.
      * @Default {True}
      */
    var showWordCount: js.UndefOr[Boolean] = js.undefined
    
    /** The given number of columns render the insert table pop.
      * @Default {10}
      */
    var tableColumns: js.UndefOr[Double] = js.undefined
    
    /** The given number of rows render the insert table pop.
      * @Default {8}
      */
    var tableRows: js.UndefOr[Double] = js.undefined
    
    /** Specifies the overflow mode for RTE responsive toolbar
      * @Default {Popup}
      */
    var toolbarOverflowMode: js.UndefOr[ToolbarOverflowMode | String] = js.undefined
    
    /** Sets the tools in the RTE and gets the inner display order of the corresponding group element. Tools are dependent on the toolsList property.
      * @Default {formatStyle: [format],style: [bold, italic, underline, strikethrough],alignment: [justifyLeft, justifyCenter, justifyRight, justifyFull],lists: [unorderedList,
      * orderedList],indenting: [outdent, indent],doAction: [undo, redo],links: [createLink,removeLink],images: [image],media: [video],tables: [createTable, addRowAbove, addRowBelow,
      * addColumnLeft, addColumnRight, deleteRow, deleteColumn, deleteTable]],view:[â€œfullScreenâ€,zoomIn,zoomOut],print:[print]}
      */
    var tools: js.UndefOr[Tools] = js.undefined
    
    /** Specifies the list of groups and order of those groups displayed in the RTE toolbar.  The toolsList property is used to get the root group order and tools property is used to get
      * the inner order of the corresponding groups displayed. When the value is not specified, it gets its default display order and tools.
      * @Default {[formatStyle, font, style, effects, alignment, lists, indenting, clipboard, doAction, clear, links, images, media, tables, casing,view, customTools,print,edit]}
      */
    var toolsList: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Display the hints for the tools in the Toolbar.
      * @Default {{ associate: mouseenter, showShadow: true, position: { stem: { horizontal: left, vertical: top }  }, tip: { size: { width: 5, height: 5 }, isBalloon: false }}
      */
    var tooltipSettings: js.UndefOr[Any] = js.undefined
    
    /** Gets the undo stack limit.
      * @Default {50}
      */
    var undoStackLimit: js.UndefOr[Double] = js.undefined
    
    /** Sets the jQuery validation error message to the Rich Text Editor.
      * @Default {null}
      */
    var validationMessage: js.UndefOr[Any] = js.undefined
    
    /** Sets the jQuery validation rules to the Rich Text Editor.
      * @Default {null}
      */
    var validationRules: js.UndefOr[Any] = js.undefined
    
    /** The given string value is displayed in the editable area.
      * @Default {null}
      */
    var value: js.UndefOr[String] = js.undefined
    
    /** Defines the width of the RTE textbox.
      * @Default {786}
      */
    var width: js.UndefOr[String | Double] = js.undefined
    
    /** Increases and decreases the contents zoom range in percentage
      * @Default {0.05}
      */
    var zoomStep: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.RTE.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.RTE.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.RTE.Model] (val x: Self) extends AnyVal {
      
      inline def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      inline def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setColorCode(value: Any): Self = StObject.set(x, "colorCode", value.asInstanceOf[js.Any])
      
      inline def setColorCodeUndefined: Self = StObject.set(x, "colorCode", js.undefined)
      
      inline def setColorPaletteColumns(value: Double): Self = StObject.set(x, "colorPaletteColumns", value.asInstanceOf[js.Any])
      
      inline def setColorPaletteColumnsUndefined: Self = StObject.set(x, "colorPaletteColumns", js.undefined)
      
      inline def setColorPaletteRows(value: Double): Self = StObject.set(x, "colorPaletteRows", value.asInstanceOf[js.Any])
      
      inline def setColorPaletteRowsUndefined: Self = StObject.set(x, "colorPaletteRows", js.undefined)
      
      inline def setContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = StObject.set(x, "contextMenuClick", js.Any.fromFunction1(value))
      
      inline def setContextMenuClickUndefined: Self = StObject.set(x, "contextMenuClick", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableHtmlEncode(value: Boolean): Self = StObject.set(x, "enableHtmlEncode", value.asInstanceOf[js.Any])
      
      inline def setEnableHtmlEncodeUndefined: Self = StObject.set(x, "enableHtmlEncode", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      inline def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      inline def setEnableTabKeyNavigation(value: Boolean): Self = StObject.set(x, "enableTabKeyNavigation", value.asInstanceOf[js.Any])
      
      inline def setEnableTabKeyNavigationUndefined: Self = StObject.set(x, "enableTabKeyNavigation", js.undefined)
      
      inline def setEnableXHTML(value: Boolean): Self = StObject.set(x, "enableXHTML", value.asInstanceOf[js.Any])
      
      inline def setEnableXHTMLUndefined: Self = StObject.set(x, "enableXHTML", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExecute(value: /* e */ ExecuteEventArgs => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      inline def setExportToPdfSettings(value: ExportToPdfSettings): Self = StObject.set(x, "exportToPdfSettings", value.asInstanceOf[js.Any])
      
      inline def setExportToPdfSettingsUndefined: Self = StObject.set(x, "exportToPdfSettings", js.undefined)
      
      inline def setExportToWordSettings(value: ExportToWordSettings): Self = StObject.set(x, "exportToWordSettings", value.asInstanceOf[js.Any])
      
      inline def setExportToWordSettingsUndefined: Self = StObject.set(x, "exportToWordSettings", js.undefined)
      
      inline def setExternalCSS(value: String): Self = StObject.set(x, "externalCSS", value.asInstanceOf[js.Any])
      
      inline def setExternalCSSUndefined: Self = StObject.set(x, "externalCSS", js.undefined)
      
      inline def setFileBrowser(value: FileBrowser): Self = StObject.set(x, "fileBrowser", value.asInstanceOf[js.Any])
      
      inline def setFileBrowserUndefined: Self = StObject.set(x, "fileBrowser", js.undefined)
      
      inline def setFontName(value: Any): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
      
      inline def setFontNameUndefined: Self = StObject.set(x, "fontName", js.undefined)
      
      inline def setFontSize(value: Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setIframeAttributes(value: Any): Self = StObject.set(x, "iframeAttributes", value.asInstanceOf[js.Any])
      
      inline def setIframeAttributesUndefined: Self = StObject.set(x, "iframeAttributes", js.undefined)
      
      inline def setImageBrowser(value: ImageBrowser): Self = StObject.set(x, "imageBrowser", value.asInstanceOf[js.Any])
      
      inline def setImageBrowserUndefined: Self = StObject.set(x, "imageBrowser", js.undefined)
      
      inline def setImportSettings(value: ImportSettings): Self = StObject.set(x, "importSettings", value.asInstanceOf[js.Any])
      
      inline def setImportSettingsUndefined: Self = StObject.set(x, "importSettings", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setKeydown(value: /* e */ KeydownEventArgs => Unit): Self = StObject.set(x, "keydown", js.Any.fromFunction1(value))
      
      inline def setKeydownUndefined: Self = StObject.set(x, "keydown", js.undefined)
      
      inline def setKeyup(value: /* e */ KeyupEventArgs => Unit): Self = StObject.set(x, "keyup", js.Any.fromFunction1(value))
      
      inline def setKeyupUndefined: Self = StObject.set(x, "keyup", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxHeight(value: String | Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxWidth(value: String | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: String | Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPasteCleanupSettings(value: PasteCleanupSettings): Self = StObject.set(x, "pasteCleanupSettings", value.asInstanceOf[js.Any])
      
      inline def setPasteCleanupSettingsUndefined: Self = StObject.set(x, "pasteCleanupSettings", js.undefined)
      
      inline def setPreRender(value: /* e */ PreRenderEventArgs => Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction1(value))
      
      inline def setPreRenderUndefined: Self = StObject.set(x, "preRender", js.undefined)
      
      inline def setSelect(value: /* e */ SelectEventArgs => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setShowCharCount(value: Boolean): Self = StObject.set(x, "showCharCount", value.asInstanceOf[js.Any])
      
      inline def setShowCharCountUndefined: Self = StObject.set(x, "showCharCount", js.undefined)
      
      inline def setShowClearAll(value: Boolean): Self = StObject.set(x, "showClearAll", value.asInstanceOf[js.Any])
      
      inline def setShowClearAllUndefined: Self = StObject.set(x, "showClearAll", js.undefined)
      
      inline def setShowClearFormat(value: Boolean): Self = StObject.set(x, "showClearFormat", value.asInstanceOf[js.Any])
      
      inline def setShowClearFormatUndefined: Self = StObject.set(x, "showClearFormat", js.undefined)
      
      inline def setShowContextMenu(value: Boolean): Self = StObject.set(x, "showContextMenu", value.asInstanceOf[js.Any])
      
      inline def setShowContextMenuUndefined: Self = StObject.set(x, "showContextMenu", js.undefined)
      
      inline def setShowCustomTable(value: Boolean): Self = StObject.set(x, "showCustomTable", value.asInstanceOf[js.Any])
      
      inline def setShowCustomTableUndefined: Self = StObject.set(x, "showCustomTable", js.undefined)
      
      inline def setShowDimensions(value: Boolean): Self = StObject.set(x, "showDimensions", value.asInstanceOf[js.Any])
      
      inline def setShowDimensionsUndefined: Self = StObject.set(x, "showDimensions", js.undefined)
      
      inline def setShowFontOption(value: Boolean): Self = StObject.set(x, "showFontOption", value.asInstanceOf[js.Any])
      
      inline def setShowFontOptionUndefined: Self = StObject.set(x, "showFontOption", js.undefined)
      
      inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
      
      inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
      
      inline def setShowHtmlSource(value: Boolean): Self = StObject.set(x, "showHtmlSource", value.asInstanceOf[js.Any])
      
      inline def setShowHtmlSourceUndefined: Self = StObject.set(x, "showHtmlSource", js.undefined)
      
      inline def setShowHtmlTagInfo(value: Boolean): Self = StObject.set(x, "showHtmlTagInfo", value.asInstanceOf[js.Any])
      
      inline def setShowHtmlTagInfoUndefined: Self = StObject.set(x, "showHtmlTagInfo", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setShowToolbar(value: Boolean): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      inline def setShowWordCount(value: Boolean): Self = StObject.set(x, "showWordCount", value.asInstanceOf[js.Any])
      
      inline def setShowWordCountUndefined: Self = StObject.set(x, "showWordCount", js.undefined)
      
      inline def setTableColumns(value: Double): Self = StObject.set(x, "tableColumns", value.asInstanceOf[js.Any])
      
      inline def setTableColumnsUndefined: Self = StObject.set(x, "tableColumns", js.undefined)
      
      inline def setTableRows(value: Double): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
      
      inline def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
      
      inline def setToolbarOverflowMode(value: ToolbarOverflowMode | String): Self = StObject.set(x, "toolbarOverflowMode", value.asInstanceOf[js.Any])
      
      inline def setToolbarOverflowModeUndefined: Self = StObject.set(x, "toolbarOverflowMode", js.undefined)
      
      inline def setTools(value: Tools): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
      
      inline def setToolsList(value: js.Array[Any]): Self = StObject.set(x, "toolsList", value.asInstanceOf[js.Any])
      
      inline def setToolsListUndefined: Self = StObject.set(x, "toolsList", js.undefined)
      
      inline def setToolsListVarargs(value: Any*): Self = StObject.set(x, "toolsList", js.Array(value*))
      
      inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
      
      inline def setTooltipSettings(value: Any): Self = StObject.set(x, "tooltipSettings", value.asInstanceOf[js.Any])
      
      inline def setTooltipSettingsUndefined: Self = StObject.set(x, "tooltipSettings", js.undefined)
      
      inline def setUndoStackLimit(value: Double): Self = StObject.set(x, "undoStackLimit", value.asInstanceOf[js.Any])
      
      inline def setUndoStackLimitUndefined: Self = StObject.set(x, "undoStackLimit", js.undefined)
      
      inline def setValidationMessage(value: Any): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      inline def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      inline def setValidationRules(value: Any): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZoomStep(value: String | Double): Self = StObject.set(x, "zoomStep", value.asInstanceOf[js.Any])
      
      inline def setZoomStepUndefined: Self = StObject.set(x, "zoomStep", js.undefined)
    }
  }
  
  trait PasteCleanupSettings extends StObject {
    
    /** This API is used to clean the unwanted css in the elements pasted from word document to editor.
      * @Default {false}
      */
    var cleanCSS: js.UndefOr[Boolean] = js.undefined
    
    /** This API is used to clean the unwanted elements pasted from word document to editor.
      * @Default {false}
      */
    var cleanElements: js.UndefOr[Boolean] = js.undefined
    
    /** This API is used to convert the list elements pasted from word document to editor.
      * @Default {false}
      */
    var listConversion: js.UndefOr[Boolean] = js.undefined
    
    /** This API is used to remove all styles in the elements pasted from word document to editor.
      * @Default {false}
      */
    var removeStyles: js.UndefOr[Boolean] = js.undefined
  }
  object PasteCleanupSettings {
    
    inline def apply(): PasteCleanupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasteCleanupSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasteCleanupSettings] (val x: Self) extends AnyVal {
      
      inline def setCleanCSS(value: Boolean): Self = StObject.set(x, "cleanCSS", value.asInstanceOf[js.Any])
      
      inline def setCleanCSSUndefined: Self = StObject.set(x, "cleanCSS", js.undefined)
      
      inline def setCleanElements(value: Boolean): Self = StObject.set(x, "cleanElements", value.asInstanceOf[js.Any])
      
      inline def setCleanElementsUndefined: Self = StObject.set(x, "cleanElements", js.undefined)
      
      inline def setListConversion(value: Boolean): Self = StObject.set(x, "listConversion", value.asInstanceOf[js.Any])
      
      inline def setListConversionUndefined: Self = StObject.set(x, "listConversion", js.undefined)
      
      inline def setRemoveStyles(value: Boolean): Self = StObject.set(x, "removeStyles", value.asInstanceOf[js.Any])
      
      inline def setRemoveStylesUndefined: Self = StObject.set(x, "removeStyles", js.undefined)
    }
  }
  
  trait PreRenderEventArgs extends StObject {
    
    /** When the event is canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the RTE model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PreRenderEventArgs {
    
    inline def apply(): PreRenderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreRenderEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreRenderEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectEventArgs extends StObject {
    
    /** When the event is canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the event object
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Returns the RTE model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SelectEventArgs {
    
    inline def apply(): SelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Tools extends StObject {
    
    /** Specifies the alignment tools and the display order of this tool in the RTE toolbar.
      */
    var alignment: js.UndefOr[Any] = js.undefined
    
    /** Specifies the casing tools and the display order of this tool in the RTE toolbar.
      */
    var casing: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the clear tools and the display order of this tool in the RTE toolbar.
      */
    var clear: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the clipboard tools and the display order of this tool in the RTE toolbar.
      */
    var clipboard: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the customOrderedList tools and the display order of this tool in the RTE toolbar.
      */
    var customOrderedList: js.UndefOr[js.Array[ToolsCustomOrderedList]] = js.undefined
    
    /** Specifies the customUnOrderedList tools and the display order of this tool in the RTE toolbar.
      */
    var customUnorderedList: js.UndefOr[js.Array[ToolsCustomUnorderedList]] = js.undefined
    
    /** Specifies the doAction tools and the display order of this tool in the RTE toolbar.
      */
    var doAction: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the edit tools and the displays tool in the RTE toolbar.
      */
    var edit: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the effect of tools and the display order of this tool in RTE toolbar.
      */
    var effects: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the font tools and the display order of this tool in the RTE toolbar.
      */
    var font: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the formatStyle tools and the display order of this tool in the RTE toolbar.
      */
    var formatStyle: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the image tools and the display order of this tool in the RTE toolbar.
      */
    var images: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the importExport tools and the display order of this tool in the RTE toolbar.
      */
    var importExport: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the indent tools and the display order of this tool in the RTE toolbar.
      */
    var indenting: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the link tools and the display order of this tool in the RTE toolbar.
      */
    var links: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the list tools and the display order of this tool in the RTE toolbar.
      */
    var lists: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the media tools and the display order of this tool in the RTE toolbar.
      */
    var media: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the print tools and the display order of this tool in the RTE toolbar.
      */
    var print: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the style tools and the display order of this tool in the RTE toolbar.
      */
    var style: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the table tools and the display order of this tool in the RTE toolbar.
      */
    var tables: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the view tools and the display order of this tool in the RTE toolbar.
      */
    var view: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Tools {
    
    inline def apply(): Tools = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tools]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tools] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: Any): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setCasing(value: js.Array[Any]): Self = StObject.set(x, "casing", value.asInstanceOf[js.Any])
      
      inline def setCasingUndefined: Self = StObject.set(x, "casing", js.undefined)
      
      inline def setCasingVarargs(value: Any*): Self = StObject.set(x, "casing", js.Array(value*))
      
      inline def setClear(value: js.Array[Any]): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setClearVarargs(value: Any*): Self = StObject.set(x, "clear", js.Array(value*))
      
      inline def setClipboard(value: js.Array[Any]): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setClipboardUndefined: Self = StObject.set(x, "clipboard", js.undefined)
      
      inline def setClipboardVarargs(value: Any*): Self = StObject.set(x, "clipboard", js.Array(value*))
      
      inline def setCustomOrderedList(value: js.Array[ToolsCustomOrderedList]): Self = StObject.set(x, "customOrderedList", value.asInstanceOf[js.Any])
      
      inline def setCustomOrderedListUndefined: Self = StObject.set(x, "customOrderedList", js.undefined)
      
      inline def setCustomOrderedListVarargs(value: ToolsCustomOrderedList*): Self = StObject.set(x, "customOrderedList", js.Array(value*))
      
      inline def setCustomUnorderedList(value: js.Array[ToolsCustomUnorderedList]): Self = StObject.set(x, "customUnorderedList", value.asInstanceOf[js.Any])
      
      inline def setCustomUnorderedListUndefined: Self = StObject.set(x, "customUnorderedList", js.undefined)
      
      inline def setCustomUnorderedListVarargs(value: ToolsCustomUnorderedList*): Self = StObject.set(x, "customUnorderedList", js.Array(value*))
      
      inline def setDoAction(value: js.Array[Any]): Self = StObject.set(x, "doAction", value.asInstanceOf[js.Any])
      
      inline def setDoActionUndefined: Self = StObject.set(x, "doAction", js.undefined)
      
      inline def setDoActionVarargs(value: Any*): Self = StObject.set(x, "doAction", js.Array(value*))
      
      inline def setEdit(value: js.Array[Any]): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setEditVarargs(value: Any*): Self = StObject.set(x, "edit", js.Array(value*))
      
      inline def setEffects(value: js.Array[Any]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setEffectsVarargs(value: Any*): Self = StObject.set(x, "effects", js.Array(value*))
      
      inline def setFont(value: js.Array[Any]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontVarargs(value: Any*): Self = StObject.set(x, "font", js.Array(value*))
      
      inline def setFormatStyle(value: js.Array[Any]): Self = StObject.set(x, "formatStyle", value.asInstanceOf[js.Any])
      
      inline def setFormatStyleUndefined: Self = StObject.set(x, "formatStyle", js.undefined)
      
      inline def setFormatStyleVarargs(value: Any*): Self = StObject.set(x, "formatStyle", js.Array(value*))
      
      inline def setImages(value: js.Array[Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: Any*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setImportExport(value: js.Array[Any]): Self = StObject.set(x, "importExport", value.asInstanceOf[js.Any])
      
      inline def setImportExportUndefined: Self = StObject.set(x, "importExport", js.undefined)
      
      inline def setImportExportVarargs(value: Any*): Self = StObject.set(x, "importExport", js.Array(value*))
      
      inline def setIndenting(value: js.Array[Any]): Self = StObject.set(x, "indenting", value.asInstanceOf[js.Any])
      
      inline def setIndentingUndefined: Self = StObject.set(x, "indenting", js.undefined)
      
      inline def setIndentingVarargs(value: Any*): Self = StObject.set(x, "indenting", js.Array(value*))
      
      inline def setLinks(value: js.Array[Any]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: Any*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setLists(value: js.Array[Any]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
      
      inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
      
      inline def setListsVarargs(value: Any*): Self = StObject.set(x, "lists", js.Array(value*))
      
      inline def setMedia(value: js.Array[Any]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMediaVarargs(value: Any*): Self = StObject.set(x, "media", js.Array(value*))
      
      inline def setPrint(value: js.Array[Any]): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setPrintVarargs(value: Any*): Self = StObject.set(x, "print", js.Array(value*))
      
      inline def setStyle(value: js.Array[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Any*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setTables(value: js.Array[Any]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
      
      inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
      
      inline def setTablesVarargs(value: Any*): Self = StObject.set(x, "tables", js.Array(value*))
      
      inline def setView(value: js.Array[Any]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setViewVarargs(value: Any*): Self = StObject.set(x, "view", js.Array(value*))
    }
  }
  
  trait ToolsCustomOrderedList extends StObject {
    
    /** Specifies the styles for customOrderedList item.
      */
    var css: js.UndefOr[String] = js.undefined
    
    /** Specifies the image for customOrderedList item.
      */
    var listImage: js.UndefOr[String] = js.undefined
    
    /** Specifies the list style for customOrderedList item.
      */
    var listStyle: js.UndefOr[String] = js.undefined
    
    /** Specifies the name for customOrderedList item.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Specifies the text for customOrderedList item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the title for customOrderedList item.
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object ToolsCustomOrderedList {
    
    inline def apply(): ToolsCustomOrderedList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolsCustomOrderedList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolsCustomOrderedList] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setListImage(value: String): Self = StObject.set(x, "listImage", value.asInstanceOf[js.Any])
      
      inline def setListImageUndefined: Self = StObject.set(x, "listImage", js.undefined)
      
      inline def setListStyle(value: String): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait ToolsCustomUnorderedList extends StObject {
    
    /** Specifies the styles for customUnorderedList item.
      */
    var css: js.UndefOr[String] = js.undefined
    
    /** Specifies the image for customUnorderedList item.
      */
    var listImage: js.UndefOr[String] = js.undefined
    
    /** Specifies the list style for customUnorderedList item.
      */
    var listStyle: js.UndefOr[String] = js.undefined
    
    /** Specifies the name for customUnorderedList item.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Specifies the text for customUnorderedList item.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the title for customUnorderedList item.
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object ToolsCustomUnorderedList {
    
    inline def apply(): ToolsCustomUnorderedList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolsCustomUnorderedList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolsCustomUnorderedList] (val x: Self) extends AnyVal {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setListImage(value: String): Self = StObject.set(x, "listImage", value.asInstanceOf[js.Any])
      
      inline def setListImageUndefined: Self = StObject.set(x, "listImage", js.undefined)
      
      inline def setListStyle(value: String): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
