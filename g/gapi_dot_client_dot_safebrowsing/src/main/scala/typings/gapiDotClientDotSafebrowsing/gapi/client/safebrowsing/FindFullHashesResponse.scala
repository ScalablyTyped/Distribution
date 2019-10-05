package typings.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindFullHashesResponse extends js.Object {
  /** The full hashes that matched the requested prefixes. */
  var matches: js.UndefOr[js.Array[ThreatMatch]] = js.undefined
  /**
    * The minimum duration the client must wait before issuing any find hashes
    * request. If this field is not set, clients can issue a request as soon as
    * they want.
    */
  var minimumWaitDuration: js.UndefOr[String] = js.undefined
  /**
    * For requested entities that did not match the threat list, how long to
    * cache the response.
    */
  var negativeCacheDuration: js.UndefOr[String] = js.undefined
}

object FindFullHashesResponse {
  @scala.inline
  def apply(
    matches: js.Array[ThreatMatch] = null,
    minimumWaitDuration: String = null,
    negativeCacheDuration: String = null
  ): FindFullHashesResponse = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (minimumWaitDuration != null) __obj.updateDynamic("minimumWaitDuration")(minimumWaitDuration)
    if (negativeCacheDuration != null) __obj.updateDynamic("negativeCacheDuration")(negativeCacheDuration)
    __obj.asInstanceOf[FindFullHashesResponse]
  }
}

