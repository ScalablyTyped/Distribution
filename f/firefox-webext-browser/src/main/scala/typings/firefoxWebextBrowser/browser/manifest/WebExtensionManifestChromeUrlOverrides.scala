package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestChromeUrlOverrides extends StObject {
  
  /** @deprecated Unsupported on Firefox at this time. */
  var bookmarks: js.UndefOr[ExtensionURL] = js.native
  
  /** @deprecated Unsupported on Firefox at this time. */
  var history: js.UndefOr[ExtensionURL] = js.native
  
  var newtab: js.UndefOr[ExtensionURL] = js.native
}
object WebExtensionManifestChromeUrlOverrides {
  
  @scala.inline
  def apply(): WebExtensionManifestChromeUrlOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestChromeUrlOverrides]
  }
  
  @scala.inline
  implicit class WebExtensionManifestChromeUrlOverridesMutableBuilder[Self <: WebExtensionManifestChromeUrlOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookmarks(value: ExtensionURL): Self = StObject.set(x, "bookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookmarksUndefined: Self = StObject.set(x, "bookmarks", js.undefined)
    
    @scala.inline
    def setHistory(value: ExtensionURL): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setNewtab(value: ExtensionURL): Self = StObject.set(x, "newtab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewtabUndefined: Self = StObject.set(x, "newtab", js.undefined)
  }
}
