package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiInstance extends js.Object {
  def add(child: Widget): UiInstance = js.native
  def close(): UiInstance = js.native
  def createAbsolutePanel(): AbsolutePanel = js.native
  def createAnchor(text: java.lang.String, asHtml: scala.Boolean, href: java.lang.String): Anchor = js.native
  def createAnchor(text: java.lang.String, href: java.lang.String): Anchor = js.native
  def createButton(): Button = js.native
  def createButton(html: java.lang.String): Button = js.native
  def createButton(html: java.lang.String, clickHandler: Handler): Button = js.native
  def createCaptionPanel(): CaptionPanel = js.native
  def createCaptionPanel(caption: java.lang.String): CaptionPanel = js.native
  def createCaptionPanel(caption: java.lang.String, asHtml: scala.Boolean): CaptionPanel = js.native
  def createCheckBox(): CheckBox = js.native
  def createCheckBox(label: java.lang.String): CheckBox = js.native
  def createCheckBox(label: java.lang.String, asHtml: scala.Boolean): CheckBox = js.native
  def createClientHandler(): ClientHandler = js.native
  def createDateBox(): DateBox = js.native
  def createDatePicker(): DatePicker = js.native
  def createDecoratedStackPanel(): DecoratedStackPanel = js.native
  def createDecoratedTabBar(): DecoratedTabBar = js.native
  def createDecoratedTabPanel(): DecoratedTabPanel = js.native
  def createDecoratorPanel(): DecoratorPanel = js.native
  def createDialogBox(): DialogBox = js.native
  def createDialogBox(autoHide: scala.Boolean): DialogBox = js.native
  def createDialogBox(autoHide: scala.Boolean, modal: scala.Boolean): DialogBox = js.native
  def createDocsListDialog(): DocsListDialog = js.native
  def createFileUpload(): FileUpload = js.native
  def createFlexTable(): FlexTable = js.native
  def createFlowPanel(): FlowPanel = js.native
  def createFocusPanel(): FocusPanel = js.native
  def createFocusPanel(child: Widget): FocusPanel = js.native
  def createFormPanel(): FormPanel = js.native
  def createGrid(): Grid = js.native
  def createGrid(
    rows: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    columns: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Grid = js.native
  def createHTML(): HTML = js.native
  def createHTML(html: java.lang.String): HTML = js.native
  def createHTML(html: java.lang.String, wordWrap: scala.Boolean): HTML = js.native
  def createHidden(): Hidden = js.native
  def createHidden(name: java.lang.String): Hidden = js.native
  def createHidden(name: java.lang.String, value: java.lang.String): Hidden = js.native
  def createHorizontalPanel(): HorizontalPanel = js.native
  def createImage(): Image = js.native
  def createImage(url: java.lang.String): Image = js.native
  def createImage(
    url: java.lang.String,
    left: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    top: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Image = js.native
  def createInlineLabel(): InlineLabel = js.native
  def createInlineLabel(text: java.lang.String): InlineLabel = js.native
  def createLabel(): Label = js.native
  def createLabel(text: java.lang.String): Label = js.native
  def createLabel(text: java.lang.String, wordWrap: scala.Boolean): Label = js.native
  def createListBox(): ListBox = js.native
  def createListBox(isMultipleSelect: scala.Boolean): ListBox = js.native
  def createMenuBar(): MenuBar = js.native
  def createMenuBar(vertical: scala.Boolean): MenuBar = js.native
  def createMenuItem(text: java.lang.String, asHtml: scala.Boolean, command: Handler): MenuItem = js.native
  def createMenuItem(text: java.lang.String, command: Handler): MenuItem = js.native
  def createMenuItemSeparator(): MenuItemSeparator = js.native
  def createPasswordTextBox(): PasswordTextBox = js.native
  def createPopupPanel(): PopupPanel = js.native
  def createPopupPanel(autoHide: scala.Boolean): PopupPanel = js.native
  def createPopupPanel(autoHide: scala.Boolean, modal: scala.Boolean): PopupPanel = js.native
  def createPushButton(): PushButton = js.native
  def createPushButton(upText: java.lang.String): PushButton = js.native
  def createPushButton(upText: java.lang.String, clickHandler: Handler): PushButton = js.native
  def createPushButton(upText: java.lang.String, downText: java.lang.String): PushButton = js.native
  def createPushButton(upText: java.lang.String, downText: java.lang.String, clickHandler: Handler): PushButton = js.native
  def createRadioButton(name: java.lang.String): RadioButton = js.native
  def createRadioButton(name: java.lang.String, label: java.lang.String): RadioButton = js.native
  def createRadioButton(name: java.lang.String, label: java.lang.String, asHtml: scala.Boolean): RadioButton = js.native
  def createResetButton(): ResetButton = js.native
  def createResetButton(html: java.lang.String): ResetButton = js.native
  def createResetButton(html: java.lang.String, clickHandler: Handler): ResetButton = js.native
  def createScrollPanel(): ScrollPanel = js.native
  def createScrollPanel(child: Widget): ScrollPanel = js.native
  def createServerBlurHandler(): ServerHandler = js.native
  def createServerBlurHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerChangeHandler(): ServerHandler = js.native
  def createServerChangeHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerClickHandler(): ServerHandler = js.native
  def createServerClickHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerCloseHandler(): ServerHandler = js.native
  def createServerCloseHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerCommand(): ServerHandler = js.native
  def createServerCommand(functionName: java.lang.String): ServerHandler = js.native
  def createServerErrorHandler(): ServerHandler = js.native
  def createServerErrorHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerFocusHandler(): ServerHandler = js.native
  def createServerFocusHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerHandler(): ServerHandler = js.native
  def createServerHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerInitializeHandler(): ServerHandler = js.native
  def createServerInitializeHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerKeyHandler(): ServerHandler = js.native
  def createServerKeyHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerLoadHandler(): ServerHandler = js.native
  def createServerLoadHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerMouseHandler(): ServerHandler = js.native
  def createServerMouseHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerScrollHandler(): ServerHandler = js.native
  def createServerScrollHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerSelectionHandler(): ServerHandler = js.native
  def createServerSelectionHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerSubmitHandler(): ServerHandler = js.native
  def createServerSubmitHandler(functionName: java.lang.String): ServerHandler = js.native
  def createServerValueChangeHandler(): ServerHandler = js.native
  def createServerValueChangeHandler(functionName: java.lang.String): ServerHandler = js.native
  def createSimpleCheckBox(): SimpleCheckBox = js.native
  def createSimplePanel(): SimplePanel = js.native
  def createSimpleRadioButton(name: java.lang.String): SimpleRadioButton = js.native
  def createSplitLayoutPanel(): SplitLayoutPanel = js.native
  def createStackPanel(): StackPanel = js.native
  def createSubmitButton(): SubmitButton = js.native
  def createSubmitButton(html: java.lang.String): SubmitButton = js.native
  def createSuggestBox(): SuggestBox = js.native
  def createTabBar(): TabBar = js.native
  def createTabPanel(): TabPanel = js.native
  def createTextArea(): TextArea = js.native
  def createTextBox(): TextBox = js.native
  def createToggleButton(): ToggleButton = js.native
  def createToggleButton(upText: java.lang.String): ToggleButton = js.native
  def createToggleButton(upText: java.lang.String, clickHandler: Handler): ToggleButton = js.native
  def createToggleButton(upText: java.lang.String, downText: java.lang.String): ToggleButton = js.native
  def createTree(): Tree = js.native
  def createTreeItem(): TreeItem = js.native
  def createTreeItem(child: Widget): TreeItem = js.native
  def createTreeItem(text: java.lang.String): TreeItem = js.native
  def createVerticalPanel(): VerticalPanel = js.native
  def getElementById(id: java.lang.String): Component = js.native
  def getId(): java.lang.String = js.native
  def isStandardsMode(): scala.Boolean = js.native
  def loadComponent(componentName: java.lang.String): Component = js.native
  def loadComponent(componentName: java.lang.String, optAdvancedArgs: js.Any): Component = js.native
  def remove(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): UiInstance = js.native
  def remove(widget: Widget): UiInstance = js.native
  def setHeight(height: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): UiInstance = js.native
  def setStandardsMode(standardsMode: scala.Boolean): UiInstance = js.native
  def setStyleAttribute(attribute: java.lang.String, value: java.lang.String): UiInstance = js.native
  def setTitle(title: java.lang.String): UiInstance = js.native
  def setWidth(width: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): UiInstance = js.native
}

