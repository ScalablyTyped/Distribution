package typings.gapiDotClientDotAppstate.gapi.client.appstate

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
  def apply(items: js.Array[GetResponse] = null, kind: String = null, maximumKeyCount: Int | Double = null): ListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maximumKeyCount != null) __obj.updateDynamic("maximumKeyCount")(maximumKeyCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponse]
  }
}

