package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SslCertificatesResource extends js.Object {
  /** Deletes the specified SslCertificate resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_SslCertificateProject): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_SslCertificate): gapiDotClientLib.gapiNs.clientNs.Request[SslCertificate]
  /** Creates a SslCertificate resource in the specified project using the data included in the request. */
  def insert(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of SslCertificate resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[SslCertificateList]
}

