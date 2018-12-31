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

