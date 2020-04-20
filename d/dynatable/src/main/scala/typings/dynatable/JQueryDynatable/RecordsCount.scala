package typings.dynatable.JQueryDynatable

import typings.dynatable.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordsCount extends js.Object {
  /** Insert the record count inside the page */
  def attach(): Unit
  /**
    * Generate the html markup for the record count
    *
    * @return A jQuery object containing the generated html
    */
  def create(): JQuery
  /** Create and init the records count */
  def init(): Unit
  /**
    * Check if recordCount feature is enabled
    *
    * @return A boolean if recordCount feature is enabled
    */
  def initOnLoad(): Boolean
}

object RecordsCount {
  @scala.inline
  def apply(attach: () => Unit, create: () => JQuery, init: () => Unit, initOnLoad: () => Boolean): RecordsCount = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), create = js.Any.fromFunction0(create), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad))
    __obj.asInstanceOf[RecordsCount]
  }
}

