package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputsSearch extends js.Object {
  /** Inject the search form at the target location */
  def attach(): Unit
  /**
    * Build the html markup for the search form
    *
    * @return The jQuery object for the search form
    */
  def create(): JQuery
  /** Call the `attach()` method */
  def init(): Unit
  /**
    * Check if the search feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): Boolean
}

object InputsSearch {
  @scala.inline
  def apply(attach: () => Unit, create: () => JQuery, init: () => Unit, initOnLoad: () => Boolean): InputsSearch = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad))
    __obj.asInstanceOf[InputsSearch]
  }
}

