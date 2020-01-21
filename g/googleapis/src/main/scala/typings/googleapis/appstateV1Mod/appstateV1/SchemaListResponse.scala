package typings.googleapis.appstateV1Mod.appstateV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template to convert a list-response for app state.
  */
@js.native
trait SchemaListResponse extends js.Object {
  /**
    * The app state data.
    */
  var items: js.UndefOr[js.Array[SchemaGetResponse]] = js.native
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

object SchemaListResponse {
  @scala.inline
  def apply(
    items: js.Array[SchemaGetResponse] = null,
    kind: String = null,
    maximumKeyCount: Int | Double = null
  ): SchemaListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maximumKeyCount != null) __obj.updateDynamic("maximumKeyCount")(maximumKeyCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListResponse]
  }
}

