package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSafebrowsing.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullHashesResource extends js.Object {
  /** Finds the full hashes that match the requested hash prefixes. */
  def find(request: Alt): Request[FindFullHashesResponse] = js.native
}

object FullHashesResource {
  @scala.inline
  def apply(find: Alt => Request[FindFullHashesResponse]): FullHashesResource = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[FullHashesResource]
  }
  @scala.inline
  implicit class FullHashesResourceOps[Self <: FullHashesResource] (val x: Self) extends AnyVal {
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
    def setFind(value: Alt => Request[FindFullHashesResponse]): Self = this.set("find", js.Any.fromFunction1(value))
  }
  
}

