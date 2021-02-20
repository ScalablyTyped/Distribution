package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def abandonment: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment = "abandonment".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.abandonment]
    
    @scala.inline
    def discard: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard = "discard".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.discard]
    
    @scala.inline
    def engagement: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement = "engagement".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.engagement]
    
    @scala.inline
    def start: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.start = "start".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.start]
  }
  
  /** A query performed in the urlbar. */
  @js.native
  trait Query extends StObject {
    
    /** Whether the query's browser context is private. */
    var isPrivate: Boolean = js.native
    
    /** The maximum number of results shown to the user. */
    var maxResults: Double = js.native
    
    /** The query's search string. */
    var searchString: String = js.native
    
    /** List of acceptable source types to return. */
    var sources: js.Array[SourceType] = js.native
  }
  object Query {
    
    @scala.inline
    def apply(isPrivate: Boolean, maxResults: Double, searchString: String, sources: js.Array[SourceType]): Query = {
      val __obj = js.Dynamic.literal(isPrivate = isPrivate.asInstanceOf[js.Any], maxResults = maxResults.asInstanceOf[js.Any], searchString = searchString.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit class QueryMutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchString(value: String): Self = StObject.set(x, "searchString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSources(value: js.Array[SourceType]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesVarargs(value: SourceType*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
  
  /** A result of a query. Queries can have many results. Each result is created by a provider. */
  @js.native
  trait Result extends StObject {
    
    /** An object with arbitrary properties depending on the result's type. */
    var payload: js.Object = js.native
    
    /** The result's source. */
    var source: SourceType = js.native
    
    /** Suggest a preferred position for this result within the result set. */
    var suggestedIndex: js.UndefOr[Double] = js.native
    
    /** The result's type. */
    var `type`: ResultType = js.native
  }
  object Result {
    
    @scala.inline
    def apply(payload: js.Object, source: SourceType, `type`: ResultType): Result = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: SourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedIndex(value: Double): Self = StObject.set(x, "suggestedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestedIndexUndefined: Self = StObject.set(x, "suggestedIndex", js.undefined)
      
      @scala.inline
      def setType(value: ResultType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def dynamic: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dynamic = "dynamic".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.dynamic]
    
    @scala.inline
    def remote_tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab = "remote_tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.remote_tab]
    
    @scala.inline
    def search: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = "search".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search]
    
    @scala.inline
    def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
    
    @scala.inline
    def tip: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tip = "tip".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tip]
    
    @scala.inline
    def url: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url = "url".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.url]
  }
  
  /** Options to the `search` function. */
  @js.native
  trait SearchOptions extends StObject {
    
    /** Whether to focus the input field and select its contents. */
    var focus: js.UndefOr[Boolean] = js.native
  }
  object SearchOptions {
    
    @scala.inline
    def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    @scala.inline
    implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
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
    
    @scala.inline
    def bookmarks: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks = "bookmarks".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmarks]
    
    @scala.inline
    def history: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.history = "history".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.history]
    
    @scala.inline
    def local: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.local = "local".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.local]
    
    @scala.inline
    def network: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.network = "network".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.network]
    
    @scala.inline
    def search: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search = "search".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.search]
    
    @scala.inline
    def tabs: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs = "tabs".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tabs]
  }
  
  @js.native
  trait UrlbarOnBehaviorRequestedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit = js.native
    
    def hasListener(cb: TCallback): Boolean = js.native
    
    def removeListener(cb: TCallback): Unit = js.native
  }
  object UrlbarOnBehaviorRequestedEvent {
    
    @scala.inline
    def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnBehaviorRequestedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnBehaviorRequestedEvent[TCallback]]
    }
    
    @scala.inline
    implicit class UrlbarOnBehaviorRequestedEventMutableBuilder[Self <: UrlbarOnBehaviorRequestedEvent[_], TCallback] (val x: Self with UrlbarOnBehaviorRequestedEvent[TCallback]) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UrlbarOnEngagementEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit = js.native
    
    def hasListener(cb: TCallback): Boolean = js.native
    
    def removeListener(cb: TCallback): Unit = js.native
  }
  object UrlbarOnEngagementEvent {
    
    @scala.inline
    def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnEngagementEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnEngagementEvent[TCallback]]
    }
    
    @scala.inline
    implicit class UrlbarOnEngagementEventMutableBuilder[Self <: UrlbarOnEngagementEvent[_], TCallback] (val x: Self with UrlbarOnEngagementEvent[TCallback]) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UrlbarOnQueryCanceledEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit = js.native
    
    def hasListener(cb: TCallback): Boolean = js.native
    
    def removeListener(cb: TCallback): Unit = js.native
  }
  object UrlbarOnQueryCanceledEvent {
    
    @scala.inline
    def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnQueryCanceledEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnQueryCanceledEvent[TCallback]]
    }
    
    @scala.inline
    implicit class UrlbarOnQueryCanceledEventMutableBuilder[Self <: UrlbarOnQueryCanceledEvent[_], TCallback] (val x: Self with UrlbarOnQueryCanceledEvent[TCallback]) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UrlbarOnResultPickedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit = js.native
    
    def hasListener(cb: TCallback): Boolean = js.native
    
    def removeListener(cb: TCallback): Unit = js.native
  }
  object UrlbarOnResultPickedEvent {
    
    @scala.inline
    def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnResultPickedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnResultPickedEvent[TCallback]]
    }
    
    @scala.inline
    implicit class UrlbarOnResultPickedEventMutableBuilder[Self <: UrlbarOnResultPickedEvent[_], TCallback] (val x: Self with UrlbarOnResultPickedEvent[TCallback]) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait UrlbarOnResultsRequestedEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, providerName: String): Unit = js.native
    
    def hasListener(cb: TCallback): Boolean = js.native
    
    def removeListener(cb: TCallback): Unit = js.native
  }
  object UrlbarOnResultsRequestedEvent {
    
    @scala.inline
    def apply[TCallback](
      addListener: (TCallback, String) => Unit,
      hasListener: TCallback => Boolean,
      removeListener: TCallback => Unit
    ): UrlbarOnResultsRequestedEvent[TCallback] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[UrlbarOnResultsRequestedEvent[TCallback]]
    }
    
    @scala.inline
    implicit class UrlbarOnResultsRequestedEventMutableBuilder[Self <: UrlbarOnResultsRequestedEvent[_], TCallback] (val x: Self with UrlbarOnResultsRequestedEvent[TCallback]) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (TCallback, String) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHasListener(value: TCallback => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListener(value: TCallback => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    }
  }
}
