package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindFullHashesResponse extends js.Object {
  /** The full hashes that matched the requested prefixes. */
  var matches: js.UndefOr[js.Array[ThreatMatch]] = js.native
  /**
    * The minimum duration the client must wait before issuing any find hashes
    * request. If this field is not set, clients can issue a request as soon as
    * they want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.native
  /**
    * For requested entities that did not match the threat list, how long to
    * cache the response.
    */
  var negativeCacheDuration: js.UndefOr[String] = js.native
}

object FindFullHashesResponse {
  @scala.inline
  def apply(): FindFullHashesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindFullHashesResponse]
  }
  @scala.inline
  implicit class FindFullHashesResponseOps[Self <: FindFullHashesResponse] (val x: Self) extends AnyVal {
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
    def setMatchesVarargs(value: ThreatMatch*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[ThreatMatch]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    @scala.inline
    def setMinimumWaitDuration(value: String): Self = this.set("minimumWaitDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumWaitDuration: Self = this.set("minimumWaitDuration", js.undefined)
    @scala.inline
    def setNegativeCacheDuration(value: String): Self = this.set("negativeCacheDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeCacheDuration: Self = this.set("negativeCacheDuration", js.undefined)
  }
  
}

