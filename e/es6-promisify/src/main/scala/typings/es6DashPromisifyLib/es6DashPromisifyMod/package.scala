package typings
package es6DashPromisifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object es6DashPromisifyMod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* arg */ js.UndefOr[T], js.Any]
  type CallbackFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type PromiseFunction = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
}
