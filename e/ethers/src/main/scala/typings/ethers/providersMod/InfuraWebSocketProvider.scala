package typings.ethers.providersMod

import typings.ethers.typesProvidersNetworkMod.Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/providers", "InfuraWebSocketProvider")
@js.native
/**
  *  Creates a new **InfuraWebSocketProvider**.
  */
open class InfuraWebSocketProvider ()
  extends typings.ethers.typesProvidersMod.InfuraWebSocketProvider {
  def this(network: Networkish) = this()
  def this(network: Unit, projectId: String) = this()
  def this(network: Networkish, projectId: String) = this()
}
