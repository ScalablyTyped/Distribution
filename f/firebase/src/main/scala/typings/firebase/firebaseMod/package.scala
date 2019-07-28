package typings.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object firebaseMod {
  /**
    * @hidden
    */
  type CompleteFn = js.Function0[Unit]
  /**
    * @hidden
    */
  type ErrorFn[E] = js.Function1[/* error */ E, Unit]
  /**
    * @hidden
    */
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  /**
    * @hidden
    */
  type Unsubscribe = js.Function0[Unit]
}
