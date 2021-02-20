package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `browser.extension` API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
  */
object extension {
  
  @js.native
  trait GetViewsFetchProperties extends StObject {
    
    /** Find a view according to a tab id. If this field is omitted, returns all views. */
    var tabId: js.UndefOr[Double] = js.native
    
    /**
      * The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values: 'tab', 'popup', 'sidebar'.
      */
    var `type`: js.UndefOr[ViewType] = js.native
    
    /** The window to restrict the search to. If omitted, returns all views. */
    var windowId: js.UndefOr[Double] = js.native
  }
  object GetViewsFetchProperties {
    
    @scala.inline
    def apply(): GetViewsFetchProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetViewsFetchProperties]
    }
    
    @scala.inline
    implicit class GetViewsFetchPropertiesMutableBuilder[Self <: GetViewsFetchProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      @scala.inline
      def setType(value: ViewType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
  
  /**
    * Set for the lifetime of a callback if an ansychronous extension api has resulted in an error. If no error has occured lastError will be `undefined`.
    */
  @js.native
  trait LastError extends StObject {
    
    /** Description of the error that has taken place. */
    var message: String = js.native
  }
  object LastError {
    
    @scala.inline
    def apply(message: String): LastError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastError]
    }
    
    @scala.inline
    implicit class LastErrorMutableBuilder[Self <: LastError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def popup: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup = "popup".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.popup]
    
    @scala.inline
    def sidebar: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar = "sidebar".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.sidebar]
    
    @scala.inline
    def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
  }
}
