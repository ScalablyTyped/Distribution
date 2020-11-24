package typings.electronPrompt.mod

import typings.electronPrompt.electronPromptStrings.input
import typings.electronPrompt.electronPromptStrings.select
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Whether the window should always stay on top of other windows.
    * Defaults to `false`.
    */
  var alwaysOnTop: js.UndefOr[Boolean] = js.native
  
  /**
    * The text for the OK/cancel buttons. Properties are `ok` and `cancel`.
    * Defaults to `null`.
    */
  var buttonLabels: js.UndefOr[ButtonLabels | Null] = js.native
  
  /**
    * The local path of a CSS file to stylize the prompt window.
    * Defaults to `null`.
    */
  var customStylesheet: js.UndefOr[String | Null] = js.native
  
  /**
    * The height of the prompt window. Defaults to `130`.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The path to an icon image to use in the title bar.
    * Defaults to `null` and uses electron's icon.
    */
  var icon: js.UndefOr[String | Null] = js.native
  
  /**
    * The attributes of the input field, analagous to the HTML attributes:
    * `{type: 'text', required: true}` -> `<input type="text" required>`.
    * Used if the type is `input`.
    */
  var inputAttrs: js.UndefOr[Record[String, String]] = js.native
  
  /**
    * The label which appears on the prompt for the input field.
    * Defaults to `Please input a value:`.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Whether to show the menubar or not. Defaults to `false`.
    */
  var menuBarVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum allowed height for the prompt window.
    * Same default value as `height`.
    */
  var minHeight: js.UndefOr[Double] = js.native
  
  /**
    * The minimum allowed width for the prompt window.
    * Same default value as `width`.
    */
  var minWidth: js.UndefOr[Double] = js.native
  
  /**
    * Whether the prompt window can be resized or not
    * (also sets `useContentSize`). Defaults to `false`.
    */
  var resizable: js.UndefOr[Boolean] = js.native
  
  /**
    * The items for the select dropdown if using the 'select' type in the
    * format 'value': 'display text', where the value is what will be given
    * to the then block and the display text is what the user will see.
    */
  var selectOptions: js.UndefOr[(Record[String, String]) | Null] = js.native
  
  /**
    * Whether to show the prompt window icon in taskbar. Defaults to true.
    */
  var skipTaskbar: js.UndefOr[Boolean] = js.native
  
  /**
    * The title of the prompt window. Defaults to 'Prompt'.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The type of input field, either `input` for a standard text input
    * field or `select` for a dropdown type input. Defaults to `input`.
    */
  var `type`: js.UndefOr[input | select] = js.native
  
  /**
    * Whether the label should be interpreted as HTML or not.
    * Defaults to `false`.
    */
  var useHtmlLabel: js.UndefOr[Boolean] = js.native
  
  /**
    * The default value for the input field. Defaults to `null`.
    */
  var value: js.UndefOr[String | Null] = js.native
  
  /**
    * The width of the prompt window. Defaults to `370`.
    */
  var width: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAlwaysOnTop(value: Boolean): Self = this.set("alwaysOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysOnTop: Self = this.set("alwaysOnTop", js.undefined)
    
    @scala.inline
    def setButtonLabels(value: ButtonLabels): Self = this.set("buttonLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonLabels: Self = this.set("buttonLabels", js.undefined)
    
    @scala.inline
    def setButtonLabelsNull: Self = this.set("buttonLabels", null)
    
    @scala.inline
    def setCustomStylesheet(value: String): Self = this.set("customStylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomStylesheet: Self = this.set("customStylesheet", js.undefined)
    
    @scala.inline
    def setCustomStylesheetNull: Self = this.set("customStylesheet", null)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setInputAttrs(value: Record[String, String]): Self = this.set("inputAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAttrs: Self = this.set("inputAttrs", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMenuBarVisible(value: Boolean): Self = this.set("menuBarVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuBarVisible: Self = this.set("menuBarVisible", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setSelectOptions(value: Record[String, String]): Self = this.set("selectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOptions: Self = this.set("selectOptions", js.undefined)
    
    @scala.inline
    def setSelectOptionsNull: Self = this.set("selectOptions", null)
    
    @scala.inline
    def setSkipTaskbar(value: Boolean): Self = this.set("skipTaskbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipTaskbar: Self = this.set("skipTaskbar", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: input | select): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseHtmlLabel(value: Boolean): Self = this.set("useHtmlLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHtmlLabel: Self = this.set("useHtmlLabel", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
