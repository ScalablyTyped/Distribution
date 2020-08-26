package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.MaxAllowedMaturityRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonalizedstreamResource extends js.Object {
  /** Returns a stream of personalized book clusters */
  def get(request: MaxAllowedMaturityRating): Request[Discoveryclusters] = js.native
}

object PersonalizedstreamResource {
  @scala.inline
  def apply(get: MaxAllowedMaturityRating => Request[Discoveryclusters]): PersonalizedstreamResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[PersonalizedstreamResource]
  }
  @scala.inline
  implicit class PersonalizedstreamResourceOps[Self <: PersonalizedstreamResource] (val x: Self) extends AnyVal {
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
    def setGet(value: MaxAllowedMaturityRating => Request[Discoveryclusters]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}

