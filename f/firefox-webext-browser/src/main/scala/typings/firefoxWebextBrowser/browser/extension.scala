package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.extension` API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
  */
object `extension` {
  
  trait GetViewsFetchProperties extends StObject {
    
    /** Find a view according to a tab id. If this field is omitted, returns all views. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /**
      * The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values: 'tab', 'popup', 'sidebar'.
      */
    var `type`: js.UndefOr[ViewType] = js.undefined
    
    /** The window to restrict the search to. If omitted, returns all views. */
    var windowId: js.UndefOr[Double] = js.undefined
  }
  object GetViewsFetchProperties {
    
    inline def apply(): GetViewsFetchProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetViewsFetchProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetViewsFetchProperties] (val x: Self) extends AnyVal {
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setType(value: ViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /**
    * Set for the lifetime of a callback if an ansychronous extension api has resulted in an error. If no error has occured lastError will be `undefined`.
    * @deprecated Please use `runtime.lastError`.
    * Not supported on manifest versions above 2.
    */
  trait LastError extends StObject {
    
    /** Description of the error that has taken place. */
    var message: String
  }
  object LastError {
    
    inline def apply(message: String): LastError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LastError] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* extension types */
  /** The type of extension view. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar
  */
  trait ViewType extends StObject
  object ViewType {
    
    inline def popup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
    
    inline def sidebar: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = "sidebar".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar]
    
    inline def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
  }
}
