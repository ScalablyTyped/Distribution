package typings.entriaRelayExperimental.queryResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only`
  - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network`
  - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network`
  - typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only`
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `store-and-network`: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-and-network` = this.cast("store-and-network")
  @scala.inline
  def `store-only`: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-only` = this.cast("store-only")
  @scala.inline
  def `store-or-network`: typings.entriaRelayExperimental.entriaRelayExperimentalStrings.`store-or-network` = this.cast("store-or-network")
}

