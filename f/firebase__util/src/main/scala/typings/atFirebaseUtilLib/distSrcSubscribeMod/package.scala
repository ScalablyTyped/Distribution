package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcSubscribeMod {
  type CompleteFn = js.Function0[scala.Unit]
  type ErrorFn = js.Function1[/* error */ stdLib.Error, scala.Unit]
  type Executor[T] = js.Function1[/* observer */ Observer[T], scala.Unit]
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  type PartialObserver[T] = stdLib.Partial[Observer[T]]
  type Unsubscribe = js.Function0[scala.Unit]
}
