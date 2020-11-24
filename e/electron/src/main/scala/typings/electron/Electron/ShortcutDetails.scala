package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortcutDetails extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/shortcut-details
  /**
    * The Application User Model ID. Default is empty.
    */
  var appUserModelId: js.UndefOr[String] = js.native
  
  /**
    * The arguments to be applied to `target` when launching from this shortcut.
    * Default is empty.
    */
  var args: js.UndefOr[String] = js.native
  
  /**
    * The working directory. Default is empty.
    */
  var cwd: js.UndefOr[String] = js.native
  
  /**
    * The description of the shortcut. Default is empty.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The path to the icon, can be a DLL or EXE. `icon` and `iconIndex` have to be set
    * together. Default is empty, which uses the target's icon.
    */
  var icon: js.UndefOr[String] = js.native
  
  /**
    * The resource ID of icon when `icon` is a DLL or EXE. Default is 0.
    */
  var iconIndex: js.UndefOr[Double] = js.native
  
  /**
    * The target to launch from this shortcut.
    */
  var target: String = js.native
}
object ShortcutDetails {
  
  @scala.inline
  def apply(target: String): ShortcutDetails = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutDetails]
  }
  
  @scala.inline
  implicit class ShortcutDetailsOps[Self <: ShortcutDetails] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUserModelId(value: String): Self = this.set("appUserModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppUserModelId: Self = this.set("appUserModelId", js.undefined)
    
    @scala.inline
    def setArgs(value: String): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconIndex(value: Double): Self = this.set("iconIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconIndex: Self = this.set("iconIndex", js.undefined)
  }
}
