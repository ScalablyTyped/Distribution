package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockingPanelOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var localizeTitle: js.UndefOr[Boolean] = js.undefined
}
object DockingPanelOptions {
  
  @scala.inline
  def apply(): DockingPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockingPanelOptions]
  }
  
  @scala.inline
  implicit class DockingPanelOptionsMutableBuilder[Self <: DockingPanelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalizeTitle(value: Boolean): Self = StObject.set(x, "localizeTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizeTitleUndefined: Self = StObject.set(x, "localizeTitle", js.undefined)
  }
}
