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
  
  /* search types */
  /** An object encapsulating a search engine */
  trait SearchEngine extends StObject {
    
    var alias: js.UndefOr[String] = js.undefined
    
    var favIconUrl: js.UndefOr[String] = js.undefined
    
    var isDefault: Boolean
    
    var name: String
  }
  object SearchEngine {
    
    @scala.inline
    def apply(isDefault: Boolean, name: String): SearchEngine = {
      val __obj = js.Dynamic.literal(isDefault = isDefault.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchEngine]
    }
    
    @scala.inline
    implicit class SearchEngineMutableBuilder[Self <: SearchEngine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setFavIconUrl(value: String): Self = StObject.set(x, "favIconUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFavIconUrlUndefined: Self = StObject.set(x, "favIconUrl", js.undefined)
      
      @scala.inline
      def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchSearchProperties extends StObject {
    
    /** Search engine to use. Uses the default if not specified. */
    var engine: js.UndefOr[String] = js.undefined
    
    /** Terms to search for. */
    var query: String
    
    /** The ID of the tab for the search results. If not specified, a new tab is created. */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object SearchSearchProperties {
    
    @scala.inline
    def apply(query: String): SearchSearchProperties = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchSearchProperties]
    }
    
    @scala.inline
    implicit class SearchSearchPropertiesMutableBuilder[Self <: SearchSearchProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
}
