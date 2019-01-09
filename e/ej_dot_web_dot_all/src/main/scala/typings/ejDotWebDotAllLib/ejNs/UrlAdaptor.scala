package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.UrlAdaptor")
@js.native
class UrlAdaptor () extends Adaptor {
  def batchRequest(dm: DataManager, changes: Changes, e: js.Any): scala.Unit = js.native
  def beforeSend(dm: DataManager, request: js.Any): scala.Unit = js.native
  def beforeSend(dm: DataManager, request: js.Any, settings: js.Any): scala.Unit = js.native
  def getFiltersFrom(data: js.Any, query: Query): Predicate = js.native
  def insert(dm: DataManager, data: js.Any, tableName: java.lang.String): ejDotWebDotAllLib.Anon_Data = js.native
  def onAggregates(e: js.Any): scala.Unit = js.native
  def onGroup(e: js.Any): scala.Unit = js.native
  def processQuery(dm: DataManager, query: Query, hierarchyFilters: js.Any): ejDotWebDotAllLib.Anon_ContentType = js.native
  def remove(dm: DataManager, keyField: java.lang.String, value: js.Any, tableName: java.lang.String): ejDotWebDotAllLib.Anon_DataType = js.native
  def update(dm: DataManager, keyField: java.lang.String, value: js.Any, tableName: java.lang.String): ejDotWebDotAllLib.Anon_DataTypeUrl = js.native
}

