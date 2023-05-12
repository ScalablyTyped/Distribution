package typings.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  trait FindParams extends StObject {
    
    /** Find only ranges with case sensitive match. */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /** Find only ranges that match entire word. */
    var entireWord: js.UndefOr[Boolean] = js.undefined
    
    /** Return range data which provides range data in a serializable form. */
    var includeRangeData: js.UndefOr[Boolean] = js.undefined
    
    /** Return rectangle data which describes visual position of search results. */
    var includeRectData: js.UndefOr[Boolean] = js.undefined
    
    /** Find only ranges with diacritic sensitive match. */
    var matchDiacritics: js.UndefOr[Boolean] = js.undefined
    
    /** Tab to query. Defaults to the active tab. */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object FindParams {
    
    inline def apply(): FindParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FindParams] (val x: Self) extends AnyVal {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setEntireWord(value: Boolean): Self = StObject.set(x, "entireWord", value.asInstanceOf[js.Any])
      
      inline def setEntireWordUndefined: Self = StObject.set(x, "entireWord", js.undefined)
      
      inline def setIncludeRangeData(value: Boolean): Self = StObject.set(x, "includeRangeData", value.asInstanceOf[js.Any])
      
      inline def setIncludeRangeDataUndefined: Self = StObject.set(x, "includeRangeData", js.undefined)
      
      inline def setIncludeRectData(value: Boolean): Self = StObject.set(x, "includeRectData", value.asInstanceOf[js.Any])
      
      inline def setIncludeRectDataUndefined: Self = StObject.set(x, "includeRectData", js.undefined)
      
      inline def setMatchDiacritics(value: Boolean): Self = StObject.set(x, "matchDiacritics", value.asInstanceOf[js.Any])
      
      inline def setMatchDiacriticsUndefined: Self = StObject.set(x, "matchDiacritics", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
  
  /** highlightResults parameters */
  trait HighlightResultsParams extends StObject {
    
    /** Don't scroll to highlighted item. */
    var noScroll: js.UndefOr[Boolean] = js.undefined
    
    /** Found range to be highlighted. Default highlights all ranges. */
    var rangeIndex: js.UndefOr[Double] = js.undefined
    
    /** Tab to highlight. Defaults to the active tab. */
    var tabId: js.UndefOr[Double] = js.undefined
  }
  object HighlightResultsParams {
    
    inline def apply(): HighlightResultsParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightResultsParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightResultsParams] (val x: Self) extends AnyVal {
      
      inline def setNoScroll(value: Boolean): Self = StObject.set(x, "noScroll", value.asInstanceOf[js.Any])
      
      inline def setNoScrollUndefined: Self = StObject.set(x, "noScroll", js.undefined)
      
      inline def setRangeIndex(value: Double): Self = StObject.set(x, "rangeIndex", value.asInstanceOf[js.Any])
      
      inline def setRangeIndexUndefined: Self = StObject.set(x, "rangeIndex", js.undefined)
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
    }
  }
}
