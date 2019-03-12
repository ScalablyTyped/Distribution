package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPage extends js.Object {
  /** Parse the current window.location in order to determine the target page */
  def init(): scala.Unit
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): scala.Boolean
  /**
    * Set the page in the dataset
    *
    * @param page The new page number
    */
  def set(page: scala.Double): scala.Unit
}

object PaginationPage {
  @scala.inline
  def apply(init: () => scala.Unit, initOnLoad: () => scala.Boolean, set: scala.Double => scala.Unit): PaginationPage = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[PaginationPage]
  }
}

