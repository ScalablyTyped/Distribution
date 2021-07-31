package typings.firefoxWebextBrowser.browser.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReloadReloadProperties extends StObject {
  
  /** Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.undefined
}
object ReloadReloadProperties {
  
  @scala.inline
  def apply(): ReloadReloadProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadReloadProperties]
  }
  
  @scala.inline
  implicit class ReloadReloadPropertiesMutableBuilder[Self <: ReloadReloadProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassCache(value: Boolean): Self = StObject.set(x, "bypassCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassCacheUndefined: Self = StObject.set(x, "bypassCache", js.undefined)
  }
}
