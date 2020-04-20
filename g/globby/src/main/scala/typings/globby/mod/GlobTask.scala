package typings.globby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobTask extends js.Object {
  val options: GlobbyOptions
  val pattern: String
}

object GlobTask {
  @scala.inline
  def apply(options: GlobbyOptions, pattern: String): GlobTask = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobTask]
  }
}

