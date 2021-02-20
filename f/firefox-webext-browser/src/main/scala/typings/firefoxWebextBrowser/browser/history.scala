package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.extensionTypes.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
  *
  * Permissions: `history`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object history {
  
  @js.native
  trait AddUrlDetails extends StObject {
    
    /** The title of the page. */
    var title: js.UndefOr[String] = js.native
    
    /** The transition type for this visit from its referrer. */
    var transition: js.UndefOr[TransitionType] = js.native
    
    /** The URL to add. Must be a valid URL that can be added to history. */
    var url: String = js.native
    
    /** The date when this visit occurred. */
    var visitTime: js.UndefOr[Date] = js.native
  }
  object AddUrlDetails {
    
    @scala.inline
    def apply(url: String): AddUrlDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddUrlDetails]
    }
    
    @scala.inline
    implicit class AddUrlDetailsMutableBuilder[Self <: AddUrlDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTime(value: Date): Self = StObject.set(x, "visitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTimeUndefined: Self = StObject.set(x, "visitTime", js.undefined)
    }
  }
  
  @js.native
  trait DeleteRangeRange extends StObject {
    
    /** Items added to history before this date. */
    var endTime: Date = js.native
    
    /** Items added to history after this date. */
    var startTime: Date = js.native
  }
  object DeleteRangeRange {
    
    @scala.inline
    def apply(endTime: Date, startTime: Date): DeleteRangeRange = {
      val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteRangeRange]
    }
    
    @scala.inline
    implicit class DeleteRangeRangeMutableBuilder[Self <: DeleteRangeRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteUrlDetails extends StObject {
    
    /** The URL to remove. */
    var url: String = js.native
  }
  object DeleteUrlDetails {
    
    @scala.inline
    def apply(url: String): DeleteUrlDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteUrlDetails]
    }
    
    @scala.inline
    implicit class DeleteUrlDetailsMutableBuilder[Self <: DeleteUrlDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetVisitsDetails extends StObject {
    
    /**
      * The URL for which to retrieve visit information. It must be in the format as returned from a call to history.search.
      */
    var url: String = js.native
  }
  object GetVisitsDetails {
    
    @scala.inline
    def apply(url: String): GetVisitsDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVisitsDetails]
    }
    
    @scala.inline
    implicit class GetVisitsDetailsMutableBuilder[Self <: GetVisitsDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /** An object encapsulating one result of a history query. */
  @js.native
  trait HistoryItem extends StObject {
    
    /** The unique identifier for the item. */
    var id: String = js.native
    
    /** When this page was last loaded, represented in milliseconds since the epoch. */
    var lastVisitTime: js.UndefOr[Double] = js.native
    
    /** The title of the page when it was last loaded. */
    var title: js.UndefOr[String] = js.native
    
    /** The number of times the user has navigated to this page by typing in the address. */
    var typedCount: js.UndefOr[Double] = js.native
    
    /** The URL navigated to by a user. */
    var url: js.UndefOr[String] = js.native
    
    /** The number of times the user has navigated to this page. */
    var visitCount: js.UndefOr[Double] = js.native
  }
  object HistoryItem {
    
    @scala.inline
    def apply(id: String): HistoryItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryItem]
    }
    
    @scala.inline
    implicit class HistoryItemMutableBuilder[Self <: HistoryItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastVisitTime(value: Double): Self = StObject.set(x, "lastVisitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastVisitTimeUndefined: Self = StObject.set(x, "lastVisitTime", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTypedCount(value: Double): Self = StObject.set(x, "typedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypedCountUndefined: Self = StObject.set(x, "typedCount", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setVisitCount(value: Double): Self = StObject.set(x, "visitCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitCountUndefined: Self = StObject.set(x, "visitCount", js.undefined)
    }
  }
  
  @js.native
  trait OnTitleChangedChanged extends StObject {
    
    /** The new title for the URL. */
    var title: String = js.native
    
    /** The URL for which the title has changed */
    var url: String = js.native
  }
  object OnTitleChangedChanged {
    
    @scala.inline
    def apply(title: String, url: String): OnTitleChangedChanged = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnTitleChangedChanged]
    }
    
    @scala.inline
    implicit class OnTitleChangedChangedMutableBuilder[Self <: OnTitleChangedChanged] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnVisitRemovedRemoved extends StObject {
    
    /** True if all history was removed. If true, then urls will be empty. */
    var allHistory: Boolean = js.native
    
    var urls: js.Array[String] = js.native
  }
  object OnVisitRemovedRemoved {
    
    @scala.inline
    def apply(allHistory: Boolean, urls: js.Array[String]): OnVisitRemovedRemoved = {
      val __obj = js.Dynamic.literal(allHistory = allHistory.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnVisitRemovedRemoved]
    }
    
    @scala.inline
    implicit class OnVisitRemovedRemovedMutableBuilder[Self <: OnVisitRemovedRemoved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllHistory(value: Boolean): Self = StObject.set(x, "allHistory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SearchQuery extends StObject {
    
    /** Limit results to those visited before this date. */
    var endTime: js.UndefOr[Date] = js.native
    
    /** The maximum number of results to retrieve. Defaults to 100. */
    var maxResults: js.UndefOr[Double] = js.native
    
    /**
      * Limit results to those visited after this date. If not specified, this defaults to 24 hours in the past.
      */
    var startTime: js.UndefOr[Date] = js.native
    
    /** A free-text query to the history service. Leave empty to retrieve all pages. */
    var text: String = js.native
  }
  object SearchQuery {
    
    @scala.inline
    def apply(text: String): SearchQuery = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchQuery]
    }
    
    @scala.inline
    implicit class SearchQueryMutableBuilder[Self <: SearchQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* history types */
  /** The transition type for this visit from its referrer. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_toplevel
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated
  */
  trait TransitionType extends StObject
  object TransitionType {
    
    @scala.inline
    def auto_bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark = "auto_bookmark".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_bookmark]
    
    @scala.inline
    def auto_subframe: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe = "auto_subframe".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_subframe]
    
    @scala.inline
    def auto_toplevel: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_toplevel = "auto_toplevel".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.auto_toplevel]
    
    @scala.inline
    def form_submit: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit = "form_submit".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.form_submit]
    
    @scala.inline
    def generated: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated = "generated".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.generated]
    
    @scala.inline
    def keyword: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword = "keyword".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword]
    
    @scala.inline
    def keyword_generated: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated = "keyword_generated".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword_generated]
    
    @scala.inline
    def link: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = "link".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.link]
    
    @scala.inline
    def manual_subframe: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe = "manual_subframe".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual_subframe]
    
    @scala.inline
    def reload: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload = "reload".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.reload]
    
    @scala.inline
    def typed: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed = "typed".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.typed]
  }
  
  /** An object encapsulating one visit to a URL. */
  @js.native
  trait VisitItem extends StObject {
    
    /** The unique identifier for the item. */
    var id: String = js.native
    
    /** The visit ID of the referrer. */
    var referringVisitId: String = js.native
    
    /** The transition type for this visit from its referrer. */
    var transition: TransitionType = js.native
    
    /** The unique identifier for this visit. */
    var visitId: String = js.native
    
    /** When this visit occurred, represented in milliseconds since the epoch. */
    var visitTime: js.UndefOr[Double] = js.native
  }
  object VisitItem {
    
    @scala.inline
    def apply(id: String, referringVisitId: String, transition: TransitionType, visitId: String): VisitItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referringVisitId = referringVisitId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], visitId = visitId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisitItem]
    }
    
    @scala.inline
    implicit class VisitItemMutableBuilder[Self <: VisitItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferringVisitId(value: String): Self = StObject.set(x, "referringVisitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: TransitionType): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitId(value: String): Self = StObject.set(x, "visitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTime(value: Double): Self = StObject.set(x, "visitTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitTimeUndefined: Self = StObject.set(x, "visitTime", js.undefined)
    }
  }
}
