package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Locations. This is the response from the server to GET requests
  * on the locations collection.
  */
@js.native
trait Schema$LocationsListResponse extends js.Object {
  /**
    * The list of locations.
    */
  var items: js.UndefOr[js.Array[Schema$Location]] = js.native
  /**
    * The type of resource. This is always mirror#locationsList.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$LocationsListResponse {
  @scala.inline
  def apply(items: js.Array[Schema$Location] = null, kind: String = null): Schema$LocationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LocationsListResponse]
  }
}

