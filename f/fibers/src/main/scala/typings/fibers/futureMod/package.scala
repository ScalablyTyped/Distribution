package typings.fibers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object futureMod {
  import typings.std.Error

  type FutureOrFutureArray = Future[js.Any] | js.Array[Future[js.Any]]
  type FutureResolveFunction[T] = js.Function2[/* err */ Error, /* val */ T, Unit]
}
