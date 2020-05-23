package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODataContext extends js.Object {
  /** @name ODataContext.get(operationName, params) */
  def get(operationName: String, params: js.Any): Promise[_] with JQueryPromise[_] = js.native
  /** @name ODataContext.invoke(operationName, params, httpMethod) */
  def invoke(operationName: String, params: js.Any, httpMethod: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def objectLink(entityAlias: String, key: String): js.Any = js.native
  /** @name ODataContext.objectLink(entityAlias, key) */
  def objectLink(entityAlias: String, key: js.Any): js.Any = js.native
  def objectLink(entityAlias: String, key: Double): js.Any = js.native
}

