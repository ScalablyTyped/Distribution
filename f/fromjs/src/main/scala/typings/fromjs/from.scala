package typings.fromjs

import typings.fromjs.FromJS.IQueryable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("from")
@js.native
object from extends js.Object {
  def apply[T](results: js.Any): IQueryable[_] = js.native
  def apply[T](results: js.Array[T]): IQueryable[T] = js.native
}

