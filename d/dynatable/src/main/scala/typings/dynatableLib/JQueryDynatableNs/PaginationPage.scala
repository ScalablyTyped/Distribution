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
  def apply(
    init: js.Function0[scala.Unit],
    initOnLoad: js.Function0[scala.Boolean],
    set: js.Function1[scala.Double, scala.Unit]
  ): PaginationPage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initOnLoad")(initOnLoad)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[PaginationPage]
  }
}

