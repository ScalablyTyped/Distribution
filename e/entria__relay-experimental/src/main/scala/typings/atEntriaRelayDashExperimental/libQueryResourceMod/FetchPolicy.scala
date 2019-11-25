package typings.atEntriaRelayDashExperimental.libQueryResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atEntriaRelayDashExperimental.atEntriaRelayDashExperimentalStrings.`store-only`
  - typings.atEntriaRelayDashExperimental.atEntriaRelayDashExperimentalStrings.`store-or-network`
  - typings.atEntriaRelayDashExperimental.atEntriaRelayDashExperimentalStrings.`store-and-network`
  - typings.atEntriaRelayDashExperimental.atEntriaRelayDashExperimentalStrings.`network-only`
*/
trait FetchPolicy extends js.Object

object FetchPolicy {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `network-only`: typings.atEntriaRelayDashExperimental.atEntriaRelayDashExperimentalStrings.`network-only` = this.cast("network-only")
  @scala.inline
  def `store-and-network`: typings.atEntriaRelayDashExperimental.atEntriaRelayDashExperimentalStrings.`store-and-network` = this.cast("store-and-network")
  @scala.inline
  def `store-only`: typings.atEntriaRelayDashExperimental.atEntriaRelayDashExperimentalStrings.`store-only` = this.cast("store-only")
  @scala.inline
  def `store-or-network`: typings.atEntriaRelayDashExperimental.atEntriaRelayDashExperimentalStrings.`store-or-network` = this.cast("store-or-network")
}

