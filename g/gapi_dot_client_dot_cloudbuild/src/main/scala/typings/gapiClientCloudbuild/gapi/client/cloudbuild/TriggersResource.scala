package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudbuild.anon.Callback
import typings.gapiClientCloudbuild.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggersResource extends js.Object {
  /**
    * Creates a new BuildTrigger.
    *
    * This API is experimental.
    */
  def create(request: Callback): Request[BuildTrigger] = js.native
  /**
    * Deletes an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def delete(request: Key): Request[js.Object] = js.native
  /**
    * Gets information about a BuildTrigger.
    *
    * This API is experimental.
    */
  def get(request: Key): Request[BuildTrigger] = js.native
  /**
    * Lists existing BuildTrigger.
    *
    * This API is experimental.
    */
  def list(request: Callback): Request[ListBuildTriggersResponse] = js.native
  /**
    * Updates an BuildTrigger by its project ID and trigger ID.
    *
    * This API is experimental.
    */
  def patch(request: Key): Request[BuildTrigger] = js.native
}

object TriggersResource {
  @scala.inline
  def apply(
    create: Callback => Request[BuildTrigger],
    delete: Key => Request[js.Object],
    get: Key => Request[BuildTrigger],
    list: Callback => Request[ListBuildTriggersResponse],
    patch: Key => Request[BuildTrigger]
  ): TriggersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[TriggersResource]
  }
  @scala.inline
  implicit class TriggersResourceOps[Self <: TriggersResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Callback => Request[BuildTrigger]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Key => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[BuildTrigger]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListBuildTriggersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Key => Request[BuildTrigger]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

