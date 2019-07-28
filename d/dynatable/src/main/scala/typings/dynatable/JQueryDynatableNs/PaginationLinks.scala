package typings.dynatable.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationLinks extends js.Object {
  /** Insert the pagination links inside the page */
  def attach(): Unit = js.native
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
  def buildLink(page: Double, label: String, linkClass: String, conditional: Boolean, conditionalClass: String): String = js.native
  def buildLink(page: Double, label: Double, linkClass: String, conditional: Boolean, conditionalClass: String): String = js.native
  /**
    * Build the `<ul>` and creates the event listeners
    *
    * @return A string containing html markup
    */
  def create(): String = js.native
  /** Call the attach method */
  def init(): Unit = js.native
  /**
    * Check if the paginate feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean = js.native
}

