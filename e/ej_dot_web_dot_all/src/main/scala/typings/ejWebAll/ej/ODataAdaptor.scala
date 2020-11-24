package typings.ejWebAll.ej

import typings.ejWebAll.anon.Count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataAdaptor extends UrlAdaptor {
  
  def generateDeleteRequest(arr: js.Array[_], e: js.Any): String = js.native
  
  def generateInsertRequest(arr: js.Array[_], e: js.Any): String = js.native
  
  def generateUpdateRequest(arr: js.Array[_], e: js.Any): String = js.native
  
  def onComplexPredicate(pred: Predicate, requiresCast: Boolean): String = js.native
  
  def onCount(e: js.Any): String = js.native
  
  def onEachSearch(e: js.Any): Unit = js.native
  
  def onEachSort(e: js.Any): String = js.native
  
  def onEachWhere(filter: js.Any, requiresCast: Boolean): js.Any = js.native
  
  def onPredicate(pred: Predicate, query: Query, requiresCast: Boolean): String = js.native
  
  def onSearch(e: js.Any): String = js.native
  
  def onSelect(e: js.Any): String = js.native
  
  def onSortBy(e: js.Any): String = js.native
  
  def onWhere(filters: js.Array[String]): String = js.native
  
  @JSName("options")
  var options_ODataAdaptor: UrlAdaptorOptions = js.native
  
  def processResponse(data: js.Any, ds: js.Any, query: Query, xhr: js.Any, request: js.Any, changes: Changes): Count = js.native
}
