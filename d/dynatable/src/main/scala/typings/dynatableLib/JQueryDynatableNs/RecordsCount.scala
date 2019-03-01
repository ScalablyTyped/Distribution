package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordsCount extends js.Object {
  /** Insert the record count inside the page */
  def attach(): scala.Unit
  /**
    * Generate the html markup for the record count
    *
    * @return A jQuery object containing the generated html
    */
  def create(): dynatableLib.JQuery
  /** Create and init the records count */
  def init(): scala.Unit
  /**
    * Check if recordCount feature is enabled
    *
    * @return A boolean if recordCount feature is enabled
    */
  def initOnLoad(): scala.Boolean
}

object RecordsCount {
  @scala.inline
  def apply(
    attach: js.Function0[scala.Unit],
    create: js.Function0[dynatableLib.JQuery],
    init: js.Function0[scala.Unit],
    initOnLoad: js.Function0[scala.Boolean]
  ): RecordsCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("initOnLoad")(initOnLoad)
    __obj.asInstanceOf[RecordsCount]
  }
}

