package typings.atFirebaseUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcSubscribeMod {
  import typings.std.Error
  import typings.std.Partial

  type CompleteFn = js.Function0[Unit]
  type ErrorFn = js.Function1[/* error */ Error, Unit]
  type Executor[T] = js.Function1[/* observer */ Observer[T], Unit]
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  type PartialObserver[T] = Partial[Observer[T]]
  type Unsubscribe = js.Function0[Unit]
}
