package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.find` API to interact with the browser's `Find` interface.
  *
  * Permissions: `find`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object find {
  
  /** Search parameters. */
  @js.native
  trait FindParams extends StObject {
    
    /** Find only ranges with case sensitive match. */
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    /** Find only ranges that match entire word. */
    var entireWord: js.UndefOr[Boolean] = js.native
    
    /** Return range data which provides range data in a serializable form. */
    var includeRangeData: js.UndefOr[Boolean] = js.native
    
    /** Return rectangle data which describes visual position of search results. */
    var includeRectData: js.UndefOr[Boolean] = js.native
    
    /** Tab to query. Defaults to the active tab. */
    var tabId: js.UndefOr[Double] = js.native
  }
  object FindParams {
    
    @scala.inline
    def apply(): FindParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindParams]
    }
    
    @scala.inline
    implicit class FindParamsMutableBuilder[Self <: FindParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setEntireWord(value: Boolean): Self = StObject.set(x, "entireWord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntireWordUndefined: Self = StObject.set(x, "entireWord", js.undefined)
      
      @scala.inline
      def setIncludeRangeData(value: Boolean): Self = StObject.set(x, "includeRangeData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeRangeDataUndefined: Self = StObject.set(x, "includeRangeData", js.undefined)
      
      @scala.inline
      def setIncludeRectData(value: Boolean): Self = StObject.set(x, "includeRectData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeRectDataUndefined: Self = StObject.set(x, "includeRectData", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  /** highlightResults parameters */
  @js.native
  trait HighlightResultsParams extends StObject {
    
    /** Don't scroll to highlighted item. */
    var noScroll: js.UndefOr[Boolean] = js.native
    
    /** Found range to be highlighted. Default highlights all ranges. */
    var rangeIndex: js.UndefOr[Double] = js.native
    
    /** Tab to highlight. Defaults to the active tab. */
    var tabId: js.UndefOr[Double] = js.native
  }
  object HighlightResultsParams {
    
    @scala.inline
    def apply(): HighlightResultsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightResultsParams]
    }
    
    @scala.inline
    implicit class HighlightResultsParamsMutableBuilder[Self <: HighlightResultsParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoScroll(value: Boolean): Self = StObject.set(x, "noScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoScrollUndefined: Self = StObject.set(x, "noScroll", js.undefined)
      
      @scala.inline
      def setRangeIndex(value: Double): Self = StObject.set(x, "rangeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeIndexUndefined: Self = StObject.set(x, "rangeIndex", js.undefined)
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
}
