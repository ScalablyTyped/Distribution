package typings.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * @hidden
    */
  type CompleteFn = js.Function0[scala.Unit]
  /**
    * @hidden
    */
  type ErrorFn[E] = js.Function1[/* error */ E, scala.Unit]
  /**
    * @hidden
    */
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  /**
    * @hidden
    */
  type Unsubscribe = js.Function0[scala.Unit]
}
