package typings.googleapis.buildSrcApisCivicinfoV2Mod.civicinfo_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$MessageSet extends js.Object {
  var recordMessageSetExt: js.UndefOr[Schema$LivegraphBacktraceRecordInfo] = js.native
}

object Schema$MessageSet {
  @scala.inline
  def apply(recordMessageSetExt: Schema$LivegraphBacktraceRecordInfo = null): Schema$MessageSet = {
    val __obj = js.Dynamic.literal()
    if (recordMessageSetExt != null) __obj.updateDynamic("recordMessageSetExt")(recordMessageSetExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MessageSet]
  }
}

