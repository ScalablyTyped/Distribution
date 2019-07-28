package typings.dynatable.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationPage extends js.Object {
  /** Parse the current window.location in order to determine the target page */
  def init(): Unit
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
  /**
    * Set the page in the dataset
    *
    * @param page The new page number
    */
  def set(page: Double): Unit
}

object PaginationPage {
  @scala.inline
  def apply(init: () => Unit, initOnLoad: () => Boolean, set: Double => Unit): PaginationPage = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[PaginationPage]
  }
}

