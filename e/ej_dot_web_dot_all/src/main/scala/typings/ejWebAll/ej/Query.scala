package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends StObject {
  
  def addParams(key: String, value: String): Query = js.native
  
  def execute(dataManager: DataManager, done: Any): Any = js.native
  def execute(dataManager: DataManager, done: Any, fail: String): Any = js.native
  def execute(dataManager: DataManager, done: Any, fail: String, always: String): Any = js.native
  def execute(dataManager: DataManager, done: Any, fail: Unit, always: String): Any = js.native
  
  def executeLocal(dataManager: DataManager): DataManager = js.native
  
  def expand(tables: Any): Query = js.native
  
  def foreignKey(key: String): Query = js.native
  
  def from(tableName: Any): Query = js.native
  
  def group(fieldName: String): Query = js.native
  
  def hierarchy(query: Query, selectorFn: Any): Query = js.native
  
  def key(field: String): Query = js.native
  
  def page(pageIndex: Double, pageSize: Double): Query = js.native
  
  def range(start: Double, end: Double): Query = js.native
  
  def requiresCount(): Query = js.native
  
  def search(searchKey: Any): Query = js.native
  def search(searchKey: Any, fieldNames: Any): Query = js.native
  def search(searchKey: Any, fieldNames: Any, operator: String): Query = js.native
  def search(searchKey: Any, fieldNames: Any, operator: String, ignoreCase: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Any, operator: String, ignoreCase: Boolean, ignoreAccent: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Any, operator: String, ignoreCase: Unit, ignoreAccent: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Any, operator: Unit, ignoreCase: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Any, operator: Unit, ignoreCase: Boolean, ignoreAccent: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Any, operator: Unit, ignoreCase: Unit, ignoreAccent: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Unit, operator: String): Query = js.native
  def search(searchKey: Any, fieldNames: Unit, operator: String, ignoreCase: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Unit, operator: String, ignoreCase: Boolean, ignoreAccent: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Unit, operator: String, ignoreCase: Unit, ignoreAccent: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Unit, operator: Unit, ignoreCase: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Unit, operator: Unit, ignoreCase: Boolean, ignoreAccent: Boolean): Query = js.native
  def search(searchKey: Any, fieldNames: Unit, operator: Unit, ignoreCase: Unit, ignoreAccent: Boolean): Query = js.native
  
  def select(fieldNames: Any): Query = js.native
  
  def skip(nos: Double): Query = js.native
  
  def sortBy(fieldName: String): Query = js.native
  def sortBy(fieldName: String, comparer: Unit, isFromGroup: Boolean): Query = js.native
  def sortBy(fieldName: String, comparer: SortOrder_): Query = js.native
  def sortBy(fieldName: String, comparer: SortOrder_, isFromGroup: Boolean): Query = js.native
  
  def sortByDesc(fieldName: String): Query = js.native
  
  def take(nos: Double): Query = js.native
  
  def `using`(dataManager: DataManager): Query = js.native
  
  def where(fieldName: String, operator: FilterOperators, value: Any): Query = js.native
  def where(fieldName: String, operator: FilterOperators, value: Any, ignoreCase: Boolean): Query = js.native
  def where(
    fieldName: String,
    operator: FilterOperators,
    value: Any,
    ignoreCase: Boolean,
    ignoreAccent: Boolean
  ): Query = js.native
  def where(fieldName: String, operator: FilterOperators, value: Any, ignoreCase: Unit, ignoreAccent: Boolean): Query = js.native
  def where(predicate: Predicate): Query = js.native
}
