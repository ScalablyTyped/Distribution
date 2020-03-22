package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonQuotaUserSslCertificate
import typings.gapiClientCompute.AnonSslCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslCertificatesResource extends js.Object {
  /** Deletes the specified SslCertificate resource. */
  def delete(request: AnonSslCertificate): Request_[Operation]
  /** Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request. */
  def get(request: AnonQuotaUserSslCertificate): Request_[SslCertificate]
  /** Creates a SslCertificate resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves the list of SslCertificate resources available to the specified project. */
  def list(request: AnonAlt): Request_[SslCertificateList]
}

object SslCertificatesResource {
  @scala.inline
  def apply(
    delete: AnonSslCertificate => Request_[Operation],
    get: AnonQuotaUserSslCertificate => Request_[SslCertificate],
    insert: AnonAltFields => Request_[Operation],
    list: AnonAlt => Request_[SslCertificateList]
  ): SslCertificatesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SslCertificatesResource]
  }
}

