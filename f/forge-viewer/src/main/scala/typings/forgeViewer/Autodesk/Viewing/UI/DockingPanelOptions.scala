package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DockingPanelOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var localizeTitle: js.UndefOr[Boolean] = js.undefined
}
object DockingPanelOptions {
  
  inline def apply(): DockingPanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DockingPanelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DockingPanelOptions] (val x: Self) extends AnyVal {
    
    inline def setLocalizeTitle(value: Boolean): Self = StObject.set(x, "localizeTitle", value.asInstanceOf[js.Any])
    
    inline def setLocalizeTitleUndefined: Self = StObject.set(x, "localizeTitle", js.undefined)
  }
}
