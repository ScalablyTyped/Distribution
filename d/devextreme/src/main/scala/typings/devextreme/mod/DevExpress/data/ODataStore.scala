package typings.devextreme.mod.DevExpress.data

import typings.devextreme.AnonExpand
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ODataStore extends Store {
  def byKey(key: String, extraOptions: AnonExpand): Promise[_] with JQueryPromise[_] = js.native
  /** Gets an entity with a specific key. */
  def byKey(key: js.Any, extraOptions: AnonExpand): Promise[_] with JQueryPromise[_] = js.native
  def byKey(key: Double, extraOptions: AnonExpand): Promise[_] with JQueryPromise[_] = js.native
  /** Creates a Query for the OData endpoint. */
  def createQuery(loadOptions: js.Any): js.Any = js.native
}

