package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of adding a new protected range.
  */
@js.native
trait Schema$AddProtectedRangeResponse extends js.Object {
  /**
    * The newly added protected range.
    */
  var protectedRange: js.UndefOr[Schema$ProtectedRange] = js.native
}

object Schema$AddProtectedRangeResponse {
  @scala.inline
  def apply(protectedRange: Schema$ProtectedRange = null): Schema$AddProtectedRangeResponse = {
    val __obj = js.Dynamic.literal()
    if (protectedRange != null) __obj.updateDynamic("protectedRange")(protectedRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddProtectedRangeResponse]
  }
}

