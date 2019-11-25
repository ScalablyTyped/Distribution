package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSettingList extends js.Object {
  /** All requested style settings. */
  var items: js.UndefOr[js.Array[StyleSetting]] = js.undefined
  /** The kind of item this is. For a style list, this is always fusiontables#styleSettingList . */
  var kind: js.UndefOr[String] = js.undefined
  /** Token used to access the next page of this result. No token is displayed if there are no more styles left. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Total number of styles for the table. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object StyleSettingList {
  @scala.inline
  def apply(
    items: js.Array[StyleSetting] = null,
    kind: String = null,
    nextPageToken: String = null,
    totalItems: Int | Double = null
  ): StyleSettingList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSettingList]
  }
}

