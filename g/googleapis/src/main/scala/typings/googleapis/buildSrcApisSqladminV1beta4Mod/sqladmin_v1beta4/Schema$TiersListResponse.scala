package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tiers list response.
  */
@js.native
trait Schema$TiersListResponse extends js.Object {
  /**
    * List of tiers.
    */
  var items: js.UndefOr[js.Array[Schema$Tier]] = js.native
  /**
    * This is always sql#tiersList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$TiersListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Tier] = null, kind: String = null): Schema$TiersListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TiersListResponse]
  }
}

