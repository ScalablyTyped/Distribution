package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSqladmin.anon.Instance
import typings.gapiClientSqladmin.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /** Retrieves an instance operation that has been performed on an instance. */
  def get(request: Oauthtoken): Request[Operation] = js.native
  /** Lists all instance operations that have been performed on the given Cloud SQL instance in the reverse chronological order of the start time. */
  def list(request: Instance): Request[OperationsListResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(get: Oauthtoken => Request[Operation], list: Instance => Request[OperationsListResponse]): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
  @scala.inline
  implicit class OperationsResourceOps[Self <: OperationsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Oauthtoken => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Instance => Request[OperationsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

