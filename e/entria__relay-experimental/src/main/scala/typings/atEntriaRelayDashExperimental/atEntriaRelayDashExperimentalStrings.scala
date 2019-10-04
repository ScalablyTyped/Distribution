package typings.atEntriaRelayDashExperimental

import typings.atEntriaRelayDashExperimental.libQueryResourceMod.FetchPolicy
import typings.atEntriaRelayDashExperimental.libQueryResourceMod.RenderPolicy
import typings.atEntriaRelayDashExperimental.libUseLoadMoreFunctionMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atEntriaRelayDashExperimentalStrings {
  @js.native
  sealed trait backward extends Direction
  
  @js.native
  sealed trait forward extends Direction
  
  @js.native
  sealed trait full extends RenderPolicy
  
  @js.native
  sealed trait `network-only` extends FetchPolicy
  
  @js.native
  sealed trait partial extends RenderPolicy
  
  @js.native
  sealed trait `store-and-network` extends FetchPolicy
  
  @js.native
  sealed trait `store-only` extends FetchPolicy
  
  @js.native
  sealed trait `store-or-network` extends FetchPolicy
  
  @scala.inline
  def backward: backward = "backward".asInstanceOf[backward]
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  @scala.inline
  def `store-and-network`: `store-and-network` = "store-and-network".asInstanceOf[`store-and-network`]
  @scala.inline
  def `store-only`: `store-only` = "store-only".asInstanceOf[`store-only`]
  @scala.inline
  def `store-or-network`: `store-or-network` = "store-or-network".asInstanceOf[`store-or-network`]
}

