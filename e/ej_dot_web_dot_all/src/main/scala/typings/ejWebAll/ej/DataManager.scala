package typings.ejWebAll.ej

import typings.ejWebAll.JQueryDeferred
import typings.ejWebAll.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataManager extends StObject {
  
  def executeLocal(): DataManager = js.native
  def executeLocal(query: Query): DataManager = js.native
  
  def executeQuery(): JQueryPromise[Any] = js.native
  def executeQuery(query: Unit, done: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Unit, done: Any, fail: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Unit, done: Any, fail: Any, always: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Unit, done: Any, fail: Unit, always: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Unit, done: Unit, fail: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Unit, done: Unit, fail: Any, always: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Unit, done: Unit, fail: Unit, always: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Query): JQueryPromise[Any] = js.native
  def executeQuery(query: Query, done: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Query, done: Any, fail: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Query, done: Any, fail: Any, always: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Query, done: Any, fail: Unit, always: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Query, done: Unit, fail: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Query, done: Unit, fail: Any, always: Any): JQueryPromise[Any] = js.native
  def executeQuery(query: Query, done: Unit, fail: Unit, always: Any): JQueryPromise[Any] = js.native
  
  def insert(data: Any): JQueryPromise[Any] = js.native
  def insert(data: Any, tableName: String): JQueryPromise[Any] = js.native
  
  def remove(keyField: String, value: Any): Any = js.native
  def remove(keyField: String, value: Any, tableName: String): Any = js.native
  
  def saveChanges(): JQueryDeferred[Any] = js.native
  def saveChanges(changes: Unit, key: String): JQueryDeferred[Any] = js.native
  def saveChanges(changes: Unit, key: String, tableName: String): JQueryDeferred[Any] = js.native
  def saveChanges(changes: Unit, key: Unit, tableName: String): JQueryDeferred[Any] = js.native
  def saveChanges(changes: Changes): JQueryDeferred[Any] = js.native
  def saveChanges(changes: Changes, key: String): JQueryDeferred[Any] = js.native
  def saveChanges(changes: Changes, key: String, tableName: String): JQueryDeferred[Any] = js.native
  def saveChanges(changes: Changes, key: Unit, tableName: String): JQueryDeferred[Any] = js.native
  
  def setDefaultQuery(query: Query): Unit = js.native
  
  def update(keyField: String, value: Any): Any = js.native
  def update(keyField: String, value: Any, tableName: String): Any = js.native
}
