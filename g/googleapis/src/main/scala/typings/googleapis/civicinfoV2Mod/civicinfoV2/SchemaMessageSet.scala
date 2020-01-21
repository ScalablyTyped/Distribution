package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMessageSet extends js.Object {
  var recordMessageSetExt: js.UndefOr[SchemaLivegraphBacktraceRecordInfo] = js.native
}

object SchemaMessageSet {
  @scala.inline
  def apply(recordMessageSetExt: SchemaLivegraphBacktraceRecordInfo = null): SchemaMessageSet = {
    val __obj = js.Dynamic.literal()
    if (recordMessageSetExt != null) __obj.updateDynamic("recordMessageSetExt")(recordMessageSetExt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMessageSet]
  }
}

