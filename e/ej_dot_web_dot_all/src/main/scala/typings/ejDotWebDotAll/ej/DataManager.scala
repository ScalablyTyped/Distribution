package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQueryDeferred
import typings.ejDotWebDotAll.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.DataManager")
@js.native
class DataManager () extends js.Object {
  def this(dataSource: js.Any) = this()
  def this(dataSource: js.Any, query: Query) = this()
  def this(dataSource: js.Any, query: Query, adaptor: js.Any) = this()
  def executeLocal(): DataManager = js.native
  def executeLocal(query: Query): DataManager = js.native
  def executeQuery(): JQueryPromise[_] = js.native
  def executeQuery(query: Query): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.Any, always: js.Any): JQueryPromise[_] = js.native
  def insert(data: js.Any): JQueryPromise[_] = js.native
  def insert(data: js.Any, tableName: String): JQueryPromise[_] = js.native
  def remove(keyField: String, value: js.Any): js.Any = js.native
  def remove(keyField: String, value: js.Any, tableName: String): js.Any = js.native
  def saveChanges(): JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes): JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes, key: String): JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes, key: String, tableName: String): JQueryDeferred[_] = js.native
  def setDefaultQuery(query: Query): Unit = js.native
  def update(keyField: String, value: js.Any): js.Any = js.native
  def update(keyField: String, value: js.Any, tableName: String): js.Any = js.native
}

