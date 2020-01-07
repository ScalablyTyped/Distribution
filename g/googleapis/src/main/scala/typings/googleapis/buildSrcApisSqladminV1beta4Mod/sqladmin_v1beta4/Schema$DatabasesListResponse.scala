package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database list response.
  */
@js.native
trait Schema$DatabasesListResponse extends js.Object {
  /**
    * List of database resources in the instance.
    */
  var items: js.UndefOr[js.Array[Schema$Database]] = js.native
  /**
    * This is always sql#databasesList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DatabasesListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Database] = null, kind: String = null): Schema$DatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DatabasesListResponse]
  }
}

