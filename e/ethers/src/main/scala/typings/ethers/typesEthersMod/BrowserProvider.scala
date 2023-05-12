package typings.ethers.typesEthersMod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderBrowserMod.Eip1193Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "BrowserProvider")
@js.native
open class BrowserProvider protected ()
  extends typings.ethers.typesProvidersMod.BrowserProvider {
  def this(ethereum: Eip1193Provider) = this()
  def this(ethereum: Eip1193Provider, network: Networkish) = this()
}
