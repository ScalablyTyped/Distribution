package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  /**
    * The results of applying each DocumentTransform.FieldTransform, in the
    * same order.
    */
  var transformResults: js.UndefOr[js.Array[Value]] = js.undefined
  /**
    * The last update time of the document after applying the write. Not set
    * after a `delete`.
    *
    * If the write did not actually change the document, this will be the
    * previous update_time.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}

object WriteResult {
  @scala.inline
  def apply(transformResults: js.Array[Value] = null, updateTime: String = null): WriteResult = {
    val __obj = js.Dynamic.literal()
    if (transformResults != null) __obj.updateDynamic("transformResults")(transformResults.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
}

