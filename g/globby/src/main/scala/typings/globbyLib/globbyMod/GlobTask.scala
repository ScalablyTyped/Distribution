package typings
package globbyLib.globbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobTask extends js.Object {
  val options: GlobbyOptions
  val pattern: java.lang.String
}

object GlobTask {
  @scala.inline
  def apply(options: GlobbyOptions, pattern: java.lang.String): GlobTask = {
    val __obj = js.Dynamic.literal(options = options, pattern = pattern)
  
    __obj.asInstanceOf[GlobTask]
  }
}

