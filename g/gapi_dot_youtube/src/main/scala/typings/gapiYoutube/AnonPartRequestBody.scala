package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartRequestBody extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: String
  /**
    * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The part names that you can include in the parameter value are snippet and contentDetails.
    */
  var part: String
}

object AnonPartRequestBody {
  @scala.inline
  def apply(RequestBody: String, part: String): AnonPartRequestBody = {
    val __obj = js.Dynamic.literal(RequestBody = RequestBody.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPartRequestBody]
  }
}

