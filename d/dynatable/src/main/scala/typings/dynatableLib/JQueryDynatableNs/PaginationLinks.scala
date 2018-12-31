package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationLinks extends js.Object {
  /** Insert the pagination links inside the page */
  def attach(): scala.Unit = js.native
  /**
    * Generate a string containing the html of a pagination link
    *
    * @param page The page number
    * @param label The text of the link (could be Previous, Next or a number)
    * @param linkClass The classname for the `<a>`
    * @param conditional Do we want to use the conditionalClass
    * @param conditionalClass The classname for both the `<li>` and its `<a>`
    * @return A string containing html markup
    */
  def buildLink(
    page: scala.Double,
    label: java.lang.String,
    linkClass: java.lang.String,
    conditional: scala.Boolean,
    conditionalClass: java.lang.String
  ): java.lang.String = js.native
  def buildLink(
    page: scala.Double,
    label: scala.Double,
    linkClass: java.lang.String,
    conditional: scala.Boolean,
    conditionalClass: java.lang.String
  ): java.lang.String = js.native
  /**
    * Build the `<ul>` and creates the event listeners
    *
    * @return A string containing html markup
    */
  def create(): java.lang.String = js.native
  /** Call the attach method */
  def init(): scala.Unit = js.native
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): scala.Boolean = js.native
}

