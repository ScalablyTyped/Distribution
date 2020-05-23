package typings.extraWatchWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cwd extends js.Object {
  var cwd: String
  var dirs: js.Array[String]
  var files: js.Array[String]
}

object Cwd {
  @scala.inline
  def apply(cwd: String, dirs: js.Array[String], files: js.Array[String]): Cwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
}

