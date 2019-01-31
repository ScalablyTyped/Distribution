package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginatedMethodOverload[T, R, U, V] extends js.Object {
  def apply(data: T): PromiseLike[js.Array[R]] = js.native
  def apply(data: T, callback: APICallback[R]): scala.Unit = js.native
  def apply(data: T, options: CallOptions): PromiseLike[js.Array[R]] = js.native
  def apply(data: T, options: CallOptionsWithPagination): PromiseLike[js.Tuple3[R, V, U]] = js.native
  def apply(data: T, options: CallOptionsWithPagination, callback: APIPaginatedCallback[R, V, U]): scala.Unit = js.native
  def apply(data: T, options: CallOptions, callback: APICallback[R]): scala.Unit = js.native
}

