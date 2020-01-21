package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindThreatMatchesResponse extends js.Object {
  /** The threat list matches. */
  var matches: js.UndefOr[js.Array[ThreatMatch]] = js.undefined
}

object FindThreatMatchesResponse {
  @scala.inline
  def apply(matches: js.Array[ThreatMatch] = null): FindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindThreatMatchesResponse]
  }
}

