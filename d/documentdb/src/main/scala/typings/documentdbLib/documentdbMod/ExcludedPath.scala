package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedPath extends js.Object {
  var Path: java.lang.String
}

object ExcludedPath {
  @scala.inline
  def apply(Path: java.lang.String): ExcludedPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[ExcludedPath]
  }
}

