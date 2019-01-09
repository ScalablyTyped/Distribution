package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Find extends js.Object {
  /* find functions */
  /**
    * Search for text in document and store found ranges in array, in document order.
    * @param queryphrase The string to search for.
    * @param [params] Search parameters.
    */
  def find(queryphrase: java.lang.String): js.Promise[Anon_Count] = js.native
  def find(queryphrase: java.lang.String, params: Anon_CaseSensitive): js.Promise[Anon_Count] = js.native
  /**
    * Highlight a range
    * @param [params] highlightResults parameters
    */
  def highlightResults(): scala.Unit = js.native
  def highlightResults(params: Anon_NoScroll): scala.Unit = js.native
  /**
    * Remove all highlighting from previous searches.
    * @param [tabId] Tab to highlight. Defaults to the active tab.
    */
  def removeHighlighting(): scala.Unit = js.native
  def removeHighlighting(tabId: scala.Double): scala.Unit = js.native
}

