package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FindThreatMatchesResponse extends js.Object {
  /**
    * The threat list matches.
    */
  var matches: js.UndefOr[js.Array[Schema$ThreatMatch]] = js.native
}

object Schema$FindThreatMatchesResponse {
  @scala.inline
  def apply(matches: js.Array[Schema$ThreatMatch] = null): Schema$FindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FindThreatMatchesResponse]
  }
}

