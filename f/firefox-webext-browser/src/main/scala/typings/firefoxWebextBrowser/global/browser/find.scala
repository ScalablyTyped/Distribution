package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.anon.Count
import typings.firefoxWebextBrowser.browser.find.FindParams
import typings.firefoxWebextBrowser.browser.find.HighlightResultsParams
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
  
  @JSGlobal("browser.find")
  @js.native
  val ^ : js.Any = js.native
  /* find functions */
  /**
    * Search for text in document and store found ranges in array, in document order.
    * @param queryphrase The string to search for.
    * @param [params] Search parameters.
    */
  inline def find(queryphrase: String): js.Promise[Count] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(queryphrase.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Count]]
  inline def find(queryphrase: String, params: FindParams): js.Promise[Count] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(queryphrase.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Count]]
  
  /**
    * Highlight a range
    * @param [params] highlightResults parameters
    */
  inline def highlightResults(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightResults")().asInstanceOf[Unit]
  inline def highlightResults(params: HighlightResultsParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightResults")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Remove all highlighting from previous searches.
    * @param [tabId] Tab to highlight. Defaults to the active tab.
    */
  inline def removeHighlighting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHighlighting")().asInstanceOf[Unit]
  inline def removeHighlighting(tabId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHighlighting")(tabId.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
