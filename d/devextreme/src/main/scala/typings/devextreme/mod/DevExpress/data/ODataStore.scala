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
  /** @name ODataStore.byKey(key, extraOptions) */
  def byKey(key: js.Any, extraOptions: AnonExpand): Promise[_] with JQueryPromise[_] = js.native
  def byKey(key: Double, extraOptions: AnonExpand): Promise[_] with JQueryPromise[_] = js.native
  /** @name ODataStore.createQuery(loadOptions) */
  def createQuery(loadOptions: js.Any): js.Any = js.native
}

