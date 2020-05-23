package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffind extends js.Object {
  /* find functions */
  /**
    * Search for text in document and store found ranges in array, in document order.
    * @param queryphrase The string to search for.
    * @param [params] Search parameters.
    */
  def find(queryphrase: String): js.Promise[Count] = js.native
  def find(queryphrase: String, params: CaseSensitive): js.Promise[Count] = js.native
  /**
    * Highlight a range
    * @param [params] highlightResults parameters
    */
  def highlightResults(): Unit = js.native
  def highlightResults(params: NoScroll): Unit = js.native
  /**
    * Remove all highlighting from previous searches.
    * @param [tabId] Tab to highlight. Defaults to the active tab.
    */
  def removeHighlighting(): Unit = js.native
  def removeHighlighting(tabId: Double): Unit = js.native
}

