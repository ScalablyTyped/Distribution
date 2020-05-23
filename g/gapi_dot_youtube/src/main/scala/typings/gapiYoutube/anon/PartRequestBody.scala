package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartRequestBody extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: String
  /**
    * The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response will include. The part names that you can include in the parameter value are snippet and contentDetails.
    */
  var part: String
}

object PartRequestBody {
  @scala.inline
  def apply(RequestBody: String, part: String): PartRequestBody = {
    val __obj = js.Dynamic.literal(RequestBody = RequestBody.asInstanceOf[js.Any], part = part.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartRequestBody]
  }
}

