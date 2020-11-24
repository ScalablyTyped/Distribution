package typings.ejWebAll.ej

import typings.ejWebAll.JQueryDeferred
import typings.ejWebAll.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataManager extends js.Object {
  
  def executeLocal(): DataManager = js.native
  def executeLocal(query: Query): DataManager = js.native
  
  def executeQuery(): JQueryPromise[_] = js.native
  def executeQuery(
    query: js.UndefOr[scala.Nothing],
    done: js.UndefOr[scala.Nothing],
    fail: js.UndefOr[scala.Nothing],
    always: js.Any
  ): JQueryPromise[_] = js.native
  def executeQuery(query: js.UndefOr[scala.Nothing], done: js.UndefOr[scala.Nothing], fail: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: js.UndefOr[scala.Nothing], done: js.UndefOr[scala.Nothing], fail: js.Any, always: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: js.UndefOr[scala.Nothing], done: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: js.UndefOr[scala.Nothing], done: js.Any, fail: js.UndefOr[scala.Nothing], always: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: js.UndefOr[scala.Nothing], done: js.Any, fail: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: js.UndefOr[scala.Nothing], done: js.Any, fail: js.Any, always: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.UndefOr[scala.Nothing], fail: js.UndefOr[scala.Nothing], always: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.UndefOr[scala.Nothing], fail: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.UndefOr[scala.Nothing], fail: js.Any, always: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.UndefOr[scala.Nothing], always: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.Any): JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.Any, always: js.Any): JQueryPromise[_] = js.native
  
  def insert(data: js.Any): JQueryPromise[_] = js.native
  def insert(data: js.Any, tableName: String): JQueryPromise[_] = js.native
  
  def remove(keyField: String, value: js.Any): js.Any = js.native
  def remove(keyField: String, value: js.Any, tableName: String): js.Any = js.native
  
  def saveChanges(): JQueryDeferred[_] = js.native
  def saveChanges(changes: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], tableName: String): JQueryDeferred[_] = js.native
  def saveChanges(changes: js.UndefOr[scala.Nothing], key: String): JQueryDeferred[_] = js.native
  def saveChanges(changes: js.UndefOr[scala.Nothing], key: String, tableName: String): JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes): JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes, key: js.UndefOr[scala.Nothing], tableName: String): JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes, key: String): JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes, key: String, tableName: String): JQueryDeferred[_] = js.native
  
  def setDefaultQuery(query: Query): Unit = js.native
  
  def update(keyField: String, value: js.Any): js.Any = js.native
  def update(keyField: String, value: js.Any, tableName: String): js.Any = js.native
}
