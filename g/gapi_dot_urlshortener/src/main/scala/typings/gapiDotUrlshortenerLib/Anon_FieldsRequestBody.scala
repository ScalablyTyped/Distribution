package typings
package gapiDotUrlshortenerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsRequestBody extends js.Object {
  /**
    * HTTP Request Body
    */
  var RequestBody: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FieldsRequestBody {
  @scala.inline
  def apply(RequestBody: java.lang.String = null, fields: java.lang.String = null): Anon_FieldsRequestBody = {
    val __obj = js.Dynamic.literal()
    if (RequestBody != null) __obj.updateDynamic("RequestBody")(RequestBody)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[Anon_FieldsRequestBody]
  }
}

