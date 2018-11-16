package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreedomInModuleEnv
  extends // We use this specification so that you can reference freedom sub-modules by
// an array-lookup of its name. One day, maybe we'll have a nicer way to do
// this.
/* moduleName */ ScalablyTyped.runtime.StringDictionary[FreedomModuleFactoryManager[_]] {
  @JSName("core.console")
  var `core.console_Original`: FreedomModuleFactoryManager[freedomLib.freedomNs.ConsoleNs.Console] = js.native
  @JSName("core.rtcdatachannel")
  var `core.rtcdatachannel_Original`: FreedomModuleFactoryManager[freedomLib.freedomNs.RTCDataChannelNs.RTCDataChannel] = js.native
  @JSName("core.rtcpeerconnection")
  var `core.rtcpeerconnection_Original`: FreedomModuleFactoryManager[freedomLib.freedomNs.RTCPeerConnectionNs.RTCPeerConnection] = js.native
  @JSName("core.storage")
  var `core.storage_Original`: FreedomModuleFactoryManager[freedomLib.freedomNs.StorageNs.Storage] = js.native
  @JSName("core.tcpsocket")
  var `core.tcpsocket_Original`: FreedomModuleFactoryManager[freedomLib.freedomNs.TcpSocketNs.Socket] = js.native
  @JSName("core.udpsocket")
  var `core.udpsocket_Original`: FreedomModuleFactoryManager[freedomLib.freedomNs.UdpSocketNs.Socket] = js.native
  // Creates an interface to the freedom core provider which can be used to
  // create loggers and channels.
  // Note: unlike other providers, core is a getter.
  @JSName("core")
  var core_Original: FreedomModuleFactoryManager[Core] = js.native
  @JSName("pgp")
  var pgp_Original: FreedomModuleFactoryManager[freedomLib.freedomNs.PgpProviderNs.PgpProvider] = js.native
  @JSName("portControl")
  var portControl_Original: FreedomModuleFactoryManager[freedomLib.freedomNs.PortControlNs.PortControl] = js.native
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
  def `core.console`(args: js.Any*): freedomLib.freedomNs.ConsoleNs.Console = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.rtcdatachannel`(args: js.Any*): freedomLib.freedomNs.RTCDataChannelNs.RTCDataChannel = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.rtcpeerconnection`(args: js.Any*): freedomLib.freedomNs.RTCPeerConnectionNs.RTCPeerConnection = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.storage`(args: js.Any*): freedomLib.freedomNs.StorageNs.Storage = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.tcpsocket`(args: js.Any*): freedomLib.freedomNs.TcpSocketNs.Socket = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def `core.udpsocket`(args: js.Any*): freedomLib.freedomNs.UdpSocketNs.Socket = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def pgp(args: js.Any*): freedomLib.freedomNs.PgpProviderNs.PgpProvider = js.native
  // This is the factory constructor for a new instance of a stub/channel to a
  // module.
  def portControl(args: js.Any*): freedomLib.freedomNs.PortControlNs.PortControl = js.native
}

