package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flags list response.
  */
@js.native
trait Schema$FlagsListResponse extends js.Object {
  /**
    * List of flags.
    */
  var items: js.UndefOr[js.Array[Schema$Flag]] = js.native
  /**
    * This is always sql#flagsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$FlagsListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Flag] = null, kind: String = null): Schema$FlagsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FlagsListResponse]
  }
}

