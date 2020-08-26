package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.QuotaUserSslCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslCertificatesResource extends js.Object {
  /** Deletes the specified SslCertificate resource. */
  def delete(request: typings.gapiClientCompute.anon.SslCertificate): Request[Operation] = js.native
  /** Returns the specified SslCertificate resource. Get a list of available SSL certificates by making a list() request. */
  def get(request: QuotaUserSslCertificate): Request[SslCertificate] = js.native
  /** Creates a SslCertificate resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of SslCertificate resources available to the specified project. */
  def list(request: Alt): Request[SslCertificateList] = js.native
}

object SslCertificatesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.SslCertificate => Request[Operation],
    get: QuotaUserSslCertificate => Request[SslCertificate],
    insert: AltFields => Request[Operation],
    list: Alt => Request[SslCertificateList]
  ): SslCertificatesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SslCertificatesResource]
  }
  @scala.inline
  implicit class SslCertificatesResourceOps[Self <: SslCertificatesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.SslCertificate => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUserSslCertificate => Request[SslCertificate]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[SslCertificateList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

