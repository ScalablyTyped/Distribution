package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TagData extends js.Object {
  /** Ad associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING. */
  var adId: js.UndefOr[java.lang.String] = js.undefined
  /** Tag string to record a click. */
  var clickTag: js.UndefOr[java.lang.String] = js.undefined
  /** Creative associated with this placement tag. Applicable only when format is PLACEMENT_TAG_TRACKING. */
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
  /** TagData tag format of this tag. */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Tag string for serving an ad. */
  var impressionTag: js.UndefOr[java.lang.String] = js.undefined
}

