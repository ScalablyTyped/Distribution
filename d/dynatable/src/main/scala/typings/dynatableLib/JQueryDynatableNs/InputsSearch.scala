package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputsSearch extends js.Object {
  /** Inject the search form at the target location */
  def attach(): scala.Unit
  /**
    * Build the html markup for the search form
    *
    * @return The jQuery object for the search form
    */
  def create(): dynatableLib.JQuery
  /** Call the `attach()` method */
  def init(): scala.Unit
  /**
    * Check if the search feature is enabled in `settings.features`
    *
    * @return A boolean
    */
  def initOnLoad(): scala.Boolean
}

object InputsSearch {
  @scala.inline
  def apply(
    attach: js.Function0[scala.Unit],
    create: js.Function0[dynatableLib.JQuery],
    init: js.Function0[scala.Unit],
    initOnLoad: js.Function0[scala.Boolean]
  ): InputsSearch = {
    val __obj = js.Dynamic.literal(attach = attach, create = create, init = init, initOnLoad = initOnLoad)
  
    __obj.asInstanceOf[InputsSearch]
  }
}

