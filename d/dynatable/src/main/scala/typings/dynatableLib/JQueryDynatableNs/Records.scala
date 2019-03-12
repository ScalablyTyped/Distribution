package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Records extends js.Object {
  /**
    * Count records from table
    *
    * @return The length of the records Array
    */
  def count(): scala.Double
  /**
    * Get initial recordset to populate table
    * if ajax, call ajaxUrl
    * otherwise, initialize from in-table records
    *
    * @return An Array with the records
    */
  def getFromTable(): js.Array[js.Object]
  /** Create and init the records */
  def init(): scala.Unit
  /**
    * Check if ajax feature is enabled
    *
    * @return A boolean if ajax feature is enabled
    */
  def initOnLoad(): scala.Boolean
  /**
    * Get the first and the last indexes based on current page and number of items per page
    *
    * @return An Array with the first index ([0]) and the last index ([1])
    */
  def pageBounds(): js.Array[scala.Double]
  /** Update the records with the new page */
  def paginate(): scala.Unit
  /** Reset the records */
  def resetOriginal(): scala.Unit
  /**
    * Call the appropriated sort function
    *
    * @return The number (-1, 0 or +1) representing the comparison
    */
  def sort(): scala.Double
  /**
    * Merge ajax response json with cached data including (meta-data and records)
    *
    * @param data The new data
    */
  def updateFromJson(data: js.Any): scala.Unit
}

object Records {
  @scala.inline
  def apply(
    count: () => scala.Double,
    getFromTable: () => js.Array[js.Object],
    init: () => scala.Unit,
    initOnLoad: () => scala.Boolean,
    pageBounds: () => js.Array[scala.Double],
    paginate: () => scala.Unit,
    resetOriginal: () => scala.Unit,
    sort: () => scala.Double,
    updateFromJson: js.Any => scala.Unit
  ): Records = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), getFromTable = js.Any.fromFunction0(getFromTable), init = js.Any.fromFunction0(init), initOnLoad = js.Any.fromFunction0(initOnLoad), pageBounds = js.Any.fromFunction0(pageBounds), paginate = js.Any.fromFunction0(paginate), resetOriginal = js.Any.fromFunction0(resetOriginal), sort = js.Any.fromFunction0(sort), updateFromJson = js.Any.fromFunction1(updateFromJson))
  
    __obj.asInstanceOf[Records]
  }
}

