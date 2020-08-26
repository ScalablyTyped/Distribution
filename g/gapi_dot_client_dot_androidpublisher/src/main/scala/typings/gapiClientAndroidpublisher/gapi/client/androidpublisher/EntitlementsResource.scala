package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitlementsResource extends js.Object {
  /** Lists the user's current inapp item or subscription entitlements */
  def list(request: MaxResults): Request[EntitlementsListResponse] = js.native
}

object EntitlementsResource {
  @scala.inline
  def apply(list: MaxResults => Request[EntitlementsListResponse]): EntitlementsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[EntitlementsResource]
  }
  @scala.inline
  implicit class EntitlementsResourceOps[Self <: EntitlementsResource] (val x: Self) extends AnyVal {
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
    def setList(value: MaxResults => Request[EntitlementsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

