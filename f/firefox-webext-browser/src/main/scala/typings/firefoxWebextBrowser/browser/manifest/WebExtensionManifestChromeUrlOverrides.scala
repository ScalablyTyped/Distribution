package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestChromeUrlOverrides extends StObject {
  
  /** @deprecated Unsupported on Firefox at this time. */
  var bookmarks: js.UndefOr[ExtensionURL] = js.undefined
  
  /** @deprecated Unsupported on Firefox at this time. */
  var history: js.UndefOr[ExtensionURL] = js.undefined
  
  var newtab: js.UndefOr[ExtensionURL] = js.undefined
}
object WebExtensionManifestChromeUrlOverrides {
  
  inline def apply(): WebExtensionManifestChromeUrlOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestChromeUrlOverrides]
  }
  
  extension [Self <: WebExtensionManifestChromeUrlOverrides](x: Self) {
    
    inline def setBookmarks(value: ExtensionURL): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    inline def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    inline def setHistory(value: ExtensionURL): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setNewtab(value: ExtensionURL): Self = StObject.set(x, "newtab", value.asInstanceOf[js.Any])
    
    inline def setNewtabUndefined: Self = StObject.set(x, "newtab", js.undefined)
  }
}
