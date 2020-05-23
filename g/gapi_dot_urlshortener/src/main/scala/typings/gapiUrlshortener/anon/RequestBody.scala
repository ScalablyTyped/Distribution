package typings.gapiUrlshortener.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestBody extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: js.UndefOr[String] = js.undefined
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.undefined
}

object RequestBody {
  @scala.inline
  def apply(RequestBody: String = null, fields: String = null): RequestBody = {
    val __obj = js.Dynamic.literal()
    if (RequestBody != null) __obj.updateDynamic("RequestBody")(RequestBody.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBody]
  }
}

