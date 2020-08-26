package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidmanagement.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationsResource extends js.Object {
  /** Gets info about an application. */
  def get(request: Accesstoken): Request[Application] = js.native
}

object ApplicationsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Application]): ApplicationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ApplicationsResource]
  }
  @scala.inline
  implicit class ApplicationsResourceOps[Self <: ApplicationsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Accesstoken => Request[Application]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

