package typings.globby

import typings.globby.Anon_Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globbyMod {
  type ExpandDirectoriesOption = Boolean | js.Array[String] | Anon_Extensions
  type FilterFunction = js.Function1[/* path */ String, Boolean]
}
