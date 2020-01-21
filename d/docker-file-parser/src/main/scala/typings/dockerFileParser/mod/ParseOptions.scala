package typings.dockerFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var includeComments: Boolean
}

object ParseOptions {
  @scala.inline
  def apply(includeComments: Boolean): ParseOptions = {
    val __obj = js.Dynamic.literal(includeComments = includeComments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseOptions]
  }
}

