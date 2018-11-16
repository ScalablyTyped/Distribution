package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChannelAuditDetails extends js.Object {
  /** Whether or not the channel respects the community guidelines. */
  var communityGuidelinesGoodStanding: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not the channel has any unresolved claims. */
  var contentIdClaimsGoodStanding: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not the channel has any copyright strikes. */
  var copyrightStrikesGoodStanding: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Describes the general state of the channel. This field will always show if there are any issues whatsoever with the channel. Currently this field
               * represents the result of the logical and operation over the community guidelines good standing, the copyright strikes good standing and the content ID
               * claims good standing, but this may change in the future.
               */
  var overallGoodStanding: js.UndefOr[scala.Boolean] = js.undefined
}

