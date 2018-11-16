package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AudienceSegmentGroup extends js.Object {
  /** Audience segments assigned to this group. The number of segments must be between 2 and 100. */
  var audienceSegments: js.UndefOr[js.Array[AudienceSegment]] = js.undefined
  /** ID of this audience segment group. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this audience segment group. This is a required field and must be less than 65 characters long. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

