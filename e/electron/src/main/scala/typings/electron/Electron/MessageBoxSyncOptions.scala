package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBoxSyncOptions extends js.Object {
  
  /**
    * Array of texts for buttons. On Windows, an empty array will result in one button
    * labeled "OK".
    */
  var buttons: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The index of the button to be used to cancel the dialog, via the `Esc` key. By
    * default this is assigned to the first button with "cancel" or "no" as the label.
    * If no such labeled buttons exist and this option is not set, `0` will be used as
    * the return value.
    */
  var cancelId: js.UndefOr[Double] = js.native
  
  /**
    * Initial checked state of the checkbox. `false` by default.
    */
  var checkboxChecked: js.UndefOr[Boolean] = js.native
  
  /**
    * If provided, the message box will include a checkbox with the given label.
    */
  var checkboxLabel: js.UndefOr[String] = js.native
  
  /**
    * Index of the button in the buttons array which will be selected by default when
    * the message box opens.
    */
  var defaultId: js.UndefOr[Double] = js.native
  
  /**
    * Extra information of the message.
    */
  var detail: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[NativeImage_ | String] = js.native
  
  /**
    * Content of the message box.
    */
  var message: String = js.native
  
  /**
    * On Windows Electron will try to figure out which one of the `buttons` are common
    * buttons (like "Cancel" or "Yes"), and show the others as command links in the
    * dialog. This can make the dialog appear in the style of modern Windows apps. If
    * you don't like this behavior, you can set `noLink` to `true`.
    */
  var noLink: js.UndefOr[Boolean] = js.native
  
  /**
    * Normalize the keyboard access keys across platforms. Default is `false`.
    * Enabling this assumes `&` is used in the button labels for the placement of the
    * keyboard shortcut access key and labels will be converted so they work correctly
    * on each platform, `&` characters are removed on macOS, converted to `_` on
    * Linux, and left untouched on Windows. For example, a button label of `Vie&w`
    * will be converted to `Vie_w` on Linux and `View` on macOS and can be selected
    * via `Alt-W` on Windows and Linux.
    */
  var normalizeAccessKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * Title of the message box, some platforms will not show it.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Can be `"none"`, `"info"`, `"error"`, `"question"` or `"warning"`. On Windows,
    * `"question"` displays the same icon as `"info"`, unless you set an icon using
    * the `"icon"` option. On macOS, both `"warning"` and `"error"` display the same
    * warning icon.
    */
  var `type`: js.UndefOr[String] = js.native
}
object MessageBoxSyncOptions {
  
  @scala.inline
  def apply(message: String): MessageBoxSyncOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxSyncOptions]
  }
  
  @scala.inline
  implicit class MessageBoxSyncOptionsOps[Self <: MessageBoxSyncOptions] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsVarargs(value: String*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[String]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setCancelId(value: Double): Self = this.set("cancelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelId: Self = this.set("cancelId", js.undefined)
    
    @scala.inline
    def setCheckboxChecked(value: Boolean): Self = this.set("checkboxChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxChecked: Self = this.set("checkboxChecked", js.undefined)
    
    @scala.inline
    def setCheckboxLabel(value: String): Self = this.set("checkboxLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxLabel: Self = this.set("checkboxLabel", js.undefined)
    
    @scala.inline
    def setDefaultId(value: Double): Self = this.set("defaultId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultId: Self = this.set("defaultId", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setIcon(value: NativeImage_ | String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setNoLink(value: Boolean): Self = this.set("noLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoLink: Self = this.set("noLink", js.undefined)
    
    @scala.inline
    def setNormalizeAccessKeys(value: Boolean): Self = this.set("normalizeAccessKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeAccessKeys: Self = this.set("normalizeAccessKeys", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
