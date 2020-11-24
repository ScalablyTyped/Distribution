package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenuSettings extends js.Object {
  
  /** The customMenuFields property is used to define custom functionality for custom ContextMenu item's which are defined in items property.
    * @Default {[]}
    */
  var customMenuFields: js.UndefOr[js.Array[_]] = js.native
  
  /** The items property is used to configure and group the required ContextMenu items in FileExplorer control.
    * @Default {{% highlight javascript %}{navbar: [NewFolder, Upload, |, Delete, Rename, |, Cut, Copy, Paste, |, Getinfo],cwd: [Refresh, Paste,|, SortBy, |, NewFolder, Upload, |,
    * Getinfo],files: [Open, Download, |, Upload, |, Delete, Rename, |, Cut, Copy, Paste, |, OpenFolderLocation, Getinfo]}{% endhighlight %}}
    */
  var items: js.UndefOr[js.Any] = js.native
}
object ContextMenuSettings {
  
  @scala.inline
  def apply(): ContextMenuSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuSettings]
  }
  
  @scala.inline
  implicit class ContextMenuSettingsOps[Self <: ContextMenuSettings] (val x: Self) extends AnyVal {
    
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
    def setCustomMenuFieldsVarargs(value: js.Any*): Self = this.set("customMenuFields", js.Array(value :_*))
    
    @scala.inline
    def setCustomMenuFields(value: js.Array[_]): Self = this.set("customMenuFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomMenuFields: Self = this.set("customMenuFields", js.undefined)
    
    @scala.inline
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
