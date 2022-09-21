package typings.ejWebAll.ej

import typings.ejWebAll.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataAdaptor
  extends StObject
     with UrlAdaptor {
  
  def generateDeleteRequest(arr: js.Array[Any], e: Any): String = js.native
  
  def generateInsertRequest(arr: js.Array[Any], e: Any): String = js.native
  
  def generateUpdateRequest(arr: js.Array[Any], e: Any): String = js.native
  
  def onComplexPredicate(pred: Predicate, requiresCast: Boolean): String = js.native
  
  def onCount(e: Any): String = js.native
  
  def onEachSearch(e: Any): Unit = js.native
  
  def onEachSort(e: Any): String = js.native
  
  def onEachWhere(filter: Any, requiresCast: Boolean): Any = js.native
  
  def onPredicate(pred: Predicate, query: Query, requiresCast: Boolean): String = js.native
  
  def onSearch(e: Any): String = js.native
  
  def onSelect(e: Any): String = js.native
  
  def onSortBy(e: Any): String = js.native
  
  def onWhere(filters: js.Array[String]): String = js.native
  
  @JSName("options")
  var options_ODataAdaptor: UrlAdaptorOptions = js.native
  
  def processResponse(data: Any, ds: Any, query: Query, xhr: Any, request: Any, changes: Changes): Count = js.native
}
