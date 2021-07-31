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
  
  def executeQuery(): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Unit, done: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Unit, done: js.Any, fail: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Unit, done: js.Any, fail: js.Any, always: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Unit, done: js.Any, fail: Unit, always: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Unit, done: Unit, fail: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Unit, done: Unit, fail: js.Any, always: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Unit, done: Unit, fail: Unit, always: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Query): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Query, done: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.Any, always: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Query, done: js.Any, fail: Unit, always: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Query, done: Unit, fail: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Query, done: Unit, fail: js.Any, always: js.Any): JQueryPromise[js.Any] = js.native
  def executeQuery(query: Query, done: Unit, fail: Unit, always: js.Any): JQueryPromise[js.Any] = js.native
  
  def insert(data: js.Any): JQueryPromise[js.Any] = js.native
  def insert(data: js.Any, tableName: String): JQueryPromise[js.Any] = js.native
  
  def remove(keyField: String, value: js.Any): js.Any = js.native
  def remove(keyField: String, value: js.Any, tableName: String): js.Any = js.native
  
  def saveChanges(): JQueryDeferred[js.Any] = js.native
  def saveChanges(changes: Unit, key: String): JQueryDeferred[js.Any] = js.native
  def saveChanges(changes: Unit, key: String, tableName: String): JQueryDeferred[js.Any] = js.native
  def saveChanges(changes: Unit, key: Unit, tableName: String): JQueryDeferred[js.Any] = js.native
  def saveChanges(changes: Changes): JQueryDeferred[js.Any] = js.native
  def saveChanges(changes: Changes, key: String): JQueryDeferred[js.Any] = js.native
  def saveChanges(changes: Changes, key: String, tableName: String): JQueryDeferred[js.Any] = js.native
  def saveChanges(changes: Changes, key: Unit, tableName: String): JQueryDeferred[js.Any] = js.native
  
  def setDefaultQuery(query: Query): Unit = js.native
  
  def update(keyField: String, value: js.Any): js.Any = js.native
  def update(keyField: String, value: js.Any, tableName: String): js.Any = js.native
}
