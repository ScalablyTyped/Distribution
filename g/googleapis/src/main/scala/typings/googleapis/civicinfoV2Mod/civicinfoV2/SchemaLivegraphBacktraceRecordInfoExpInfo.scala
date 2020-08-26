package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLivegraphBacktraceRecordInfoExpInfo extends js.Object {
  var deletedIns: js.UndefOr[js.Array[String]] = js.native
}

object SchemaLivegraphBacktraceRecordInfoExpInfo {
  @scala.inline
  def apply(): SchemaLivegraphBacktraceRecordInfoExpInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivegraphBacktraceRecordInfoExpInfo]
  }
  @scala.inline
  implicit class SchemaLivegraphBacktraceRecordInfoExpInfoOps[Self <: SchemaLivegraphBacktraceRecordInfoExpInfo] (val x: Self) extends AnyVal {
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
    def setDeletedInsVarargs(value: String*): Self = this.set("deletedIns", js.Array(value :_*))
    @scala.inline
    def setDeletedIns(value: js.Array[String]): Self = this.set("deletedIns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedIns: Self = this.set("deletedIns", js.undefined)
  }
  
}

