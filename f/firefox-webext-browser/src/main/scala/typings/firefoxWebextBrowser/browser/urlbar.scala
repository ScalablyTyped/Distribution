package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.urlbar` API to experiment with new features in the URLBar. Restricted to Mozilla privileged WebExtensions.
  *
  * Permissions: `urlbar`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object urlbar {
  
  /* urlbar types */
  /**
    * The state of an engagement made with the urlbar by the user. `start`: The user has started an engagement. `engagement`: The user has completed an engagement by picking a result. `abandonment`: The user has abandoned their engagement, for example by blurring the urlbar. `discard`: The engagement ended in a way that should be ignored by listeners.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.start
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard
  */
  trait EngagementState extends StObject
  object EngagementState {
    
    inline def abandonment: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment = "abandonment".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment]
    
    inline def discard: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard = "discard".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard]
    
    inline def engagement: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement = "engagement".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement]
    
    inline def start: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.start = "start".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.start]
  }
  
  /** A query performed in the urlbar. */
  trait Query extends StObject {
    
    /** Whether the query's browser context is private. */
    var isPrivate: Boolean
    
    /** The maximum number of results shown to the user. */
    var maxResults: Double
    
    /** The query's search string. */
    var searchString: String
    
    /** List of acceptable source types to return. */
    var sources: js.Array[SourceType]
  }
  object Query {
    
    inline def apply(isPrivate: Boolean, maxResults: Double, searchString: String, sources: js.Array[SourceType]): Query = {
      val __obj = js.Dynamic.literal(isPrivate = isPrivate.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    extension [Self <: Query](x: Self) {
      
      inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[SourceType]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: SourceType*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
  
  /** A result of a query. Queries can have many results. Each result is created by a provider. */
  trait Result extends StObject {
    
    /** An object with arbitrary properties depending on the result's type. */
    var payload: js.Object
    
    /** The result's source. */
    var source: SourceType
    
    /** Suggest a preferred position for this result within the result set. */
    var suggestedIndex: js.UndefOr[Double] = js.undefined
    
    /** The result's type. */
    var `type`: ResultType
  }
  object Result {
    
    inline def apply(payload: js.Object, source: SourceType, `type`: ResultType): Result = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSource(value: SourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSuggestedIndex(value: Double): Self = StObject.set(x, "suggestedIndex", value.asInstanceOf[js.Any])
      
      inline def setSuggestedIndexUndefined: Self = StObject.set(x, "suggestedIndex", js.undefined)
      
      inline def setType(value: ResultType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Possible types of results. `dynamic`: A result whose view and payload are specified by the extension. `remote_tab`: A synced tab from another device. `search`: A search suggestion from a search engine. `tab`: An open tab in the browser. `tip`: An actionable message to help the user with their query. `url`: A URL that's not one of the other types.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dynamic
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tip
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url
  */
  trait ResultType extends StObject
  object ResultType {
    
    inline def dynamic: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dynamic = "dynamic".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dynamic]
    
    inline def remote_tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab = "remote_tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab]
    
    inline def search: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = "search".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search]
    
    inline def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
    
    inline def tip: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tip = "tip".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tip]
    
    inline def url: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = "url".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url]
  }
  
  /** Options to the `search` function. */
  trait SearchOptions extends StObject {
    
    /** Whether to focus the input field and select its contents. */
    var focus: js.UndefOr[Boolean] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    extension [Self <: SearchOptions](x: Self) {
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    }
  }
  
  /**
    * Possible sources of results. `bookmarks`: The result comes from the user's bookmarks. `history`: The result comes from the user's history. `local`: The result comes from some local source not covered by another source type. `network`: The result comes from some network source not covered by another source type. `search`: The result comes from a search engine. `tabs`: The result is an open tab in the browser or a synced tab from another device.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.history
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.local
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.network
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs
  */
  trait SourceType extends StObject
  object SourceType {
    
    inline def bookmarks: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks = "bookmarks".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks]
    
    inline def history: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.history = "history".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.history]
    
    inline def local: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.local = "local".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.local]
    
    inline def network: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.network = "network".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.network]
    
    inline def search: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = "search".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search]
    
    inline def tabs: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs = "tabs".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs]
  }
  
  trait UrlbarOnBehaviorRequestedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnBehaviorRequestedEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnBehaviorRequestedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnBehaviorRequestedEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnBehaviorRequestedEvent[?], TCallback](x: Self & UrlbarOnBehaviorRequestedEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  trait UrlbarOnEngagementEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnEngagementEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnEngagementEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnEngagementEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnEngagementEvent[?], TCallback](x: Self & UrlbarOnEngagementEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  trait UrlbarOnQueryCanceledEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnQueryCanceledEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnQueryCanceledEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnQueryCanceledEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnQueryCanceledEvent[?], TCallback](x: Self & UrlbarOnQueryCanceledEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  trait UrlbarOnResultPickedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnResultPickedEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnResultPickedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnResultPickedEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnResultPickedEvent[?], TCallback](x: Self & UrlbarOnResultPickedEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  trait UrlbarOnResultsRequestedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit
    
    def hasListener(cb: TCallback): Boolean
    
    def removeListener(cb: TCallback): Unit
  }
  object UrlbarOnResultsRequestedEvent {
    
    inline def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnResultsRequestedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnResultsRequestedEvent[TCallback]]
    }
    
    extension [Self <: UrlbarOnResultsRequestedEvent[?], TCallback](x: Self & UrlbarOnResultsRequestedEvent[TCallback]) {
      
      inline def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      inline def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
}
