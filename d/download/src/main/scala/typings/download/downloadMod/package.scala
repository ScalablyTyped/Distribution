package typings.download

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downloadMod {
  type RetryFunction = js.Function2[/* retry */ Double, /* error */ js.Any, Double]
}
