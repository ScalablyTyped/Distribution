package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IdentitytoolkitRelyingpartyDownloadAccountRequest extends js.Object {
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The max number of results to return in the response. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** The token for the next page. This should be taken from the previous response. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Specify which project (field value is actually project id) to operate. Only used when provided credential. */
  var targetProjectId: js.UndefOr[java.lang.String] = js.undefined
}

