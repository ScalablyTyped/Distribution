package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Records extends js.Object {
  /**
    * Count records from table
    *
    * @return The length of the records Array
    */
  def count(): Double
  /**
    * Get initial recordset to populate table
    * if ajax, call ajaxUrl
    * otherwise, initialize from in-table records
    *
    * @return An Array with the records
    */
  def getFromTable(): js.Array[js.Object]
  /** Create and init the records */
  def init(): Unit
  /**
    * Check if ajax feature is enabled
    *
    * @return A boolean if ajax feature is enabled
    */
  def initOnLoad(): Boolean
  /**
    * Get the first and the last indexes based on current page and number of items per page
    *
    * @return An Array with the first index ([0]) and the last index ([1])
    */
  def pageBounds(): js.Array[Double]
  /** Update the records with the new page */
  def paginate(): Unit
  /** Reset the records */
  def resetOriginal(): Unit
  /**
    * Call the appropriated sort function
    *
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def sort(): Double
  /**
    * Merge ajax response json with cached data including (meta-data and records)
    *
    * @param data The new data
    */
  def updateFromJson(data: js.Any): Unit
}

object Records {
  @scala.inline
  def apply(
    count: () => Double,
    getFromTable: () => js.Array[js.Object],
    init: () => Unit,
    initOnLoad: () => Boolean,
    pageBounds: () => js.Array[Double],
    paginate: () => Unit,
    resetOriginal: () => Unit,
    sort: () => Double,
    updateFromJson: js.Any => Unit
  ): Records = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), getFromTable = js.Any.fromFunction0(getFromTable), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), pageBounds = js.Any.fromFunction0(pageBounds), paginate = js.Any.fromFunction0(paginate), resetOriginal = js.Any.fromFunction0(resetOriginal), sort = js.Any.fromFunction0(sort), updateFromJson = js.Any.fromFunction1(updateFromJson))
    __obj.asInstanceOf[Records]
  }
}

