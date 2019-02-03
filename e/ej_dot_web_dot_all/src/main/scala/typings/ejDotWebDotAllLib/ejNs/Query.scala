package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Query")
@js.native
class Query () extends js.Object {
  def addParams(key: java.lang.String, value: java.lang.String): Query = js.native
  def execute(dataManager: DataManager, done: js.Any): js.Any = js.native
  def execute(dataManager: DataManager, done: js.Any, fail: java.lang.String): js.Any = js.native
  def execute(dataManager: DataManager, done: js.Any, fail: java.lang.String, always: java.lang.String): js.Any = js.native
  def executeLocal(dataManager: DataManager): DataManager = js.native
  def expand(tables: js.Any): Query = js.native
  def foreignKey(key: java.lang.String): Query = js.native
  def from(tableName: js.Any): Query = js.native
  def group(fieldName: java.lang.String): Query = js.native
  def hierarchy(query: Query, selectorFn: js.Any): Query = js.native
  def key(field: java.lang.String): Query = js.native
  def page(pageIndex: scala.Double, pageSize: scala.Double): Query = js.native
  def range(start: scala.Double, end: scala.Double): Query = js.native
  def requiresCount(): Query = js.native
  def search(searchKey: js.Any): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.Any): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.Any, operator: java.lang.String): Query = js.native
  def search(searchKey: js.Any, fieldNames: js.Any, operator: java.lang.String, ignoreCase: scala.Boolean): Query = js.native
  def search(
    searchKey: js.Any,
    fieldNames: js.Any,
    operator: java.lang.String,
    ignoreCase: scala.Boolean,
    ignoreAccent: scala.Boolean
  ): Query = js.native
  def select(fieldNames: js.Any): Query = js.native
  def skip(nos: scala.Double): Query = js.native
  def sortBy(fieldName: java.lang.String): Query = js.native
  def sortBy(fieldName: java.lang.String, comparer: SortOrder): Query = js.native
  def sortBy(fieldName: java.lang.String, comparer: SortOrder, isFromGroup: scala.Boolean): Query = js.native
  def sortByDesc(fieldName: java.lang.String): Query = js.native
  def take(nos: scala.Double): Query = js.native
  def using(dataManager: DataManager): Query = js.native
  def where(fieldName: java.lang.String, operator: FilterOperators, value: js.Any): Query = js.native
  def where(fieldName: java.lang.String, operator: FilterOperators, value: js.Any, ignoreCase: scala.Boolean): Query = js.native
  def where(
    fieldName: java.lang.String,
    operator: FilterOperators,
    value: js.Any,
    ignoreCase: scala.Boolean,
    ignoreAccent: scala.Boolean
  ): Query = js.native
  def where(predicate: Predicate): Query = js.native
}

/* static members */
@JSGlobal("ej.Query")
@js.native
object Query extends js.Object {
  var fn: ejDotWebDotAllLib.ejNs.Query = js.native
  def extend(prototype: js.Any): ejDotWebDotAllLib.ejNs.Query = js.native
}

