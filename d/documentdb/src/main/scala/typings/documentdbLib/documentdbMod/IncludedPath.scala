package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludedPath extends js.Object {
  var Indexes: js.Array[Index]
  /** Path to be indexed */
  var Path: java.lang.String
}

object IncludedPath {
  @scala.inline
  def apply(Indexes: js.Array[Index], Path: java.lang.String): IncludedPath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Indexes")(Indexes)
    __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[IncludedPath]
  }
}

