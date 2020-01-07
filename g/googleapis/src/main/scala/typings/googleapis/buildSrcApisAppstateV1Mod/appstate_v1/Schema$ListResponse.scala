package typings.googleapis.buildSrcApisAppstateV1Mod.appstate_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template to convert a list-response for app state.
  */
@js.native
trait Schema$ListResponse extends js.Object {
  /**
    * The app state data.
    */
  var items: js.UndefOr[js.Array[Schema$GetResponse]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string appstate#listResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum number of keys allowed for this user.
    */
  var maximumKeyCount: js.UndefOr[Double] = js.native
}

object Schema$ListResponse {
  @scala.inline
  def apply(
    items: js.Array[Schema$GetResponse] = null,
    kind: String = null,
    maximumKeyCount: Int | Double = null
  ): Schema$ListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maximumKeyCount != null) __obj.updateDynamic("maximumKeyCount")(maximumKeyCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListResponse]
  }
}

