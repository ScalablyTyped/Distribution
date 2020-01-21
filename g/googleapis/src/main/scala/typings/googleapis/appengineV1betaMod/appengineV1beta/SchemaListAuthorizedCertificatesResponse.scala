package typings.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for AuthorizedCertificates.ListAuthorizedCertificates.
  */
@js.native
trait SchemaListAuthorizedCertificatesResponse extends js.Object {
  /**
    * The SSL certificates the user is authorized to administer.
    */
  var certificates: js.UndefOr[js.Array[SchemaAuthorizedCertificate]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAuthorizedCertificatesResponse {
  @scala.inline
  def apply(certificates: js.Array[SchemaAuthorizedCertificate] = null, nextPageToken: String = null): SchemaListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAuthorizedCertificatesResponse]
  }
}

