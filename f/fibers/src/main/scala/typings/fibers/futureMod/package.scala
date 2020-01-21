package typings.fibers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object futureMod {
  type FutureOrFutureArray = typings.fibers.futureMod.Future[js.Any] | js.Array[typings.fibers.futureMod.Future[js.Any]]
  type FutureResolveFunction[T] = js.Function2[/* err */ typings.std.Error, /* val */ T, scala.Unit]
}
