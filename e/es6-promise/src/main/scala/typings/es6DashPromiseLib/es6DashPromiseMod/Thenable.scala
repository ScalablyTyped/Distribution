package typings
package es6DashPromiseLib.es6DashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thenable[R] extends js.Object {
  def `then`[U](): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ R, U | Thenable[U]]): Thenable[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ R, Thenable[U] | U],
    onRejected: js.Function1[/* error */ js.Any, Thenable[U] | U | scala.Unit]
  ): Thenable[U] = js.native
}

