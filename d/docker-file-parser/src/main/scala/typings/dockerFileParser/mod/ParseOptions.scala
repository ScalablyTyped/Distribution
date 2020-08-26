package typings.dockerFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var includeComments: Boolean = js.native
}

object ParseOptions {
  @scala.inline
  def apply(includeComments: Boolean): ParseOptions = {
    val __obj = js.Dynamic.literal(includeComments = includeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIncludeComments(value: Boolean): Self = this.set("includeComments", value.asInstanceOf[js.Any])
  }
  
}

