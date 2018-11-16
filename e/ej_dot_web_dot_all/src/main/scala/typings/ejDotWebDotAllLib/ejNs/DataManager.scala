package typings
package ejDotWebDotAllLib.ejNs

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
  def executeQuery(): ejDotWebDotAllLib.JQueryPromise[_] = js.native
  def executeQuery(query: Query): ejDotWebDotAllLib.JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any): ejDotWebDotAllLib.JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.Any): ejDotWebDotAllLib.JQueryPromise[_] = js.native
  def executeQuery(query: Query, done: js.Any, fail: js.Any, always: js.Any): ejDotWebDotAllLib.JQueryPromise[_] = js.native
  def insert(data: js.Any): ejDotWebDotAllLib.JQueryPromise[_] = js.native
  def insert(data: js.Any, tableName: java.lang.String): ejDotWebDotAllLib.JQueryPromise[_] = js.native
  def remove(keyField: java.lang.String, value: js.Any): js.Any = js.native
  def remove(keyField: java.lang.String, value: js.Any, tableName: java.lang.String): js.Any = js.native
  def saveChanges(): ejDotWebDotAllLib.JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes): ejDotWebDotAllLib.JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes, key: java.lang.String): ejDotWebDotAllLib.JQueryDeferred[_] = js.native
  def saveChanges(changes: Changes, key: java.lang.String, tableName: java.lang.String): ejDotWebDotAllLib.JQueryDeferred[_] = js.native
  def setDefaultQuery(query: Query): scala.Unit = js.native
  def update(keyField: java.lang.String, value: js.Any): js.Any = js.native
  def update(keyField: java.lang.String, value: js.Any, tableName: java.lang.String): js.Any = js.native
}

