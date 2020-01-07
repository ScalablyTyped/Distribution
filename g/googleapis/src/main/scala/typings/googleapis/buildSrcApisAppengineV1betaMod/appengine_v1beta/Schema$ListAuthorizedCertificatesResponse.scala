package typings.googleapis.buildSrcApisAppengineV1betaMod.appengine_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for AuthorizedCertificates.ListAuthorizedCertificates.
  */
@js.native
trait Schema$ListAuthorizedCertificatesResponse extends js.Object {
  /**
    * The SSL certificates the user is authorized to administer.
    */
  var certificates: js.UndefOr[js.Array[Schema$AuthorizedCertificate]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAuthorizedCertificatesResponse {
  @scala.inline
  def apply(certificates: js.Array[Schema$AuthorizedCertificate] = null, nextPageToken: String = null): Schema$ListAuthorizedCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (certificates != null) __obj.updateDynamic("certificates")(certificates.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAuthorizedCertificatesResponse]
  }
}

