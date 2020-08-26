package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for information about a voter.
  */
@js.native
trait SchemaVoterInfoRequest extends js.Object {
  var contextParams: js.UndefOr[SchemaContextParams] = js.native
  var voterInfoSegmentResult: js.UndefOr[SchemaVoterInfoSegmentResult] = js.native
}

object SchemaVoterInfoRequest {
  @scala.inline
  def apply(): SchemaVoterInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoterInfoRequest]
  }
  @scala.inline
  implicit class SchemaVoterInfoRequestOps[Self <: SchemaVoterInfoRequest] (val x: Self) extends AnyVal {
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
    def setContextParams(value: SchemaContextParams): Self = this.set("contextParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextParams: Self = this.set("contextParams", js.undefined)
    @scala.inline
    def setVoterInfoSegmentResult(value: SchemaVoterInfoSegmentResult): Self = this.set("voterInfoSegmentResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoterInfoSegmentResult: Self = this.set("voterInfoSegmentResult", js.undefined)
  }
  
}

