package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dataUtil extends js.Object {
  def avg(json: js.Any, fieldName: java.lang.String): scala.Double = js.native
  def distinct(jsonArray: js.Array[_]): js.Array[_] = js.native
  def distinct(jsonArray: js.Array[_], fieldName: java.lang.String): js.Array[_] = js.native
  def distinct(jsonArray: js.Array[_], fieldName: java.lang.String, requiresCompleteRecord: js.Any): js.Array[_] = js.native
  def group(jsonArray: js.Array[_], field: java.lang.String, /* internal */ level: scala.Double): js.Array[_] = js.native
  def max(jsonArray: js.Array[_]): js.Array[_] = js.native
  def max(jsonArray: js.Array[_], fieldName: java.lang.String): js.Array[_] = js.native
  def max(jsonArray: js.Array[_], fieldName: java.lang.String, comparer: java.lang.String): js.Array[_] = js.native
  def mergeSort(jsonArray: js.Array[_]): js.Array[_] = js.native
  def mergeSort(jsonArray: js.Array[_], fieldName: java.lang.String): js.Array[_] = js.native
  def mergeSort(jsonArray: js.Array[_], fieldName: java.lang.String, comparer: js.Any): js.Array[_] = js.native
  def min(jsonArray: js.Array[_], fieldName: java.lang.String, comparer: java.lang.String): js.Array[_] = js.native
  def parseTable(table: java.lang.String, headerOption: headerOption, headerRowIndex: scala.Double): js.Any = js.native
  def select(jsonArray: js.Array[_], fieldName: java.lang.String, fields: java.lang.String): js.Array[_] = js.native
  def sum(json: js.Any, fieldName: java.lang.String): scala.Double = js.native
  def swap(array: js.Array[_], x: scala.Double, y: scala.Double): scala.Unit = js.native
}

