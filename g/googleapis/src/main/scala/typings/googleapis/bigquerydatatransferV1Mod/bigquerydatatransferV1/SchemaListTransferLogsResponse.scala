package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The returned list transfer run messages.
  */
@js.native
trait SchemaListTransferLogsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `GetTransferRunLogRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. The stored pipeline transfer messages.
    */
  var transferMessages: js.UndefOr[js.Array[SchemaTransferMessage]] = js.native
}

object SchemaListTransferLogsResponse {
  @scala.inline
  def apply(): SchemaListTransferLogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferLogsResponse]
  }
  @scala.inline
  implicit class SchemaListTransferLogsResponseOps[Self <: SchemaListTransferLogsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTransferMessagesVarargs(value: SchemaTransferMessage*): Self = this.set("transferMessages", js.Array(value :_*))
    @scala.inline
    def setTransferMessages(value: js.Array[SchemaTransferMessage]): Self = this.set("transferMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferMessages: Self = this.set("transferMessages", js.undefined)
  }
  
}

