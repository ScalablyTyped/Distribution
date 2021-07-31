package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShortcutDetails extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/shortcut-details
  /**
    * The Application User Model ID. Default is empty.
    */
  var appUserModelId: js.UndefOr[String] = js.undefined
  
  /**
    * The arguments to be applied to `target` when launching from this shortcut.
    * Default is empty.
    */
  var args: js.UndefOr[String] = js.undefined
  
  /**
    * The working directory. Default is empty.
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the shortcut. Default is empty.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the icon, can be a DLL or EXE. `icon` and `iconIndex` have to be set
    * together. Default is empty, which uses the target's icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * The resource ID of icon when `icon` is a DLL or EXE. Default is 0.
    */
  var iconIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The target to launch from this shortcut.
    */
  var target: String
}
object ShortcutDetails {
  
  @scala.inline
  def apply(target: String): ShortcutDetails = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutDetails]
  }
  
  @scala.inline
  implicit class ShortcutDetailsMutableBuilder[Self <: ShortcutDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUserModelId(value: String): Self = StObject.set(x, "appUserModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUserModelIdUndefined: Self = StObject.set(x, "appUserModelId", js.undefined)
    
    @scala.inline
    def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconIndex(value: Double): Self = StObject.set(x, "iconIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconIndexUndefined: Self = StObject.set(x, "iconIndex", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
