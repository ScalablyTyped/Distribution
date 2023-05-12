package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use browser.search to interact with search engines.
  *
  * Permissions: `search`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object search {
  
  /** Location where search results should be displayed. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.CURRENT_TAB
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.NEW_TAB
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.NEW_WINDOW
  */
  trait Disposition extends StObject
  object Disposition {
    
    inline def CURRENT_TAB: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.CURRENT_TAB = "CURRENT_TAB".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.CURRENT_TAB]
    
    inline def NEW_TAB: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.NEW_TAB = "NEW_TAB".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.NEW_TAB]
    
    inline def NEW_WINDOW: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.NEW_WINDOW = "NEW_WINDOW".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.NEW_WINDOW]
  }
  
  trait QueryQueryInfo extends StObject {
    
    /** Location where search results should be displayed. CURRENT_TAB is the default. */
    var disposition: js.UndefOr[Disposition] = js.undefined
    
    /** Location where search results should be displayed. tabId cannot be used with disposition. */
    var tabId: js.UndefOr[Double] = js.undefined
    
    /** String to query with the default search provider. */
    var text: String
  }
  object QueryQueryInfo {
    
    inline def apply(text: String): QueryQueryInfo = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryQueryInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryQueryInfo] (val x: Self) extends AnyVal {
      
      inline def setDisposition(value: Disposition): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* search types */
  /** An object encapsulating a search engine */
  trait SearchEngine extends StObject {
    
    var alias: js.UndefOr[String] = js.undefined
    
    var favIconUrl: js.UndefOr[String] = js.undefined
    
    var isDefault: Boolean
    
    var name: String
  }
  object SearchEngine {
    
    inline def apply(isDefault: Boolean, name: String): SearchEngine = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchEngine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchEngine] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setFavIconUrl(value: String): Self = StObject.set(x, "favIconUrl", value.asInstanceOf[js.Any])
      
      inline def setFavIconUrlUndefined: Self = StObject.set(x, "favIconUrl", js.undefined)
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchSearchProperties extends StObject {
    
    /** Location where search results should be displayed. NEW_TAB is the default. */
    var disposition: js.UndefOr[Disposition] = js.undefined
    
    /** Search engine to use. Uses the default if not specified. */
    var engine: js.UndefOr[String] = js.undefined
    
    /** Terms to search for. */
    var query: String
    
    /**
      * The ID of the tab for the search results. If not specified, a new tab is created, unless disposition is set. tabId cannot be used with disposition.
      */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object SearchSearchProperties {
    
    inline def apply(query: String): SearchSearchProperties = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchSearchProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchSearchProperties] (val x: Self) extends AnyVal {
      
      inline def setDisposition(value: Disposition): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
      
      inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
}
