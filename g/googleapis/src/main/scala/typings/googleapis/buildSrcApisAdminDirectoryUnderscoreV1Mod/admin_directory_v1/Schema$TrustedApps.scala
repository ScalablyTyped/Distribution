package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Trusted Apps response object of a user in Directory API.
  */
@js.native
trait Schema$TrustedApps extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Identifies the resource as trusted apps response.
    */
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Trusted Apps list.
    */
  var trustedApps: js.UndefOr[js.Array[Schema$TrustedAppId]] = js.native
}

object Schema$TrustedApps {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null,
    trustedApps: js.Array[Schema$TrustedAppId] = null
  ): Schema$TrustedApps = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (trustedApps != null) __obj.updateDynamic("trustedApps")(trustedApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TrustedApps]
  }
}

