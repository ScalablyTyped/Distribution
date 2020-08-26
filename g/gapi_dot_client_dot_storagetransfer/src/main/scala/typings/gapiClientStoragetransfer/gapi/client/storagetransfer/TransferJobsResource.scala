package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStoragetransfer.anon.Alt
import typings.gapiClientStoragetransfer.anon.Bearertoken
import typings.gapiClientStoragetransfer.anon.Callback
import typings.gapiClientStoragetransfer.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferJobsResource extends js.Object {
  /** Creates a transfer job that runs periodically. */
  def create(request: Alt): Request[TransferJob] = js.native
  /** Gets a transfer job. */
  def get(request: Bearertoken): Request[TransferJob] = js.native
  /** Lists transfer jobs. */
  def list(request: Callback): Request[ListTransferJobsResponse] = js.native
  /**
    * Updates a transfer job. Updating a job's transfer spec does not affect
    * transfer operations that are running already. Updating the scheduling
    * of a job is not allowed.
    */
  def patch(request: Fields): Request[TransferJob] = js.native
}

object TransferJobsResource {
  @scala.inline
  def apply(
    create: Alt => Request[TransferJob],
    get: Bearertoken => Request[TransferJob],
    list: Callback => Request[ListTransferJobsResponse],
    patch: Fields => Request[TransferJob]
  ): TransferJobsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[TransferJobsResource]
  }
  @scala.inline
  implicit class TransferJobsResourceOps[Self <: TransferJobsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[TransferJob]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Bearertoken => Request[TransferJob]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListTransferJobsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Fields => Request[TransferJob]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

