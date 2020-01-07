package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of styles for a given table.
  */
@js.native
trait Schema$StyleSettingList extends js.Object {
  /**
    * All requested style settings.
    */
  var items: js.UndefOr[js.Array[Schema$StyleSetting]] = js.native
  /**
    * Type name: in this case, a list of style settings.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result. No token is displayed
    * if there are no more pages left.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Total number of styles for the table.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$StyleSettingList {
  @scala.inline
  def apply(
    items: js.Array[Schema$StyleSetting] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): Schema$StyleSettingList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StyleSettingList]
  }
}

