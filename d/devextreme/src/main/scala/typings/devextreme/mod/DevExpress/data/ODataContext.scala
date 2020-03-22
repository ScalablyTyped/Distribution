package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODataContext extends js.Object {
  /** Invokes an OData operation that returns a value. */
  def get(operationName: String, params: js.Any): Promise[_] with JQueryPromise[_] = js.native
  /** Invokes an OData operation that returns nothing. */
  def invoke(operationName: String, params: js.Any, httpMethod: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def objectLink(entityAlias: String, key: String): js.Any = js.native
  /** Gets a link to an entity with a specific key. */
  def objectLink(entityAlias: String, key: js.Any): js.Any = js.native
  def objectLink(entityAlias: String, key: Double): js.Any = js.native
}

