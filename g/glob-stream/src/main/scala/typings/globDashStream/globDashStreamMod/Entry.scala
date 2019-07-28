package typings.globDashStream.globDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var base: String
  var cwd: String
  var path: String
}

object Entry {
  @scala.inline
  def apply(base: String, cwd: String, path: String): Entry = {
    val __obj = js.Dynamic.literal(base = base, cwd = cwd, path = path)
  
    __obj.asInstanceOf[Entry]
  }
}

