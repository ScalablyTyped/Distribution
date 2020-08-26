package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.OperationPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: OperationPrettyPrint): Request[Unit] = js.native
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: OperationPrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: Fields): Request[OperationList] = js.native
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: OperationPrettyPrint => Request[Unit],
    get: OperationPrettyPrint => Request[Operation],
    list: Fields => Request[OperationList]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
  @scala.inline
  implicit class ZoneOperationsResourceOps[Self <: ZoneOperationsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: OperationPrettyPrint => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: OperationPrettyPrint => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[OperationList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

