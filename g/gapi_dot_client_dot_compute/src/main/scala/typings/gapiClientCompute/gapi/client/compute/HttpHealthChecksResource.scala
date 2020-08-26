package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsHttpHealthCheck
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpHealthChecksResource extends js.Object {
  /** Deletes the specified HttpHealthCheck resource. */
  def delete(request: typings.gapiClientCompute.anon.HttpHealthCheck): Request[Operation] = js.native
  /** Returns the specified HttpHealthCheck resource. Get a list of available HTTP health checks by making a list() request. */
  def get(request: FieldsHttpHealthCheck): Request[HttpHealthCheck] = js.native
  /** Creates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation] = js.native
  /** Retrieves the list of HttpHealthCheck resources available to the specified project. */
  def list(request: Alt): Request[HttpHealthCheckList] = js.native
  /**
    * Updates a HttpHealthCheck resource in the specified project using the data included in the request. This method supports PATCH semantics and uses the
    * JSON merge patch format and processing rules.
    */
  def patch(request: typings.gapiClientCompute.anon.HttpHealthCheck): Request[Operation] = js.native
  /** Updates a HttpHealthCheck resource in the specified project using the data included in the request. */
  def update(request: typings.gapiClientCompute.anon.HttpHealthCheck): Request[Operation] = js.native
}

object HttpHealthChecksResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.HttpHealthCheck => Request[Operation],
    get: FieldsHttpHealthCheck => Request[HttpHealthCheck],
    insert: AltFields => Request[Operation],
    list: Alt => Request[HttpHealthCheckList],
    patch: typings.gapiClientCompute.anon.HttpHealthCheck => Request[Operation],
    update: typings.gapiClientCompute.anon.HttpHealthCheck => Request[Operation]
  ): HttpHealthChecksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[HttpHealthChecksResource]
  }
  @scala.inline
  implicit class HttpHealthChecksResourceOps[Self <: HttpHealthChecksResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: typings.gapiClientCompute.anon.HttpHealthCheck => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsHttpHealthCheck => Request[HttpHealthCheck]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: AltFields => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[HttpHealthCheckList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: typings.gapiClientCompute.anon.HttpHealthCheck => Request[Operation]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: typings.gapiClientCompute.anon.HttpHealthCheck => Request[Operation]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

