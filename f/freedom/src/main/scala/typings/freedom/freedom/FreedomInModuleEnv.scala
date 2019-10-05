package typings.freedom.freedom

import org.scalablytyped.runtime.StringDictionary
import typings.freedom.freedom.TcpSocket.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreedomInModuleEnv
  extends // We use this specification so that you can reference freedom sub-modules by
// an array-lookup of its name. One day, maybe we'll have a nicer way to do
// this.
/* moduleName */ StringDictionary[FreedomModuleFactoryManager[_]] {
  @JSName("core.console")
  var `core.console_Original`: FreedomModuleFactoryManager[typings.freedom.freedom.Console.Console] = js.native
  @JSName("core.rtcdatachannel")
  var `core.rtcdatachannel_Original`: FreedomModuleFactoryManager[typings.freedom.freedom.RTCDataChannel.RTCDataChannel] = js.native
  @JSName("core.rtcpeerconnection")
  var `core.rtcpeerconnection_Original`: FreedomModuleFactoryManager[typings.freedom.freedom.RTCPeerConnection.RTCPeerConnection] = js.native
  @JSName("core.storage")
  var `core.storage_Original`: FreedomModuleFactoryManager[typings.freedom.freedom.Storage.Storage] = js.native
  @JSName("core.tcpsocket")
  var `core.tcpsocket_Original`: FreedomModuleFactoryManager[Socket] = js.native
  @JSName("core.udpsocket")
  var `core.udpsocket_Original`: FreedomModuleFactoryManager[typings.freedom.freedom.UdpSocket.Socket] = js.native
  // Creates an interface to the freedom core provider which can be used to
  // create loggers and channels.
  // Note: unlike other providers, core is a getter.
  @JSName("core")
  var core_Original: FreedomModuleFactoryManager[Core] = js.native
  @JSName("pgp")
  var pgp_Original: FreedomModuleFactoryManager[typings.freedom.freedom.PgpProvider.PgpProvider] = js.native
  @JSName("portControl")
  var portControl_Original: FreedomModuleFactoryManager[typings.freedom.freedom.PortControl.PortControl] = js.native
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
  def `core.console`(args: js.Any*): typings.freedom.freedom.Console.Console = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.rtcdatachannel`(args: js.Any*): typings.freedom.freedom.RTCDataChannel.RTCDataChannel = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.rtcpeerconnection`(args: js.Any*): typings.freedom.freedom.RTCPeerConnection.RTCPeerConnection = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.storage`(args: js.Any*): typings.freedom.freedom.Storage.Storage = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.tcpsocket`(args: js.Any*): Socket = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.udpsocket`(args: js.Any*): typings.freedom.freedom.UdpSocket.Socket = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def pgp(args: js.Any*): typings.freedom.freedom.PgpProvider.PgpProvider = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def portControl(args: js.Any*): typings.freedom.freedom.PortControl.PortControl = js.native
}

