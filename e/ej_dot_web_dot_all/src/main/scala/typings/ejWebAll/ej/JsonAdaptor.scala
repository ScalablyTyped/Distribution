package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonAdaptor
  extends StObject
     with Adaptor {
  
  def batchRequest(dm: DataManager, changes: Changes, e: Any): Changes = js.native
  
  def insert(dm: DataManager, data: Any): Any = js.native
  def insert(dm: DataManager, data: Any, tableName: String): Any = js.native
  
  def onAggregates(ds: Any, e: Any): Any = js.native
  
  def onGroup(ds: Any, e: Any, query: Query): Any = js.native
  
  def onPage(ds: Any, e: Any, query: Query): Any = js.native
  
  def onRange(ds: Any, e: Any): Any = js.native
  
  def onSearch(ds: Any, e: Any): Any = js.native
  
  def onSelect(ds: Any, e: Any): Any = js.native
  
  def onSkip(ds: Any, e: Any): Any = js.native
  
  def onSortBy(ds: Any, e: Any, query: Query): Any = js.native
  
  def onTake(ds: Any, e: Any): Any = js.native
  
  def onWhere(ds: Any, e: Any): Any = js.native
  
  def processQuery(ds: Any, query: Query): String = js.native
  
  def remove(dm: DataManager, keyField: String, value: Any, tableName: String): Any = js.native
  
  def update(dm: DataManager, keyField: String, value: Any, tableName: String): Any = js.native
}
