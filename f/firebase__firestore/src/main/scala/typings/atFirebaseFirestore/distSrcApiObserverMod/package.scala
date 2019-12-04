package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcApiObserverMod {
  import typings.std.Error

  type CompleteFn = js.Function0[Unit]
  type ErrorFn = js.Function1[/* error */ Error, Unit]
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  type Unsubscribe = js.Function0[Unit]
}
