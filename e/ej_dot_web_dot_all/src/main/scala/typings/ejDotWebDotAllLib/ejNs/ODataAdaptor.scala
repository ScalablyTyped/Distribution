package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.ODataAdaptor")
@js.native
class ODataAdaptor () extends UrlAdaptor {
  @JSName("options")
  var options_ODataAdaptor: UrlAdaptorOptions = js.native
  def generateDeleteRequest(arr: js.Array[_], e: js.Any): java.lang.String = js.native
  def generateInsertRequest(arr: js.Array[_], e: js.Any): java.lang.String = js.native
  def generateUpdateRequest(arr: js.Array[_], e: js.Any): java.lang.String = js.native
  def onComplexPredicate(pred: Predicate, requiresCast: scala.Boolean): java.lang.String = js.native
  def onCount(e: js.Any): java.lang.String = js.native
  def onEachSearch(e: js.Any): scala.Unit = js.native
  def onEachSort(e: js.Any): java.lang.String = js.native
  def onEachWhere(filter: js.Any, requiresCast: scala.Boolean): js.Any = js.native
  def onPredicate(pred: Predicate, query: Query, requiresCast: scala.Boolean): java.lang.String = js.native
  def onSearch(e: js.Any): java.lang.String = js.native
  def onSelect(e: js.Any): java.lang.String = js.native
  def onSortBy(e: js.Any): java.lang.String = js.native
  def onWhere(filters: js.Array[java.lang.String]): java.lang.String = js.native
  def processResponse(data: js.Any, ds: js.Any, query: Query, xhr: js.Any, request: js.Any, changes: Changes): ejDotWebDotAllLib.Anon_Count = js.native
}

