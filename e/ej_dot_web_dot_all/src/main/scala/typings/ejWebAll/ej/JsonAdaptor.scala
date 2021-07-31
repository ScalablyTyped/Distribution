package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonAdaptor
  extends StObject
     with Adaptor {
  
  def batchRequest(dm: DataManager, changes: Changes, e: js.Any): Changes = js.native
  
  def insert(dm: DataManager, data: js.Any): js.Any = js.native
  def insert(dm: DataManager, data: js.Any, tableName: String): js.Any = js.native
  
  def onAggregates(ds: js.Any, e: js.Any): js.Any = js.native
  
  def onGroup(ds: js.Any, e: js.Any, query: Query): js.Any = js.native
  
  def onPage(ds: js.Any, e: js.Any, query: Query): js.Any = js.native
  
  def onRange(ds: js.Any, e: js.Any): js.Any = js.native
  
  def onSearch(ds: js.Any, e: js.Any): js.Any = js.native
  
  def onSelect(ds: js.Any, e: js.Any): js.Any = js.native
  
  def onSkip(ds: js.Any, e: js.Any): js.Any = js.native
  
  def onSortBy(ds: js.Any, e: js.Any, query: Query): js.Any = js.native
  
  def onTake(ds: js.Any, e: js.Any): js.Any = js.native
  
  def onWhere(ds: js.Any, e: js.Any): js.Any = js.native
  
  def processQuery(ds: js.Any, query: Query): String = js.native
  
  def remove(dm: DataManager, keyField: String, value: js.Any, tableName: String): js.Any = js.native
  
  def update(dm: DataManager, keyField: String, value: js.Any, tableName: String): js.Any = js.native
}
