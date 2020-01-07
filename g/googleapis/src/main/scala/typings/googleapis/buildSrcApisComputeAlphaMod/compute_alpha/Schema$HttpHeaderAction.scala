package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request and response header transformations that take effect before the
  * request is passed along to the selected backendService.
  */
@js.native
trait Schema$HttpHeaderAction extends js.Object {
  /**
    * Headers to add to a matching request prior to forwarding the request to
    * the backendService.
    */
  var requestHeadersToAdd: js.UndefOr[js.Array[Schema$HttpHeaderOption]] = js.native
  /**
    * A list of header names for headers that need to be removed from the
    * request prior to forwarding the request to the backendService.
    */
  var requestHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
  /**
    * Headers to add the response prior to sending the response back to the
    * client.
    */
  var responseHeadersToAdd: js.UndefOr[js.Array[Schema$HttpHeaderOption]] = js.native
  /**
    * A list of header names for headers that need to be removed from the
    * response prior to sending the response back to the client.
    */
  var responseHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
}

object Schema$HttpHeaderAction {
  @scala.inline
  def apply(
    requestHeadersToAdd: js.Array[Schema$HttpHeaderOption] = null,
    requestHeadersToRemove: js.Array[String] = null,
    responseHeadersToAdd: js.Array[Schema$HttpHeaderOption] = null,
    responseHeadersToRemove: js.Array[String] = null
  ): Schema$HttpHeaderAction = {
    val __obj = js.Dynamic.literal()
    if (requestHeadersToAdd != null) __obj.updateDynamic("requestHeadersToAdd")(requestHeadersToAdd.asInstanceOf[js.Any])
    if (requestHeadersToRemove != null) __obj.updateDynamic("requestHeadersToRemove")(requestHeadersToRemove.asInstanceOf[js.Any])
    if (responseHeadersToAdd != null) __obj.updateDynamic("responseHeadersToAdd")(responseHeadersToAdd.asInstanceOf[js.Any])
    if (responseHeadersToRemove != null) __obj.updateDynamic("responseHeadersToRemove")(responseHeadersToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpHeaderAction]
  }
}

