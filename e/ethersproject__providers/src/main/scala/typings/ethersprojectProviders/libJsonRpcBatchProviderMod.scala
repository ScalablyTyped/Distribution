package typings.ethersprojectProviders

import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.anon.Reject
import typings.ethersprojectProviders.libJsonRpcProviderMod.JsonRpcProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonRpcBatchProviderMod {
  
  @JSImport("@ethersproject/providers/lib/json-rpc-batch-provider", "JsonRpcBatchProvider")
  @js.native
  open class JsonRpcBatchProvider () extends JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
    
    var _pendingBatch: js.Array[Reject] = js.native
    
    var _pendingBatchAggregator: Timer = js.native
  }
}
