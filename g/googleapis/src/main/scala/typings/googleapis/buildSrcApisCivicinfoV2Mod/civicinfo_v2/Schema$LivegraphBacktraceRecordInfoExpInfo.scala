package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$LivegraphBacktraceRecordInfoExpInfo extends js.Object {
  var deletedIns: js.UndefOr[js.Array[String]] = js.native
}

object Schema$LivegraphBacktraceRecordInfoExpInfo {
  @scala.inline
  def apply(deletedIns: js.Array[String] = null): Schema$LivegraphBacktraceRecordInfoExpInfo = {
    val __obj = js.Dynamic.literal()
    if (deletedIns != null) __obj.updateDynamic("deletedIns")(deletedIns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LivegraphBacktraceRecordInfoExpInfo]
  }
}

