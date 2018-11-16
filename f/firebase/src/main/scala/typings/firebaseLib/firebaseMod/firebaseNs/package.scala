package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object firebaseNs {
  type CompleteFn = js.Function0[scala.Unit]
  type ErrorFn[E] = js.Function1[/* error */ E, scala.Unit]
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  type Unsubscribe = js.Function0[scala.Unit]
}
