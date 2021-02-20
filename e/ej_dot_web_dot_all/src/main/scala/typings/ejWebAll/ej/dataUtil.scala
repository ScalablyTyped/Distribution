package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dataUtil extends StObject {
  
  def avg(json: js.Any, fieldName: String): Double = js.native
  
  def distinct(jsonArray: js.Array[_]): js.Array[_] = js.native
  def distinct(jsonArray: js.Array[_], fieldName: js.UndefOr[scala.Nothing], requiresCompleteRecord: js.Any): js.Array[_] = js.native
  def distinct(jsonArray: js.Array[_], fieldName: String): js.Array[_] = js.native
  def distinct(jsonArray: js.Array[_], fieldName: String, requiresCompleteRecord: js.Any): js.Array[_] = js.native
  
  def group(jsonArray: js.Array[_], field: String, /* internal */ level: Double): js.Array[_] = js.native
  
  def max(jsonArray: js.Array[_]): js.Array[_] = js.native
  def max(jsonArray: js.Array[_], fieldName: js.UndefOr[scala.Nothing], comparer: String): js.Array[_] = js.native
  def max(jsonArray: js.Array[_], fieldName: String): js.Array[_] = js.native
  def max(jsonArray: js.Array[_], fieldName: String, comparer: String): js.Array[_] = js.native
  
  def mergeSort(jsonArray: js.Array[_]): js.Array[_] = js.native
  def mergeSort(jsonArray: js.Array[_], fieldName: js.UndefOr[scala.Nothing], comparer: js.Any): js.Array[_] = js.native
  def mergeSort(jsonArray: js.Array[_], fieldName: String): js.Array[_] = js.native
  def mergeSort(jsonArray: js.Array[_], fieldName: String, comparer: js.Any): js.Array[_] = js.native
  
  def min(jsonArray: js.Array[_], fieldName: String, comparer: String): js.Array[_] = js.native
  
  def parseTable(table: String, headerOption: headerOption, headerRowIndex: Double): js.Any = js.native
  
  def select(jsonArray: js.Array[_], fieldName: String, fields: String): js.Array[_] = js.native
  
  def sum(json: js.Any, fieldName: String): Double = js.native
  
  def swap(array: js.Array[_], x: Double, y: Double): Unit = js.native
}
