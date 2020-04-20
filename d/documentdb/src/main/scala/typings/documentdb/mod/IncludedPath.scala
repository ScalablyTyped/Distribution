package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludedPath extends js.Object {
  var Indexes: js.Array[Index]
  /** Path to be indexed */
  var Path: String
}

object IncludedPath {
  @scala.inline
  def apply(Indexes: js.Array[Index], Path: String): IncludedPath = {
    val __obj = js.Dynamic.literal(Indexes = Indexes.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludedPath]
  }
}

