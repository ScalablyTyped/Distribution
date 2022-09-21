package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dataUtil extends StObject {
  
  def avg(json: Any, fieldName: String): Double = js.native
  
  def distinct(jsonArray: js.Array[Any]): js.Array[Any] = js.native
  def distinct(jsonArray: js.Array[Any], fieldName: String): js.Array[Any] = js.native
  def distinct(jsonArray: js.Array[Any], fieldName: String, requiresCompleteRecord: Any): js.Array[Any] = js.native
  def distinct(jsonArray: js.Array[Any], fieldName: Unit, requiresCompleteRecord: Any): js.Array[Any] = js.native
  
  def group(jsonArray: js.Array[Any], field: String, /* internal */ level: Double): js.Array[Any] = js.native
  
  def max(jsonArray: js.Array[Any]): js.Array[Any] = js.native
  def max(jsonArray: js.Array[Any], fieldName: String): js.Array[Any] = js.native
  def max(jsonArray: js.Array[Any], fieldName: String, comparer: String): js.Array[Any] = js.native
  def max(jsonArray: js.Array[Any], fieldName: Unit, comparer: String): js.Array[Any] = js.native
  
  def mergeSort(jsonArray: js.Array[Any]): js.Array[Any] = js.native
  def mergeSort(jsonArray: js.Array[Any], fieldName: String): js.Array[Any] = js.native
  def mergeSort(jsonArray: js.Array[Any], fieldName: String, comparer: Any): js.Array[Any] = js.native
  def mergeSort(jsonArray: js.Array[Any], fieldName: Unit, comparer: Any): js.Array[Any] = js.native
  
  def min(jsonArray: js.Array[Any], fieldName: String, comparer: String): js.Array[Any] = js.native
  
  def parseTable(table: String, headerOption: headerOption, headerRowIndex: Double): Any = js.native
  
  def select(jsonArray: js.Array[Any], fieldName: String, fields: String): js.Array[Any] = js.native
  
  def sum(json: Any, fieldName: String): Double = js.native
  
  def swap(array: js.Array[Any], x: Double, y: Double): Unit = js.native
}
