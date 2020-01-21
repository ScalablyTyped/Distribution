package typings.dexieBatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* item */ T, /* index */ scala.Double, scala.Unit]
}
