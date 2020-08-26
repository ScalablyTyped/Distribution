package typings.devtoolsProtocol.mod.Protocol.Browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHistogramsRequest extends js.Object {
  /**
    * If true, retrieve delta since last call.
    */
  var delta: js.UndefOr[Boolean] = js.native
  /**
    * Requested substring in name. Only histograms which have query as a
    * substring in their name are extracted. An empty or absent query returns
    * all histograms.
    */
  var query: js.UndefOr[String] = js.native
}

object GetHistogramsRequest {
  @scala.inline
  def apply(): GetHistogramsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHistogramsRequest]
  }
  @scala.inline
  implicit class GetHistogramsRequestOps[Self <: GetHistogramsRequest] (val x: Self) extends AnyVal {
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
    def setDelta(value: Boolean): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelta: Self = this.set("delta", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

