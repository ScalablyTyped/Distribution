package typings.ethers.typesEthersMod

import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "FeeDataNetworkPlugin")
@js.native
open class FeeDataNetworkPlugin protected ()
  extends typings.ethers.typesProvidersMod.FeeDataNetworkPlugin {
  def this(feeDataFunc: js.Function1[
        /* provider */ Provider, 
        js.Promise[typings.ethers.typesProvidersProviderMod.FeeData]
      ]) = this()
}
