package typings.gapiDotUrlshortener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsRequestBody extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: js.UndefOr[String] = js.undefined
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.undefined
}

object Anon_FieldsRequestBody {
  @scala.inline
  def apply(RequestBody: String = null, fields: String = null): Anon_FieldsRequestBody = {
    val __obj = js.Dynamic.literal()
    if (RequestBody != null) __obj.updateDynamic("RequestBody")(RequestBody.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FieldsRequestBody]
  }
}

