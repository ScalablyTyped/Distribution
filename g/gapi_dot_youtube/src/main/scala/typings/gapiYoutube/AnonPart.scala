package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPart extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: js.UndefOr[String] = js.undefined
  /**
    * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The part names that you can include in the parameter value are snippet and status. Note that this method will override the existing values for all of the mutable properties that are contained in any parts that the parameter value specifies. For example, a playlist's privacy setting is contained in the status part. As such, if your request is updating a private playlist, and the request's part parameter value includes the status part, the playlist's privacy setting will be updated to whatever value the request body specifies. If the request body does not specify a value, the existing privacy setting will be removed and the playlist will revert to the default privacy setting.
    */
  var part: String
}

object AnonPart {
  @scala.inline
  def apply(part: String, RequestBody: String = null): AnonPart = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (RequestBody != null) __obj.updateDynamic("RequestBody")(RequestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPart]
  }
}

