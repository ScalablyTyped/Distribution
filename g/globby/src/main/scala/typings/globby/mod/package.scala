package typings.globby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExpandDirectoriesOption = scala.Boolean | js.Array[java.lang.String] | typings.globby.AnonExtensions
  type FilterFunction = js.Function1[/* path */ java.lang.String, scala.Boolean]
}
