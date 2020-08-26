package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/interchange.html#custom-named-queries
@js.native
trait InterchangeOptions extends js.Object {
  var directives: js.UndefOr[js.Object] = js.native
  var load_attr: js.UndefOr[String] = js.native
  var named_queries: js.UndefOr[js.Object] = js.native
}

object InterchangeOptions {
  @scala.inline
  def apply(): InterchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterchangeOptions]
  }
  @scala.inline
  implicit class InterchangeOptionsOps[Self <: InterchangeOptions] (val x: Self) extends AnyVal {
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
    def setDirectives(value: js.Object): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setLoad_attr(value: String): Self = this.set("load_attr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad_attr: Self = this.set("load_attr", js.undefined)
    @scala.inline
    def setNamed_queries(value: js.Object): Self = this.set("named_queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamed_queries: Self = this.set("named_queries", js.undefined)
  }
  
}

