package typings.gapiClientAppstate.gapi.client.appstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResponse extends js.Object {
  /** The app state data. */
  var items: js.UndefOr[js.Array[GetResponse]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#listResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** The maximum number of keys allowed for this user. */
  var maximumKeyCount: js.UndefOr[Double] = js.undefined
}

object ListResponse {
  @scala.inline
  def apply(
    items: js.Array[GetResponse] = null,
    kind: String = null,
    maximumKeyCount: js.UndefOr[Double] = js.undefined
  ): ListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumKeyCount)) __obj.updateDynamic("maximumKeyCount")(maximumKeyCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
}

