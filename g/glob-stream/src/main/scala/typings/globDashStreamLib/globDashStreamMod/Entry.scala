package typings
package globDashStreamLib.globDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var base: java.lang.String
  var cwd: java.lang.String
  var path: java.lang.String
}

object Entry {
  @scala.inline
  def apply(base: java.lang.String, cwd: java.lang.String, path: java.lang.String): Entry = {
    val __obj = js.Dynamic.literal(base = base, cwd = cwd, path = path)
  
    __obj.asInstanceOf[Entry]
  }
}

