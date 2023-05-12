package typings.ethers

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderCloudflareMod {
  
  @JSImport("ethers/types/providers/provider-cloudflare", "CloudflareProvider")
  @js.native
  open class CloudflareProvider () extends JsonRpcProvider {
    def this(_network: Networkish) = this()
  }
}
