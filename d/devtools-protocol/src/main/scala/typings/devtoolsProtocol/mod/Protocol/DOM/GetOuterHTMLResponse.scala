package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOuterHTMLResponse extends js.Object {
  /**
    * Outer HTML markup.
    */
  var outerHTML: String = js.native
}

object GetOuterHTMLResponse {
  @scala.inline
  def apply(outerHTML: String): GetOuterHTMLResponse = {
    val __obj = js.Dynamic.literal(outerHTML = outerHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOuterHTMLResponse]
  }
  @scala.inline
  implicit class GetOuterHTMLResponseOps[Self <: GetOuterHTMLResponse] (val x: Self) extends AnyVal {
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
    def setOuterHTML(value: String): Self = this.set("outerHTML", value.asInstanceOf[js.Any])
  }
  
}

