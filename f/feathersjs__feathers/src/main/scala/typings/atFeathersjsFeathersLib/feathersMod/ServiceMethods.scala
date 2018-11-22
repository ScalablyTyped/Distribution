package typings
package atFeathersjsFeathersLib.feathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceMethods[T] extends js.Object {
  def create(data: js.Array[stdLib.Partial[T]]): stdLib.Promise[T | js.Array[T]] = js.native
  def create(data: js.Array[stdLib.Partial[T]], params: Params): stdLib.Promise[T | js.Array[T]] = js.native
  def create(data: stdLib.Partial[T]): stdLib.Promise[T | js.Array[T]] = js.native
  def create(data: stdLib.Partial[T], params: Params): stdLib.Promise[T | js.Array[T]] = js.native
  def find(): stdLib.Promise[T | js.Array[T] | Paginated[T]] = js.native
  def find(params: Params): stdLib.Promise[T | js.Array[T] | Paginated[T]] = js.native
  def get(id: Id): stdLib.Promise[T] = js.native
  def get(id: Id, params: Params): stdLib.Promise[T] = js.native
  def patch(id: NullableId, data: stdLib.Partial[T]): stdLib.Promise[T] = js.native
  def patch(id: NullableId, data: stdLib.Partial[T], params: Params): stdLib.Promise[T] = js.native
  def remove(id: NullableId): stdLib.Promise[T] = js.native
  def remove(id: NullableId, params: Params): stdLib.Promise[T] = js.native
  def update(id: NullableId, data: T): stdLib.Promise[T] = js.native
  def update(id: NullableId, data: T, params: Params): stdLib.Promise[T] = js.native
}

