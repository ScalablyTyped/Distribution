package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanOptions extends js.Object {
  var childOf: js.UndefOr[Transaction | Span | String] = js.native
}

object SpanOptions {
  @scala.inline
  def apply(): SpanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanOptions]
  }
  @scala.inline
  implicit class SpanOptionsOps[Self <: SpanOptions] (val x: Self) extends AnyVal {
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
    def setChildOf(value: Transaction | Span | String): Self = this.set("childOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildOf: Self = this.set("childOf", js.undefined)
  }
  
}

