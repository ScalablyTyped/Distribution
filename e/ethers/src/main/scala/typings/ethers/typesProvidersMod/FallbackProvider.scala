package typings.ethers.typesProvidersMod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderFallbackMod.FallbackProviderConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/providers", "FallbackProvider")
@js.native
open class FallbackProvider protected ()
  extends typings.ethers.typesProvidersProviderFallbackMod.FallbackProvider {
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
