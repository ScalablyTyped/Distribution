package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.OauthtokenOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionOperationsResource extends js.Object {
  /** Deletes the specified region-specific Operations resource. */
  def delete(request: OauthtokenOperation): Request[Unit] = js.native
  /** Retrieves the specified region-specific Operations resource. */
  def get(request: OauthtokenOperation): Request[Operation] = js.native
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(request: Filter): Request[OperationList] = js.native
}

object RegionOperationsResource {
  @scala.inline
  def apply(
    delete: OauthtokenOperation => Request[Unit],
    get: OauthtokenOperation => Request[Operation],
    list: Filter => Request[OperationList]
  ): RegionOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionOperationsResource]
  }
  @scala.inline
  implicit class RegionOperationsResourceOps[Self <: RegionOperationsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: OauthtokenOperation => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: OauthtokenOperation => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[OperationList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

