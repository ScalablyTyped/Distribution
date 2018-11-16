package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoFormatsResource extends js.Object {
  /** Gets one video format by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_ProfileIdPrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[VideoFormat]
  /** Lists available video formats. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[VideoFormatsListResponse]
}

