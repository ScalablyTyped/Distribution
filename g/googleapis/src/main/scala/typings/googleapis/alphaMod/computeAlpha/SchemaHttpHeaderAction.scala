package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request and response header transformations that take effect before the
  * request is passed along to the selected backendService.
  */
@js.native
trait SchemaHttpHeaderAction extends js.Object {
  /**
    * Headers to add to a matching request prior to forwarding the request to
    * the backendService.
    */
  var requestHeadersToAdd: js.UndefOr[js.Array[SchemaHttpHeaderOption]] = js.native
  /**
    * A list of header names for headers that need to be removed from the
    * request prior to forwarding the request to the backendService.
    */
  var requestHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
  /**
    * Headers to add the response prior to sending the response back to the
    * client.
    */
  var responseHeadersToAdd: js.UndefOr[js.Array[SchemaHttpHeaderOption]] = js.native
  /**
    * A list of header names for headers that need to be removed from the
    * response prior to sending the response back to the client.
    */
  var responseHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
}

object SchemaHttpHeaderAction {
  @scala.inline
  def apply(
    requestHeadersToAdd: js.Array[SchemaHttpHeaderOption] = null,
    requestHeadersToRemove: js.Array[String] = null,
    responseHeadersToAdd: js.Array[SchemaHttpHeaderOption] = null,
    responseHeadersToRemove: js.Array[String] = null
  ): SchemaHttpHeaderAction = {
    val __obj = js.Dynamic.literal()
    if (requestHeadersToAdd != null) __obj.updateDynamic("requestHeadersToAdd")(requestHeadersToAdd.asInstanceOf[js.Any])
    if (requestHeadersToRemove != null) __obj.updateDynamic("requestHeadersToRemove")(requestHeadersToRemove.asInstanceOf[js.Any])
    if (responseHeadersToAdd != null) __obj.updateDynamic("responseHeadersToAdd")(responseHeadersToAdd.asInstanceOf[js.Any])
    if (responseHeadersToRemove != null) __obj.updateDynamic("responseHeadersToRemove")(responseHeadersToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHttpHeaderAction]
  }
}

