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
  def apply(deletedIns: js.Array[String] = null): SchemaLivegraphBacktraceRecordInfoExpInfo = {
    val __obj = js.Dynamic.literal()
    if (deletedIns != null) __obj.updateDynamic("deletedIns")(deletedIns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLivegraphBacktraceRecordInfoExpInfo]
  }
}

