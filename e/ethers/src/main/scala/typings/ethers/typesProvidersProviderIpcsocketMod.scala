package typings.ethers

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderSocketMod.SocketProvider
import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersProviderIpcsocketMod {
  
  @JSImport("ethers/types/providers/provider-ipcsocket", "IpcSocketProvider")
  @js.native
  open class IpcSocketProvider protected () extends SocketProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
    
    def socket: Socket = js.native
  }
}
