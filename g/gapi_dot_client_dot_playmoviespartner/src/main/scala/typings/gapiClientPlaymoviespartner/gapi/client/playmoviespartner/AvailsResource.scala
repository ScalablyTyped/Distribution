package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPlaymoviespartner.anon.Accesstoken
import typings.gapiClientPlaymoviespartner.anon.AccountId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailsResource extends js.Object {
  /** Get an Avail given its avail group id and avail id. */
  def get(request: Accesstoken): Request[Avail] = js.native
  /**
    * List Avails owned or managed by the partner.
    *
    * See _Authentication and Authorization rules_ and
    * _List methods rules_ for more information about this method.
    */
  def list(request: AccountId): Request[ListAvailsResponse] = js.native
}

object AvailsResource {
  @scala.inline
  def apply(get: Accesstoken => Request[Avail], list: AccountId => Request[ListAvailsResponse]): AvailsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AvailsResource]
  }
  @scala.inline
  implicit class AvailsResourceOps[Self <: AvailsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Accesstoken => Request[Avail]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AccountId => Request[ListAvailsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

