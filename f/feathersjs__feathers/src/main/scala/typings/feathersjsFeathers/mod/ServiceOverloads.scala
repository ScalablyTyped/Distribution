package typings.feathersjsFeathers.mod

import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceOverloads[T] extends js.Object {
  
  def create(data: js.Array[Partial[T]]): js.Promise[js.Array[T]] = js.native
  def create(data: js.Array[Partial[T]], params: Params): js.Promise[js.Array[T]] = js.native
  def create(data: Partial[T]): js.Promise[T] = js.native
  def create(data: Partial[T], params: Params): js.Promise[T] = js.native
  
  def patch(id: NullableId, data: Pick[T, /* keyof T */ String]): js.Promise[T] = js.native
  def patch(id: NullableId, data: Pick[T, /* keyof T */ String], params: Params): js.Promise[T] = js.native
}
