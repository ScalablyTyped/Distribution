package typings.ethers.mod.ethers

import typings.ethers.typesProvidersNetworkMod.Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.EtherscanProvider")
@js.native
/**
  *  Creates a new **EtherscanBaseProvider**.
  */
open class EtherscanProvider ()
  extends typings.ethers.typesEthersMod.EtherscanProvider {
  def this(_network: Networkish) = this()
  def this(_network: Unit, _apiKey: String) = this()
  def this(_network: Networkish, _apiKey: String) = this()
}
