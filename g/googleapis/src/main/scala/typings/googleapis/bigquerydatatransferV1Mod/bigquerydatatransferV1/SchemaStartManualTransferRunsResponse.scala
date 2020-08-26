package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to start manual transfer runs.
  */
@js.native
trait SchemaStartManualTransferRunsResponse extends js.Object {
  /**
    * The transfer runs that were created.
    */
  var runs: js.UndefOr[js.Array[SchemaTransferRun]] = js.native
}

object SchemaStartManualTransferRunsResponse {
  @scala.inline
  def apply(): SchemaStartManualTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStartManualTransferRunsResponse]
  }
  @scala.inline
  implicit class SchemaStartManualTransferRunsResponseOps[Self <: SchemaStartManualTransferRunsResponse] (val x: Self) extends AnyVal {
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
    def setRunsVarargs(value: SchemaTransferRun*): Self = this.set("runs", js.Array(value :_*))
    @scala.inline
    def setRuns(value: js.Array[SchemaTransferRun]): Self = this.set("runs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuns: Self = this.set("runs", js.undefined)
  }
  
}

