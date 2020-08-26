package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSafebrowsing.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreatMatchesResource extends js.Object {
  /** Finds the threat entries that match the Safe Browsing lists. */
  def find(request: Alt): Request[FindThreatMatchesResponse] = js.native
}

object ThreatMatchesResource {
  @scala.inline
  def apply(find: Alt => Request[FindThreatMatchesResponse]): ThreatMatchesResource = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find))
    __obj.asInstanceOf[ThreatMatchesResource]
  }
  @scala.inline
  implicit class ThreatMatchesResourceOps[Self <: ThreatMatchesResource] (val x: Self) extends AnyVal {
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
    def setFind(value: Alt => Request[FindThreatMatchesResponse]): Self = this.set("find", js.Any.fromFunction1(value))
  }
  
}

