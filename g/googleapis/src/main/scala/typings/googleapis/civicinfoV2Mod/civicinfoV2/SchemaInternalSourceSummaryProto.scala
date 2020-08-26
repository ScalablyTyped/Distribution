package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInternalSourceSummaryProto extends js.Object {
  var dataset: js.UndefOr[String] = js.native
  var provider: js.UndefOr[String] = js.native
}

object SchemaInternalSourceSummaryProto {
  @scala.inline
  def apply(): SchemaInternalSourceSummaryProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInternalSourceSummaryProto]
  }
  @scala.inline
  implicit class SchemaInternalSourceSummaryProtoOps[Self <: SchemaInternalSourceSummaryProto] (val x: Self) extends AnyVal {
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
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

