package typings
package atFeathersjsFeathersLib.atFeathersjsFeathersMod.feathersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// todo: figure out what to do: These methods don't actually need to be implemented, so they can be undefined at runtime. Yet making them optional gets cumbersome in strict mode.
@js.native
trait ServiceMethods[T] extends js.Object {
  def create(data: js.Array[stdLib.Partial[T]]): js.Promise[T | js.Array[T]] = js.native
  def create(data: js.Array[stdLib.Partial[T]], params: Params): js.Promise[T | js.Array[T]] = js.native
  def create(data: stdLib.Partial[T]): js.Promise[T | js.Array[T]] = js.native
  def create(data: stdLib.Partial[T], params: Params): js.Promise[T | js.Array[T]] = js.native
  def find(): js.Promise[T | js.Array[T] | Paginated[T]] = js.native
  def find(params: Params): js.Promise[T | js.Array[T] | Paginated[T]] = js.native
  def get(id: Id): js.Promise[T] = js.native
  def get(id: Id, params: Params): js.Promise[T] = js.native
  def patch(id: NullableId, data: stdLib.Partial[T]): js.Promise[T] = js.native
  def patch(id: NullableId, data: stdLib.Partial[T], params: Params): js.Promise[T] = js.native
  def remove(id: NullableId): js.Promise[T] = js.native
  def remove(id: NullableId, params: Params): js.Promise[T] = js.native
  def update(id: NullableId, data: T): js.Promise[T] = js.native
  def update(id: NullableId, data: T, params: Params): js.Promise[T] = js.native
}

