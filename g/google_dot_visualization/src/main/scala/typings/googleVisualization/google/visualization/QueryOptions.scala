package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions extends js.Object {
  var makeRequestParams: js.UndefOr[js.Object] = js.native
  var sendMethod: js.UndefOr[String] = js.native
}

object QueryOptions {
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
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
    def setMakeRequestParams(value: js.Object): Self = this.set("makeRequestParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMakeRequestParams: Self = this.set("makeRequestParams", js.undefined)
    @scala.inline
    def setSendMethod(value: String): Self = this.set("sendMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendMethod: Self = this.set("sendMethod", js.undefined)
  }
  
}

