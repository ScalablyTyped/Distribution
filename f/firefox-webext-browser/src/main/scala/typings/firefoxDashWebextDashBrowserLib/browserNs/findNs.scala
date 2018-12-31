package typings
package firefoxDashWebextDashBrowserLib.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.find` API to interact with the browser's `Find` interface.
  *
  * Permissions: `find`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.find")
@js.native
object findNs extends js.Object {
  /* find functions */
  /**
    * Search for text in document and store found ranges in array, in document order.
    * @param queryphrase The string to search for.
    * @param [params] Search parameters.
    */
  def find(queryphrase: java.lang.String): js.Promise[firefoxDashWebextDashBrowserLib.Anon_Count] = js.native
  def find(queryphrase: java.lang.String, params: firefoxDashWebextDashBrowserLib.Anon_TabIdIncludeRangeData): js.Promise[firefoxDashWebextDashBrowserLib.Anon_Count] = js.native
  /**
    * Highlight a range
    * @param [params] highlightResults parameters
    */
  def highlightResults(): scala.Unit = js.native
  def highlightResults(params: firefoxDashWebextDashBrowserLib.Anon_RangeIndex): scala.Unit = js.native
  /**
    * Remove all highlighting from previous searches.
    * @param [tabId] Tab to highlight. Defaults to the active tab.
    */
  def removeHighlighting(): scala.Unit = js.native
  def removeHighlighting(tabId: scala.Double): scala.Unit = js.native
}

