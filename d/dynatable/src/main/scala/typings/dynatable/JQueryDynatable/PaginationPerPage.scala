package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationPerPage extends js.Object {
  /** Insert the pagination per page inside the page */
  def attach(): Unit = js.native
  /**
    * Generate the html markup for the pagination per page
    *
    * @return A jQuery object containing the `<label>` and the `<select>`
    */
  def create(): JQuery = js.native
  /** Set up the pagination per page */
  def init(): Unit = js.native
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean = js.native
  /**
    * Set the new value for the pagination per page
    *
    * @param number The new number of items visible per page
    * @param skipResetPage By default (false) it sends you to page 1
    */
  def set(number: Double): Unit = js.native
  def set(number: Double, skipResetPage: Boolean): Unit = js.native
}

