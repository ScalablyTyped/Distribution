package typings.fsMerger.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait At extends js.Object {
  var at: Double
  var relativePath: String
}

object At {
  @scala.inline
  def apply(at: Double, relativePath: String): At = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[At]
  }
}

