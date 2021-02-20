package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataContext extends StObject {
  
  /**
    * [descr:ODataContext.get(operationName, params)]
    */
  def get(operationName: String, params: js.Any): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:ODataContext.invoke(operationName, params, httpMethod)]
    */
  def invoke(operationName: String, params: js.Any, httpMethod: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  def objectLink(entityAlias: String, key: String): js.Any = js.native
  /**
    * [descr:ODataContext.objectLink(entityAlias, key)]
    */
  def objectLink(entityAlias: String, key: js.Any): js.Any = js.native
  def objectLink(entityAlias: String, key: Double): js.Any = js.native
}
