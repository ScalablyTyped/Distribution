package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashPackager {
  import typings.std.Exclude
  import typings.std.Pick

  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
