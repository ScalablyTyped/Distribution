package typings.googleapis.binaryauthorizationV1beta1Mod.binaryauthorizationV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for BinauthzManagementService.ListAttestors.
  */
@js.native
trait SchemaListAttestorsResponse extends js.Object {
  /**
    * The list of attestors.
    */
  var attestors: js.UndefOr[js.Array[SchemaAttestor]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListAttestorsRequest.page_token field in the subsequent call to the
    * `ListAttestors` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAttestorsResponse {
  @scala.inline
  def apply(attestors: js.Array[SchemaAttestor] = null, nextPageToken: String = null): SchemaListAttestorsResponse = {
    val __obj = js.Dynamic.literal()
    if (attestors != null) __obj.updateDynamic("attestors")(attestors.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAttestorsResponse]
  }
}

