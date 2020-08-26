package typings.gapiClientLogging.gapi.client.logging

import typings.gapiClient.gapi.client.Request
import typings.gapiClientLogging.anon.Accesstoken
import typings.gapiClientLogging.anon.Alt
import typings.gapiClientLogging.anon.Bearertoken
import typings.gapiClientLogging.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusionsResource extends js.Object {
  /**
    * Creates a new exclusion in a specified parent resource. Only log entries belonging to that resource can be excluded. You can have up to 10 exclusions
    * in a resource.
    */
  def create(request: Accesstoken): Request[LogExclusion] = js.native
  /** Deletes an exclusion. */
  def delete(request: Alt): Request[js.Object] = js.native
  /** Gets the description of an exclusion. */
  def get(request: Alt): Request[LogExclusion] = js.native
  /** Lists all the exclusions in a parent resource. */
  def list(request: Bearertoken): Request[ListExclusionsResponse] = js.native
  /** Changes one or more properties of an existing exclusion. */
  def patch(request: Callback): Request[LogExclusion] = js.native
}

object ExclusionsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[LogExclusion],
    delete: Alt => Request[js.Object],
    get: Alt => Request[LogExclusion],
    list: Bearertoken => Request[ListExclusionsResponse],
    patch: Callback => Request[LogExclusion]
  ): ExclusionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[ExclusionsResource]
  }
  @scala.inline
  implicit class ExclusionsResourceOps[Self <: ExclusionsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Accesstoken => Request[LogExclusion]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Alt => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[LogExclusion]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[ListExclusionsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Callback => Request[LogExclusion]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

