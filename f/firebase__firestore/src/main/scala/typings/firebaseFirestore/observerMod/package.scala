package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observerMod {
  type CompleteFn = js.Function0[scala.Unit]
  type ErrorFn = js.Function1[/* error */ typings.std.Error, scala.Unit]
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  type Unsubscribe = js.Function0[scala.Unit]
}
