package typings.ethers.mod.ethers

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderFallbackMod.FallbackProviderConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.FallbackProvider")
@js.native
open class FallbackProvider protected ()
  extends typings.ethers.typesEthersMod.FallbackProvider {
  def this(providers: js.Array[
        typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider | FallbackProviderConfig
      ]) = this()
  def this(
    providers: js.Array[
        typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider | FallbackProviderConfig
      ],
    network: Networkish
  ) = this()
}
