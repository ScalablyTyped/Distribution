package typings.freedom.freedom

import org.scalablytyped.runtime.StringDictionary
import typings.freedom.freedom.TcpSocket.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreedomInModuleEnv
  extends // We use this specification so that you can reference freedom sub-modules by
// an array-lookup of its name. One day, maybe we'll have a nicer way to do
// this.
/* moduleName */ StringDictionary[FreedomModuleFactoryManager[_]] {
  
  // Represents the call to freedom(), which returns the parent module's
  // freedom stub interface in an on/emit style. This is a getter.
  def apply(): ParentModuleThing = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  // Creates an interface to the freedom core provider which can be used to
  // create loggers and channels.
  // Note: unlike other providers, core is a getter.
  def core(args: js.Any*): Core = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.console")
  def coreDotconsole(args: js.Any*): typings.freedom.freedom.Console.Console = js.native
  @JSName("core.console")
  var coreDotconsole_Original: FreedomModuleFactoryManager[typings.freedom.freedom.Console.Console] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.rtcdatachannel")
  def coreDotrtcdatachannel(args: js.Any*): typings.freedom.freedom.RTCDataChannel.RTCDataChannel = js.native
  @JSName("core.rtcdatachannel")
  var coreDotrtcdatachannel_Original: FreedomModuleFactoryManager[typings.freedom.freedom.RTCDataChannel.RTCDataChannel] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.rtcpeerconnection")
  def coreDotrtcpeerconnection(args: js.Any*): typings.freedom.freedom.RTCPeerConnection.RTCPeerConnection = js.native
  @JSName("core.rtcpeerconnection")
  var coreDotrtcpeerconnection_Original: FreedomModuleFactoryManager[typings.freedom.freedom.RTCPeerConnection.RTCPeerConnection] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.storage")
  def coreDotstorage(args: js.Any*): typings.freedom.freedom.Storage.Storage = js.native
  @JSName("core.storage")
  var coreDotstorage_Original: FreedomModuleFactoryManager[typings.freedom.freedom.Storage.Storage] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.tcpsocket")
  def coreDottcpsocket(args: js.Any*): Socket = js.native
  @JSName("core.tcpsocket")
  var coreDottcpsocket_Original: FreedomModuleFactoryManager[Socket] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  @JSName("core.udpsocket")
  def coreDotudpsocket(args: js.Any*): typings.freedom.freedom.UdpSocket.Socket = js.native
  @JSName("core.udpsocket")
  var coreDotudpsocket_Original: FreedomModuleFactoryManager[typings.freedom.freedom.UdpSocket.Socket] = js.native
  
  // Creates an interface to the freedom core provider which can be used to
  // create loggers and channels.
  // Note: unlike other providers, core is a getter.
  @JSName("core")
  var core_Original: FreedomModuleFactoryManager[Core] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def pgp(args: js.Any*): typings.freedom.freedom.PgpProvider.PgpProvider = js.native
  @JSName("pgp")
  var pgp_Original: FreedomModuleFactoryManager[typings.freedom.freedom.PgpProvider.PgpProvider] = js.native
  
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def portControl(args: js.Any*): typings.freedom.freedom.PortControl.PortControl = js.native
  @JSName("portControl")
  var portControl_Original: FreedomModuleFactoryManager[typings.freedom.freedom.PortControl.PortControl] = js.native
}
