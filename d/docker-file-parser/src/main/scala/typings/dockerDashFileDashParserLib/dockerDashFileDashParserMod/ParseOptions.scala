package typings
package dockerDashFileDashParserLib.dockerDashFileDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var includeComments: scala.Boolean
}

object ParseOptions {
  @scala.inline
  def apply(includeComments: scala.Boolean): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeComments")(includeComments)
    __obj.asInstanceOf[ParseOptions]
  }
}

