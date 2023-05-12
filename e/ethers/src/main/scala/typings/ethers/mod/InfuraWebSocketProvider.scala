package typings.ethers.mod

import typings.ethers.typesProvidersNetworkMod.Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "InfuraWebSocketProvider")
@js.native
/**
  *  Creates a new **InfuraWebSocketProvider**.
  */
open class InfuraWebSocketProvider ()
  extends typings.ethers.typesEthersMod.InfuraWebSocketProvider {
  def this(network: Networkish) = this()
  def this(network: Unit, projectId: String) = this()
  def this(network: Networkish, projectId: String) = this()
}
