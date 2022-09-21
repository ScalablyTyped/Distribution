package typings.ejWebAll.ej

import typings.ejWebAll.JQueryParam
import typings.ejWebAll.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adaptor extends StObject {
  
  def convertToQueryString(req: Any, query: Query, dm: DataManager): JQueryParam = js.native
  
  def extend(overrides: Any): Adaptor = js.native
  
  var options: AdaptorOptions = js.native
  
  def processQuery(dm: DataManager, query: Query): Any = js.native
  
  def processResponse(data: Any, ds: Any, query: Query, xhr: JQueryXHR): Any = js.native
  def processResponse(data: Any, ds: Any, query: Query, xhr: JQueryXHR, request: Any): Any = js.native
  def processResponse(data: Any, ds: Any, query: Query, xhr: JQueryXHR, request: Any, changes: Changes): Any = js.native
  def processResponse(data: Any, ds: Any, query: Query, xhr: JQueryXHR, request: Unit, changes: Changes): Any = js.native
  
  var pvt: Any = js.native
  
  var `type`: Adaptor = js.native
}
