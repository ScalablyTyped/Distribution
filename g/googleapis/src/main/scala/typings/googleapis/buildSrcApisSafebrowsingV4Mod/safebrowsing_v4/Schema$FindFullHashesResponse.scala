package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FindFullHashesResponse extends js.Object {
  /**
    * The full hashes that matched the requested prefixes.
    */
  var matches: js.UndefOr[js.Array[Schema$ThreatMatch]] = js.native
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

object Schema$FindFullHashesResponse {
  @scala.inline
  def apply(
    matches: js.Array[Schema$ThreatMatch] = null,
    minimumWaitDuration: String = null,
    negativeCacheDuration: String = null
  ): Schema$FindFullHashesResponse = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (minimumWaitDuration != null) __obj.updateDynamic("minimumWaitDuration")(minimumWaitDuration.asInstanceOf[js.Any])
    if (negativeCacheDuration != null) __obj.updateDynamic("negativeCacheDuration")(negativeCacheDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FindFullHashesResponse]
  }
}

