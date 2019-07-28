package typings

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atFeathersjsExpress {
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}
