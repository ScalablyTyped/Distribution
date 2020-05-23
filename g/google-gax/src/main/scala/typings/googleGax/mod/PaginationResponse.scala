package typings.googleGax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationResponse[RequestObject, ResponseObject, ResponseType] extends js.Object {
  var nextPageRequest: js.UndefOr[RequestObject] = js.undefined
  var rawResponse: js.UndefOr[ResponseObject] = js.undefined
  var values: js.UndefOr[js.Array[ResponseType]] = js.undefined
}

object PaginationResponse {
  @scala.inline
  def apply[RequestObject, ResponseObject, ResponseType](
    nextPageRequest: RequestObject = null,
    rawResponse: ResponseObject = null,
    values: js.Array[ResponseType] = null
  ): PaginationResponse[RequestObject, ResponseObject, ResponseType] = {
    val __obj = js.Dynamic.literal()
    if (nextPageRequest != null) __obj.updateDynamic("nextPageRequest")(nextPageRequest.asInstanceOf[js.Any])
    if (rawResponse != null) __obj.updateDynamic("rawResponse")(rawResponse.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationResponse[RequestObject, ResponseObject, ResponseType]]
  }
}

