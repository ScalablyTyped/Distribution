package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dataUtil extends StObject {
  
  def avg(json: js.Any, fieldName: String): Double = js.native
  
  def distinct(jsonArray: js.Array[js.Any]): js.Array[js.Any] = js.native
  def distinct(jsonArray: js.Array[js.Any], fieldName: String): js.Array[js.Any] = js.native
  def distinct(jsonArray: js.Array[js.Any], fieldName: String, requiresCompleteRecord: js.Any): js.Array[js.Any] = js.native
  def distinct(jsonArray: js.Array[js.Any], fieldName: Unit, requiresCompleteRecord: js.Any): js.Array[js.Any] = js.native
  
  def group(jsonArray: js.Array[js.Any], field: String, /* internal */ level: Double): js.Array[js.Any] = js.native
  
  def max(jsonArray: js.Array[js.Any]): js.Array[js.Any] = js.native
  def max(jsonArray: js.Array[js.Any], fieldName: String): js.Array[js.Any] = js.native
  def max(jsonArray: js.Array[js.Any], fieldName: String, comparer: String): js.Array[js.Any] = js.native
  def max(jsonArray: js.Array[js.Any], fieldName: Unit, comparer: String): js.Array[js.Any] = js.native
  
  def mergeSort(jsonArray: js.Array[js.Any]): js.Array[js.Any] = js.native
  def mergeSort(jsonArray: js.Array[js.Any], fieldName: String): js.Array[js.Any] = js.native
  def mergeSort(jsonArray: js.Array[js.Any], fieldName: String, comparer: js.Any): js.Array[js.Any] = js.native
  def mergeSort(jsonArray: js.Array[js.Any], fieldName: Unit, comparer: js.Any): js.Array[js.Any] = js.native
  
  def min(jsonArray: js.Array[js.Any], fieldName: String, comparer: String): js.Array[js.Any] = js.native
  
  def parseTable(table: String, headerOption: headerOption, headerRowIndex: Double): js.Any = js.native
  
  def select(jsonArray: js.Array[js.Any], fieldName: String, fields: String): js.Array[js.Any] = js.native
  
  def sum(json: js.Any, fieldName: String): Double = js.native
  
  def swap(array: js.Array[js.Any], x: Double, y: Double): Unit = js.native
}
