package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod.DevExpress.core.utils.DxPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  /**
    * Calculates a custom summary for all data items.
    */
  def aggregate(seed: Any, step: js.Function, finalize: js.Function): DxPromise[Any] = js.native
  /**
    * Calculates a custom summary for all data items.
    */
  def aggregate(step: js.Function): DxPromise[Any] = js.native
  
  /**
    * Calculates the average of all values. Applies only to numeric arrays.
    */
  def avg(): DxPromise[Double] = js.native
  /**
    * Calculates the average of all values found using a getter.
    */
  def avg(getter: Any): DxPromise[Double] = js.native
  
  /**
    * Calculates the number of data items.
    */
  def count(): DxPromise[Double] = js.native
  
  /**
    * Executes the Query. This is an asynchronous alternative to the toArray() method.
    */
  def enumerate(): DxPromise[Any] = js.native
  
  /**
    * Filters data items using a filter expression.
    */
  def filter(criteria: js.Array[Any]): Query = js.native
  /**
    * Filters data items using a custom function.
    */
  def filter(predicate: js.Function): Query = js.native
  
  /**
    * Groups data items by the specified getter.
    */
  def groupBy(getter: Any): Query = js.native
  
  /**
    * Calculates the maximum value. Applies only to numeric arrays.
    */
  def max(): DxPromise[Double | js.Date] = js.native
  /**
    * Calculates the maximum of all values found using a getter.
    */
  def max(getter: Any): DxPromise[Double | js.Date] = js.native
  
  /**
    * Calculates the minimum value. Applies only to numeric arrays.
    */
  def min(): DxPromise[Double | js.Date] = js.native
  /**
    * Calculates the minumum of all values found using a getter.
    */
  def min(getter: Any): DxPromise[Double | js.Date] = js.native
  
  /**
    * Selects individual fields from data objects.
    */
  def select(getters: Any*): Query = js.native
  
  /**
    * Gets a specified number of data items starting from a given index.
    */
  def slice(skip: Double): Query = js.native
  def slice(skip: Double, take: Double): Query = js.native
  
  /**
    * Sorts data items by the specified getter in ascending order.
    */
  def sortBy(getter: Any): Query = js.native
  /**
    * Sorts data items by the specified getter in the specified sorting order.
    */
  def sortBy(getter: Any, desc: Boolean): Query = js.native
  
  /**
    * Calculates the sum of all values.
    */
  def sum(): DxPromise[Double] = js.native
  /**
    * Calculates the sum of all values found using a getter.
    */
  def sum(getter: Any): DxPromise[Double] = js.native
  
  /**
    * Sorts data items by one more getter in ascending order.
    */
  def thenBy(getter: Any): Query = js.native
  /**
    * Sorts data items by one more getter in the specified sorting order.
    */
  def thenBy(getter: Any, desc: Boolean): Query = js.native
  
  /**
    * Gets data items associated with the Query. This is a synchronous alternative to the enumerate() method.
    */
  def toArray(): js.Array[Any] = js.native
}
