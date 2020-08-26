package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComputedStyleForNodeResponse extends js.Object {
  /**
    * Computed style for the specified DOM node.
    */
  var computedStyle: js.Array[CSSComputedStyleProperty] = js.native
}

object GetComputedStyleForNodeResponse {
  @scala.inline
  def apply(computedStyle: js.Array[CSSComputedStyleProperty]): GetComputedStyleForNodeResponse = {
    val __obj = js.Dynamic.literal(computedStyle = computedStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComputedStyleForNodeResponse]
  }
  @scala.inline
  implicit class GetComputedStyleForNodeResponseOps[Self <: GetComputedStyleForNodeResponse] (val x: Self) extends AnyVal {
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
    def setComputedStyleVarargs(value: CSSComputedStyleProperty*): Self = this.set("computedStyle", js.Array(value :_*))
    @scala.inline
    def setComputedStyle(value: js.Array[CSSComputedStyleProperty]): Self = this.set("computedStyle", value.asInstanceOf[js.Any])
  }
  
}

