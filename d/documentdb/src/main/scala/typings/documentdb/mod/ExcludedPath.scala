package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedPath extends js.Object {
  var Path: String
}

object ExcludedPath {
  @scala.inline
  def apply(Path: String): ExcludedPath = {
    val __obj = js.Dynamic.literal(Path = Path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExcludedPath]
  }
}

