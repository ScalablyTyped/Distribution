package typings.elementReady

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StoppablePromise[T] = js.Promise[T] with typings.elementReady.AnonStop
}
