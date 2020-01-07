package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A named range.
  */
@js.native
trait Schema$NamedRange extends js.Object {
  /**
    * The name of the named range.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the named range.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  /**
    * The range this represents.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
}

object Schema$NamedRange {
  @scala.inline
  def apply(name: String = null, namedRangeId: String = null, range: Schema$GridRange = null): Schema$NamedRange = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NamedRange]
  }
}

