package typings.documentdb.documentdbMod

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
    val __obj = js.Dynamic.literal(Indexes = Indexes, Path = Path)
  
    __obj.asInstanceOf[IncludedPath]
  }
}

