package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSafebrowsing.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodedFullHashesResource extends js.Object {
  def get(request: Accesstoken): Request[FindFullHashesResponse] = js.native
}

object EncodedFullHashesResource {
  @scala.inline
  def apply(get: Accesstoken => Request[FindFullHashesResponse]): EncodedFullHashesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[EncodedFullHashesResource]
  }
  @scala.inline
  implicit class EncodedFullHashesResourceOps[Self <: EncodedFullHashesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Accesstoken => Request[FindFullHashesResponse]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

