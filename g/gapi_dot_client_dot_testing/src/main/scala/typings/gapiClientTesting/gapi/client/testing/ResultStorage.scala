package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStorage extends js.Object {
  /** Required. */
  var googleCloudStorage: js.UndefOr[GoogleCloudStorage] = js.native
  /**
    * The tool results execution that results are written to.
    * @OutputOnly
    */
  var toolResultsExecution: js.UndefOr[ToolResultsExecution] = js.native
  /**
    * The tool results history that contains the tool results execution that
    * results are written to.
    *
    * Optional, if not provided the service will choose an appropriate value.
    */
  var toolResultsHistory: js.UndefOr[ToolResultsHistory] = js.native
}

object ResultStorage {
  @scala.inline
  def apply(): ResultStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultStorage]
  }
  @scala.inline
  implicit class ResultStorageOps[Self <: ResultStorage] (val x: Self) extends AnyVal {
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
    def setGoogleCloudStorage(value: GoogleCloudStorage): Self = this.set("googleCloudStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleCloudStorage: Self = this.set("googleCloudStorage", js.undefined)
    @scala.inline
    def setToolResultsExecution(value: ToolResultsExecution): Self = this.set("toolResultsExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolResultsExecution: Self = this.set("toolResultsExecution", js.undefined)
    @scala.inline
    def setToolResultsHistory(value: ToolResultsHistory): Self = this.set("toolResultsHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolResultsHistory: Self = this.set("toolResultsHistory", js.undefined)
  }
  
}

