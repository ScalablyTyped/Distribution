package typings.dotnetDepsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Restore extends js.Object {
  var restore: ProjectName
  var version: String
}

object Restore {
  @scala.inline
  def apply(restore: ProjectName, version: String): Restore = {
    val __obj = js.Dynamic.literal(restore = restore.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Restore]
  }
}

