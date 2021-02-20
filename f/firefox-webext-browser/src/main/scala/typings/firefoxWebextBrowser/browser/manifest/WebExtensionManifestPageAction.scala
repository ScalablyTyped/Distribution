package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebExtensionManifestPageAction extends StObject {
  
  var browser_style: js.UndefOr[Boolean] = js.native
  
  var default_icon: js.UndefOr[IconPath] = js.native
  
  var default_popup: js.UndefOr[String] = js.native
  
  var default_title: js.UndefOr[String] = js.native
  
  var hide_matches: js.UndefOr[js.Array[MatchPatternRestricted]] = js.native
  
  var pinned: js.UndefOr[Boolean] = js.native
  
  var show_matches: js.UndefOr[js.Array[MatchPattern]] = js.native
}
object WebExtensionManifestPageAction {
  
  @scala.inline
  def apply(): WebExtensionManifestPageAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebExtensionManifestPageAction]
  }
  
  @scala.inline
  implicit class WebExtensionManifestPageActionMutableBuilder[Self <: WebExtensionManifestPageAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowser_style(value: Boolean): Self = StObject.set(x, "browser_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_styleUndefined: Self = StObject.set(x, "browser_style", js.undefined)
    
    @scala.inline
    def setDefault_icon(value: IconPath): Self = StObject.set(x, "default_icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_iconUndefined: Self = StObject.set(x, "default_icon", js.undefined)
    
    @scala.inline
    def setDefault_popup(value: String): Self = StObject.set(x, "default_popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_popupUndefined: Self = StObject.set(x, "default_popup", js.undefined)
    
    @scala.inline
    def setDefault_title(value: String): Self = StObject.set(x, "default_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_titleUndefined: Self = StObject.set(x, "default_title", js.undefined)
    
    @scala.inline
    def setHide_matches(value: js.Array[MatchPatternRestricted]): Self = StObject.set(x, "hide_matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHide_matchesUndefined: Self = StObject.set(x, "hide_matches", js.undefined)
    
    @scala.inline
    def setHide_matchesVarargs(value: MatchPatternRestricted*): Self = StObject.set(x, "hide_matches", js.Array(value :_*))
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    
    @scala.inline
    def setShow_matches(value: js.Array[MatchPattern]): Self = StObject.set(x, "show_matches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_matchesUndefined: Self = StObject.set(x, "show_matches", js.undefined)
    
    @scala.inline
    def setShow_matchesVarargs(value: MatchPattern*): Self = StObject.set(x, "show_matches", js.Array(value :_*))
  }
}
