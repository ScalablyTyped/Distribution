package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAccountResource extends js.Object {
  /** Get the email address of this project's Google Cloud Storage service account. */
  def get(request: ProjectId): Request[ServiceAccount] = js.native
}

object ServiceAccountResource {
  @scala.inline
  def apply(get: ProjectId => Request[ServiceAccount]): ServiceAccountResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ServiceAccountResource]
  }
  @scala.inline
  implicit class ServiceAccountResourceOps[Self <: ServiceAccountResource] (val x: Self) extends AnyVal {
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
    def setGet(value: ProjectId => Request[ServiceAccount]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

