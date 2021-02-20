package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object describing filters to apply to tabs.onUpdated events. */
@js.native
trait UpdateFilter extends StObject {
  
  /** A list of property names. Events that do not match any of the names will be filtered out. */
  var properties: js.UndefOr[js.Array[UpdatePropertyName]] = js.native
  
  var tabId: js.UndefOr[Double] = js.native
  
  /**
    * A list of URLs or URL patterns. Events that cannot match any of the URLs will be filtered out. Filtering with urls requires the `"tabs"` or `"activeTab"` permission.
    */
  var urls: js.UndefOr[js.Array[String]] = js.native
  
  var windowId: js.UndefOr[Double] = js.native
}
object UpdateFilter {
  
  @scala.inline
  def apply(): UpdateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFilter]
  }
  
  @scala.inline
  implicit class UpdateFilterMutableBuilder[Self <: UpdateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[UpdatePropertyName]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: UpdatePropertyName*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
  }
}
