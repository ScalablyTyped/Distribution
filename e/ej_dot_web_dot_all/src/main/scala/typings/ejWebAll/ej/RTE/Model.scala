package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Enables/disables the editing of the content.
    * @Default {True}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  /** RTE control can be accessed through the keyboard shortcut keys.
    * @Default {True}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** When the property is set to true, it focuses the RTE at the time of rendering.
    * @Default {false}
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  /** Based on the content size, its height is adjusted instead of adding the scrollbar.
    * @Default {false}
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /** Fires when changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Sets the colorCode to display the color of the fontColor and backgroundColor in the font tools of the RTE.
    * @Default {[000000, FFFFFF, C4C4C4, ADADAD, 595959, 262626, 4f81bd, dbe5f1, b8cce4, 95b3d7, 366092, 244061, c0504d, f2dcdb, e5b9b7, d99694, 953734,632423, 9bbb59, ebf1dd, d7e3bc,
    * c3d69b, 76923c, 4f6128, 8064a2, e5e0ec, ccc1d9, b2a2c7, 5f497a, 3f3151, f79646, fdeada, fbd5b5, fac08f,e36c09, 974806]}
    */
  var colorCode: js.UndefOr[js.Any] = js.native
  /** The number of columns given are rendered in the color palate popup.
    * @Default {6}
    */
  var colorPaletteColumns: js.UndefOr[Double] = js.native
  /** The number of rows given are rendered in the color palate popup.
    * @Default {6}
    */
  var colorPaletteRows: js.UndefOr[Double] = js.native
  /** Fires when mouse click on menu items.
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.native
  /** Fires when the RTE is created successfully
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root class for the RTE theme. This cssClass API helps the usage of custom skinning option for the RTE control by including this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires before the RTE is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** When the property is set to true, it returns the encrypted text.
    * @Default {false}
    */
  var enableHtmlEncode: js.UndefOr[Boolean] = js.native
  /** Maintain the values of the RTE after page reload.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Shows the RTE in the RTL direction.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Shows the resize icon and enables the resize option in the RTE.
    * @Default {True}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Enables the tab key action with the RichTextEditor content.
    * @Default {True}
    */
  var enableTabKeyNavigation: js.UndefOr[Boolean] = js.native
  /** Formats the contents based on the XHTML rules.
    * @Default {false}
    */
  var enableXHTML: js.UndefOr[Boolean] = js.native
  /** Enables/disables the RTE controlâ€™s accessibility or interaction.
    * @Default {True}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Fires when the commands are executed successfully.
    */
  var execute: js.UndefOr[js.Function1[/* e */ ExecuteEventArgs, Unit]] = js.native
  /** This API allows to enable url and fileName for pdf export.
    * @Default {null}
    */
  var exportToPdfSettings: js.UndefOr[ExportToPdfSettings] = js.native
  /** This API allows to enable url and fileName for word export.
    * @Default {null}
    */
  var exportToWordSettings: js.UndefOr[ExportToWordSettings] = js.native
  /** Load the external CSS file inside Iframe.
    * @Default {null}
    */
  var externalCSS: js.UndefOr[String] = js.native
  /** This API allows to enable the file browser support in the RTE control to browse, create, delete and upload the files in the specified current directory.
    * @Default {null}
    */
  var fileBrowser: js.UndefOr[FileBrowser] = js.native
  /** Sets the fontName in the RTE.
    * @Default {{text: Segoe UI, value: Segoe UI },{text: Arial, value: Arial,Helvetica,sans-serif },{text: Courier New, value: Courier New,Courier,Monospace },{text: Georgia, value:
    * Georgia,serif },{text: Impact, value: Impact,Charcoal,sans-serif },{text: Lucida Console, value: Lucida Console,Monaco,Monospace },{text: Tahoma, value: Tahoma,Geneva,sans-serif
    * },{text: Times New Roman, value: Times New Roman },{text: Trebuchet MS, value: Trebuchet MS,Helvetica,sans-serif },{text: Verdana, value: Verdana,Geneva,sans-serif}}
    */
  var fontName: js.UndefOr[js.Any] = js.native
  /** Sets the fontSize in the RTE.
    * @Default {{ text: 1, value: 1 },{ text: 2 (10pt), value: 2 },{ text: 3 (12pt), value: 3 },{ text: 4 (14pt), value: 4 },{ text: 5 (18pt), value: 5 },{ text: 6 (24pt), value: 6 },{
    * text: 7 (36pt), value: 7 }}
    */
  var fontSize: js.UndefOr[js.Any] = js.native
  /** Sets the format in the RTE.
    * @Default {{ text: Paragraph, value: &lt;p&gt;, spriteCssClass: e-paragraph },{ text: Quotation, value: &lt;blockquote&gt;, spriteCssClass: e-quotation },{ text: Heading 1, value:
    * &lt;h1&gt;, spriteCssClass: e-h1 },{ text: Heading 2, value: &lt;h2&gt;, spriteCssClass: e-h2 },{ text: Heading 3, value: &lt;h3&gt;, spriteCssClass: e-h3 },{ text: Heading 4,
    * value: &lt;h4&gt;, spriteCssClass: e-h4 },{ text: Heading 5, value: &lt;h5&gt;, spriteCssClass: e-h5 },{ text: Heading 6, value: &lt;h6&gt;, spriteCssClass: e-h6}}
    */
  var format: js.UndefOr[String] = js.native
  /** Defines the height of the RTE textbox.
    * @Default {370}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Specifies the HTML Attributes of the ejRTE.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Sets the given attributes to the iframe body element.
    * @Default {{}}
    */
  var iframeAttributes: js.UndefOr[js.Any] = js.native
  /** This API allows the image browser to support in the RTE control to browse, create, delete, and upload the image files to the specified current directory.
    * @Default {null}
    */
  var imageBrowser: js.UndefOr[ImageBrowser] = js.native
  /** This API allows to enable the url for connecting to RTE import.
    * @Default {null}
    */
  var importSettings: js.UndefOr[ImportSettings] = js.native
  /** Enables/disables responsive support for the RTE control toolbar items during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Fires when the keydown action is successful.
    */
  var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.native
  /** Fires when the keyup action is successful.
    */
  var keyup: js.UndefOr[js.Function1[/* e */ KeyupEventArgs, Unit]] = js.native
  /** Sets the culture in the RTE when you set the localization values are needs to be assigned to the corresponding text as follows.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the maximum height for the RTE outer wrapper element.
    * @Default {null}
    */
  var maxHeight: js.UndefOr[String | Double] = js.native
  /** Sets the maximum length for the RTE outer wrapper element.
    * @Default {7000}
    */
  var maxLength: js.UndefOr[Double] = js.native
  /** Sets the maximum width for the RTE outer wrapper element.
    * @Default {null}
    */
  var maxWidth: js.UndefOr[String | Double] = js.native
  /** Sets the minimum height for the RTE outer wrapper element.
    * @Default {280}
    */
  var minHeight: js.UndefOr[String | Double] = js.native
  /** Sets the minimum width for the RTE outer wrapper element.
    * @Default {400}
    */
  var minWidth: js.UndefOr[String | Double] = js.native
  /** Sets the name in the RTE. When the name value is not initialized, the ID value is assigned to the name.
    */
  var name: js.UndefOr[String] = js.native
  /** This API holds configuration setting for paste cleanup behavior.
    * @Default {{ listConversion: false, cleanCSS: false,    removeStyles: false, cleanElements: false }}
    */
  var pasteCleanupSettings: js.UndefOr[PasteCleanupSettings] = js.native
  /** Fires before the RTE Edit area is rendered and after the toolbar is rendered.
    */
  var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, Unit]] = js.native
  /** Fires when the text is selected in the text area
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** Counts the total characters and displays it in the RTE footer.
    * @Default {True}
    */
  var showCharCount: js.UndefOr[Boolean] = js.native
  /** Shows ClearAll icon in the RTE footer.
    * @Default {false}
    */
  var showClearAll: js.UndefOr[Boolean] = js.native
  /** Shows the clear format in the RTE footer.
    * @Default {true}
    */
  var showClearFormat: js.UndefOr[Boolean] = js.native
  /** The showContextMenu property helps to enable custom context menu within editor area.
    * @Default {True}
    */
  var showContextMenu: js.UndefOr[Boolean] = js.native
  /** Shows the Custom Table in the RTE.
    * @Default {True}
    */
  var showCustomTable: js.UndefOr[Boolean] = js.native
  /** This API is used to set the default dimensions for the image and video. When this property is set to true, the image and video dialog displays the dimension option.
    * @Default {false}
    */
  var showDimensions: js.UndefOr[Boolean] = js.native
  /** Shows the FontOption in the RTE.
    * @Default {True}
    */
  var showFontOption: js.UndefOr[Boolean] = js.native
  /** Shows footer in the RTE. When the footer is enabled, it displays the HTML tag, word Count, character count, clear format, resize icon and clear all the content icons, by default.
    * @Default {false}
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  /** Shows the HtmlSource in the RTE footer.
    * @Default {false}
    */
  var showHtmlSource: js.UndefOr[Boolean] = js.native
  /** When the cursor is placed or when the text is selected in the RTE, it displays the tag info in the footer.
    * @Default {True}
    */
  var showHtmlTagInfo: js.UndefOr[Boolean] = js.native
  /** Enables or disables rounded corner UI look for RTE.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Shows the toolbar in the RTE.
    * @Default {True}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  /** Counts the total words and displays it in the RTE footer.
    * @Default {True}
    */
  var showWordCount: js.UndefOr[Boolean] = js.native
  /** The given number of columns render the insert table pop.
    * @Default {10}
    */
  var tableColumns: js.UndefOr[Double] = js.native
  /** The given number of rows render the insert table pop.
    * @Default {8}
    */
  var tableRows: js.UndefOr[Double] = js.native
  /** Specifies the overflow mode for RTE responsive toolbar
    * @Default {Popup}
    */
  var toolbarOverflowMode: js.UndefOr[ToolbarOverflowMode | String] = js.native
  /** Sets the tools in the RTE and gets the inner display order of the corresponding group element. Tools are dependent on the toolsList property.
    * @Default {formatStyle: [format],style: [bold, italic, underline, strikethrough],alignment: [justifyLeft, justifyCenter, justifyRight, justifyFull],lists: [unorderedList,
    * orderedList],indenting: [outdent, indent],doAction: [undo, redo],links: [createLink,removeLink],images: [image],media: [video],tables: [createTable, addRowAbove, addRowBelow,
    * addColumnLeft, addColumnRight, deleteRow, deleteColumn, deleteTable]],view:[â€œfullScreenâ€,zoomIn,zoomOut],print:[print]}
    */
  var tools: js.UndefOr[Tools] = js.native
  /** Specifies the list of groups and order of those groups displayed in the RTE toolbar.  The toolsList property is used to get the root group order and tools property is used to get
    * the inner order of the corresponding groups displayed. When the value is not specified, it gets its default display order and tools.
    * @Default {[formatStyle, font, style, effects, alignment, lists, indenting, clipboard, doAction, clear, links, images, media, tables, casing,view, customTools,print,edit]}
    */
  var toolsList: js.UndefOr[js.Array[_]] = js.native
  /** Display the hints for the tools in the Toolbar.
    * @Default {{ associate: mouseenter, showShadow: true, position: { stem: { horizontal: left, vertical: top }  }, tip: { size: { width: 5, height: 5 }, isBalloon: false }}
    */
  var tooltipSettings: js.UndefOr[js.Any] = js.native
  /** Gets the undo stack limit.
    * @Default {50}
    */
  var undoStackLimit: js.UndefOr[Double] = js.native
  /** Sets the jQuery validation error message to the Rich Text Editor.
    * @Default {null}
    */
  var validationMessage: js.UndefOr[js.Any] = js.native
  /** Sets the jQuery validation rules to the Rich Text Editor.
    * @Default {null}
    */
  var validationRules: js.UndefOr[js.Any] = js.native
  /** The given string value is displayed in the editable area.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.native
  /** Defines the width of the RTE textbox.
    * @Default {786}
    */
  var width: js.UndefOr[String | Double] = js.native
  /** Increases and decreases the contents zoom range in percentage
    * @Default {0.05}
    */
  var zoomStep: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setColorCode(value: js.Any): Self = this.set("colorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorCode: Self = this.set("colorCode", js.undefined)
    @scala.inline
    def setColorPaletteColumns(value: Double): Self = this.set("colorPaletteColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPaletteColumns: Self = this.set("colorPaletteColumns", js.undefined)
    @scala.inline
    def setColorPaletteRows(value: Double): Self = this.set("colorPaletteRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorPaletteRows: Self = this.set("colorPaletteRows", js.undefined)
    @scala.inline
    def setContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = this.set("contextMenuClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextMenuClick: Self = this.set("contextMenuClick", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnableHtmlEncode(value: Boolean): Self = this.set("enableHtmlEncode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHtmlEncode: Self = this.set("enableHtmlEncode", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableResize(value: Boolean): Self = this.set("enableResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResize: Self = this.set("enableResize", js.undefined)
    @scala.inline
    def setEnableTabKeyNavigation(value: Boolean): Self = this.set("enableTabKeyNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTabKeyNavigation: Self = this.set("enableTabKeyNavigation", js.undefined)
    @scala.inline
    def setEnableXHTML(value: Boolean): Self = this.set("enableXHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableXHTML: Self = this.set("enableXHTML", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExecute(value: /* e */ ExecuteEventArgs => Unit): Self = this.set("execute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    @scala.inline
    def setExportToPdfSettings(value: ExportToPdfSettings): Self = this.set("exportToPdfSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportToPdfSettings: Self = this.set("exportToPdfSettings", js.undefined)
    @scala.inline
    def setExportToWordSettings(value: ExportToWordSettings): Self = this.set("exportToWordSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportToWordSettings: Self = this.set("exportToWordSettings", js.undefined)
    @scala.inline
    def setExternalCSS(value: String): Self = this.set("externalCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalCSS: Self = this.set("externalCSS", js.undefined)
    @scala.inline
    def setFileBrowser(value: FileBrowser): Self = this.set("fileBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileBrowser: Self = this.set("fileBrowser", js.undefined)
    @scala.inline
    def setFontName(value: js.Any): Self = this.set("fontName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontName: Self = this.set("fontName", js.undefined)
    @scala.inline
    def setFontSize(value: js.Any): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setIframeAttributes(value: js.Any): Self = this.set("iframeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframeAttributes: Self = this.set("iframeAttributes", js.undefined)
    @scala.inline
    def setImageBrowser(value: ImageBrowser): Self = this.set("imageBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBrowser: Self = this.set("imageBrowser", js.undefined)
    @scala.inline
    def setImportSettings(value: ImportSettings): Self = this.set("importSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportSettings: Self = this.set("importSettings", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setKeydown(value: /* e */ KeydownEventArgs => Unit): Self = this.set("keydown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeydown: Self = this.set("keydown", js.undefined)
    @scala.inline
    def setKeyup(value: /* e */ KeyupEventArgs => Unit): Self = this.set("keyup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKeyup: Self = this.set("keyup", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxHeight(value: String | Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxWidth(value: String | Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: String | Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinWidth(value: String | Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPasteCleanupSettings(value: PasteCleanupSettings): Self = this.set("pasteCleanupSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasteCleanupSettings: Self = this.set("pasteCleanupSettings", js.undefined)
    @scala.inline
    def setPreRender(value: /* e */ PreRenderEventArgs => Unit): Self = this.set("preRender", js.Any.fromFunction1(value))
    @scala.inline
    def deletePreRender: Self = this.set("preRender", js.undefined)
    @scala.inline
    def setSelect(value: /* e */ SelectEventArgs => Unit): Self = this.set("select", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setShowCharCount(value: Boolean): Self = this.set("showCharCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCharCount: Self = this.set("showCharCount", js.undefined)
    @scala.inline
    def setShowClearAll(value: Boolean): Self = this.set("showClearAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowClearAll: Self = this.set("showClearAll", js.undefined)
    @scala.inline
    def setShowClearFormat(value: Boolean): Self = this.set("showClearFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowClearFormat: Self = this.set("showClearFormat", js.undefined)
    @scala.inline
    def setShowContextMenu(value: Boolean): Self = this.set("showContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowContextMenu: Self = this.set("showContextMenu", js.undefined)
    @scala.inline
    def setShowCustomTable(value: Boolean): Self = this.set("showCustomTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCustomTable: Self = this.set("showCustomTable", js.undefined)
    @scala.inline
    def setShowDimensions(value: Boolean): Self = this.set("showDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDimensions: Self = this.set("showDimensions", js.undefined)
    @scala.inline
    def setShowFontOption(value: Boolean): Self = this.set("showFontOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFontOption: Self = this.set("showFontOption", js.undefined)
    @scala.inline
    def setShowFooter(value: Boolean): Self = this.set("showFooter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFooter: Self = this.set("showFooter", js.undefined)
    @scala.inline
    def setShowHtmlSource(value: Boolean): Self = this.set("showHtmlSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHtmlSource: Self = this.set("showHtmlSource", js.undefined)
    @scala.inline
    def setShowHtmlTagInfo(value: Boolean): Self = this.set("showHtmlTagInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHtmlTagInfo: Self = this.set("showHtmlTagInfo", js.undefined)
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    @scala.inline
    def setShowToolbar(value: Boolean): Self = this.set("showToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowToolbar: Self = this.set("showToolbar", js.undefined)
    @scala.inline
    def setShowWordCount(value: Boolean): Self = this.set("showWordCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWordCount: Self = this.set("showWordCount", js.undefined)
    @scala.inline
    def setTableColumns(value: Double): Self = this.set("tableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableColumns: Self = this.set("tableColumns", js.undefined)
    @scala.inline
    def setTableRows(value: Double): Self = this.set("tableRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableRows: Self = this.set("tableRows", js.undefined)
    @scala.inline
    def setToolbarOverflowMode(value: ToolbarOverflowMode | String): Self = this.set("toolbarOverflowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarOverflowMode: Self = this.set("toolbarOverflowMode", js.undefined)
    @scala.inline
    def setTools(value: Tools): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
    @scala.inline
    def setToolsListVarargs(value: js.Any*): Self = this.set("toolsList", js.Array(value :_*))
    @scala.inline
    def setToolsList(value: js.Array[_]): Self = this.set("toolsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolsList: Self = this.set("toolsList", js.undefined)
    @scala.inline
    def setTooltipSettings(value: js.Any): Self = this.set("tooltipSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipSettings: Self = this.set("tooltipSettings", js.undefined)
    @scala.inline
    def setUndoStackLimit(value: Double): Self = this.set("undoStackLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndoStackLimit: Self = this.set("undoStackLimit", js.undefined)
    @scala.inline
    def setValidationMessage(value: js.Any): Self = this.set("validationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationMessage: Self = this.set("validationMessage", js.undefined)
    @scala.inline
    def setValidationRules(value: js.Any): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZoomStep(value: String | Double): Self = this.set("zoomStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomStep: Self = this.set("zoomStep", js.undefined)
  }
  
}

