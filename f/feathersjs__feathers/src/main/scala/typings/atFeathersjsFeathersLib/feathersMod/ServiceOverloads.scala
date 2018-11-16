package typings
package atFeathersjsFeathersLib.feathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceOverloads[T] extends js.Object {
  def create(data: js.Array[stdLib.Partial[T]]): stdLib.Promise[js.Array[T]] = js.native
  def create(data: js.Array[stdLib.Partial[T]], params: Params): stdLib.Promise[js.Array[T]] = js.native
  def create(data: stdLib.Partial[T]): stdLib.Promise[T] = js.native
  def create(data: stdLib.Partial[T], params: Params): stdLib.Promise[T] = js.native
  def patch(id: NullableId, data: stdLib.Pick[T, java.lang.String]): stdLib.Promise[T] = js.native
  def patch(id: NullableId, data: stdLib.Pick[T, java.lang.String], params: Params): stdLib.Promise[T] = js.native
}

