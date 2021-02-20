package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.anon.Count
import typings.firefoxWebextBrowser.browser.find.FindParams
import typings.firefoxWebextBrowser.browser.find.HighlightResultsParams
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
  
  /* find functions */
  /**
    * Search for text in document and store found ranges in array, in document order.
    * @param queryphrase The string to search for.
    * @param [params] Search parameters.
    */
  @JSGlobal("browser.find.find")
  @js.native
  def find(queryphrase: String): js.Promise[Count] = js.native
  @JSGlobal("browser.find.find")
  @js.native
  def find(queryphrase: String, params: FindParams): js.Promise[Count] = js.native
  
  /**
    * Highlight a range
    * @param [params] highlightResults parameters
    */
  @JSGlobal("browser.find.highlightResults")
  @js.native
  def highlightResults(): Unit = js.native
  @JSGlobal("browser.find.highlightResults")
  @js.native
  def highlightResults(params: HighlightResultsParams): Unit = js.native
  
  /**
    * Remove all highlighting from previous searches.
    * @param [tabId] Tab to highlight. Defaults to the active tab.
    */
  @JSGlobal("browser.find.removeHighlighting")
  @js.native
  def removeHighlighting(): Unit = js.native
  @JSGlobal("browser.find.removeHighlighting")
  @js.native
  def removeHighlighting(tabId: Double): Unit = js.native
}
