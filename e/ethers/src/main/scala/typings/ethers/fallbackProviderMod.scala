package typings.ethers

import typings.ethers.providerMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/providers/fallback-provider", JSImport.Namespace)
@js.native
object fallbackProviderMod extends js.Object {
  @js.native
  class FallbackProvider protected () extends Provider {
    def this(providers: js.Array[Provider]) = this()
    var _providers: js.Any = js.native
    val providers: js.Array[Provider] = js.native
  }
  
}

