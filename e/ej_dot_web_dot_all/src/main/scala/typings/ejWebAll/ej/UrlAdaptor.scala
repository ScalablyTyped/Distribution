package typings.ejWebAll.ej

import typings.ejWebAll.anon.Data
import typings.ejWebAll.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlAdaptor
  extends StObject
     with Adaptor {
  
  def batchRequest(dm: DataManager, changes: Changes, e: Any): Unit = js.native
  
  def beforeSend(dm: DataManager, request: Any): Unit = js.native
  def beforeSend(dm: DataManager, request: Any, settings: Any): Unit = js.native
  
  def getFiltersFrom(data: Any, query: Query): Predicate = js.native
  
  def insert(dm: DataManager, data: Any, tableName: String): Data = js.native
  
  def onAggregates(e: Any): Unit = js.native
  
  def onGroup(e: Any): Unit = js.native
  
  def processQuery(dm: DataManager, query: Query, hierarchyFilters: Any): typings.ejWebAll.anon.ContentType = js.native
  
  def remove(dm: DataManager, keyField: String, value: Any, tableName: String): typings.ejWebAll.anon.Type = js.native
  
  def update(dm: DataManager, keyField: String, value: Any, tableName: String): Url = js.native
}
