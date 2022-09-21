package typings.dmx.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.TopLevel
import typings.dmx.dmxStrings.`dmxking-ultra-dmx-pro`
import typings.dmx.dmxStrings.`enttec-open-usb-dmx`
import typings.dmx.dmxStrings.`enttec-usb-dmx-pro`
import typings.dmx.dmxStrings.`null`
import typings.dmx.dmxStrings.artnet
import typings.dmx.dmxStrings.bbdmx
import typings.dmx.dmxStrings.dmx4all
import typings.dmx.dmxStrings.sacn
import typings.dmx.dmxStrings.socketio
import typings.dmx.dmxStrings.update
import typings.dmx.dmxStrings.updateAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is used to tie multiple universes together.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any */ @js.native
trait DMX[TDevices /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ key in string ]:? dmx.dmx.Device}
  */ typings.dmx.dmxStrings.DMX & TopLevel[Any] */] extends StObject {
  
  def addListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_update(
    eventName: update,
    listener: js.Function3[
      /* universe */ String, 
      /* channels */ ChannelMap, 
      /* extraData */ js.UndefOr[UpdateEventExtraData], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_updateAll(eventName: updateAll, listener: js.Function2[/* universe */ String, /* value */ Double, Unit]): this.type = js.native
  
  def addUniverse(name: String, driver: String, deviceId: Any): Universe = js.native
  def addUniverse(name: String, driver: String, deviceId: Any, options: js.Object): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_artnet(name: String, driver: artnet): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_artnet(name: String, driver: artnet, deviceId: String): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_artnet(name: String, driver: artnet, deviceId: String, options: ArtnetDriverOptions): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_artnet(name: String, driver: artnet, deviceId: Unit, options: ArtnetDriverOptions): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_bbdmx(name: String, driver: bbdmx): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_bbdmx(name: String, driver: bbdmx, deviceId: String): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_bbdmx(name: String, driver: bbdmx, deviceId: String, options: BBDMXDriverOptions): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_bbdmx(name: String, driver: bbdmx, deviceId: Unit, options: BBDMXDriverOptions): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_dmx4all(name: String, driver: dmx4all, deviceId: String): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_dmx4all(name: String, driver: dmx4all, deviceId: String, options: DMX4ALLDriverOptions): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_dmxkingultradmxpro(name: String, driver: `dmxking-ultra-dmx-pro`, deviceId: String): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_dmxkingultradmxpro(
    name: String,
    driver: `dmxking-ultra-dmx-pro`,
    deviceId: String,
    options: DMXKingUltraDMXProDriverOptions
  ): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_enttecopenusbdmx(name: String, driver: `enttec-open-usb-dmx`, deviceId: String): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_enttecopenusbdmx(
    name: String,
    driver: `enttec-open-usb-dmx`,
    deviceId: String,
    options: EnttecOpenUsbDMXDriverOptions
  ): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_enttecusbdmxpro(name: String, driver: `enttec-usb-dmx-pro`, deviceId: String): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_enttecusbdmxpro(
    name: String,
    driver: `enttec-usb-dmx-pro`,
    deviceId: String,
    options: EnttecUSBDMXPRODriverOptions
  ): Universe = js.native
  /**
    * Add a new DMX Universe with a name, driver and an optional device_id used by the driver to identify the device.
    * For `enttec-usb-dmx-pro` and `enttec-open-usb-dmx` `device_id` is the path the the serial device. For `artnet`
    * it is the target ip.
    *
    * @param options Driver specific options.
    */
  @JSName("addUniverse")
  def addUniverse_null(name: String, driver: `null`): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_null(name: String, driver: `null`, deviceId: Unit, options: NullDriverOptions): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_sacn(name: String, driver: sacn): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_sacn(name: String, driver: sacn, deviceId: Unit, options: SACNDriverOptions): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_socketio(name: String, driver: socketio): Universe = js.native
  @JSName("addUniverse")
  def addUniverse_socketio(name: String, driver: socketio, deviceId: Unit, options: SocketioDriverOptions): Universe = js.native
  
  var devices: TDevices = js.native
  
  def emit(eventName: String, args: Any*): Boolean = js.native
  def emit(eventName: js.Symbol, args: Any*): Boolean = js.native
  @JSName("emit")
  def emit_update(eventName: update, universe: String, channels: ChannelMap): this.type = js.native
  @JSName("emit")
  def emit_update(eventName: update, universe: String, channels: ChannelMap, extraData: UpdateEventExtraData): this.type = js.native
  @JSName("emit")
  def emit_updateAll(eventName: updateAll, universe: String, value: Double): this.type = js.native
  
  def off(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def off(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("off")
  def off_update(
    eventName: update,
    listener: js.Function3[
      /* universe */ String, 
      /* channels */ ChannelMap, 
      /* extraData */ js.UndefOr[UpdateEventExtraData], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_updateAll(eventName: updateAll, listener: js.Function2[/* universe */ String, /* value */ Double, Unit]): this.type = js.native
  
  def on(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("on")
  def on_update(
    eventName: update,
    listener: js.Function3[
      /* universe */ String, 
      /* channels */ ChannelMap, 
      /* extraData */ js.UndefOr[UpdateEventExtraData], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_updateAll(eventName: updateAll, listener: js.Function2[/* universe */ String, /* value */ Double, Unit]): this.type = js.native
  
  def once(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_update(
    eventName: update,
    listener: js.Function3[
      /* universe */ String, 
      /* channels */ ChannelMap, 
      /* extraData */ js.UndefOr[UpdateEventExtraData], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_updateAll(eventName: updateAll, listener: js.Function2[/* universe */ String, /* value */ Double, Unit]): this.type = js.native
  
  def prependListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_update(
    eventName: update,
    listener: js.Function3[
      /* universe */ String, 
      /* channels */ ChannelMap, 
      /* extraData */ js.UndefOr[UpdateEventExtraData], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_updateAll(eventName: updateAll, listener: js.Function2[/* universe */ String, /* value */ Double, Unit]): this.type = js.native
  
  def prependOnceListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_update(
    eventName: update,
    listener: js.Function3[
      /* universe */ String, 
      /* channels */ ChannelMap, 
      /* extraData */ js.UndefOr[UpdateEventExtraData], 
      Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_updateAll(eventName: updateAll, listener: js.Function2[/* universe */ String, /* value */ Double, Unit]): this.type = js.native
  
  /**
    * Register a new DMX Driver module by its name.
    * These drivers are currently registered by default:
    *
    * - `null`: a development driver that prints the universe to stdout
    * - `socketio`: a driver which sends out the universe via socket.IO as an array
    *   (see [demo_socket_client.js](./demo_socket_client.js) as a client example)
    * - `artnet`: driver for EnttecODE
    * - `bbdmx`: driver for [BeagleBone-DMX](https://github.com/boxysean/beaglebone-DMX)
    * - `dmx4all`: driver for DMX4ALL devices like the "NanoDMX USB Interface"
    * - `enttec-usb-dmx-pro`: a driver for devices using a Enttec USB DMX Pro chip like the "DMXKing ultraDMX Micro".
    * - `enttec-open-usb-dmx`: driver for "Enttec Open DMX USB". This device is NOT recommended, there are known
    *   hardware limitations and this driver is not very stable. (If possible better obtain a device with the
    *   "pro" chip)
    * - `dmxking-ultra-dmx-pro`: driver for the DMXKing Ultra DMX pro interface. This driver supports multiple
    *   universes, specify the options with Port = A or B
    */
  def registerDriver(name: String, module: UniverseStatic): Unit = js.native
  
  def removeListener(eventName: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def removeListener(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_update(
    eventName: update,
    listener: js.Function3[
      /* universe */ String, 
      /* channels */ ChannelMap, 
      /* extraData */ js.UndefOr[UpdateEventExtraData], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_updateAll(eventName: updateAll, listener: js.Function2[/* universe */ String, /* value */ Double, Unit]): this.type = js.native
  
  def universeToObject(universe: String): NumberDictionary[Double] = js.native
  
  /**
    * Update one or multiple channels of a universe. Also emits an `update` event with the same information.
    *
    * @param universe Name of the universe.
    * @param channels Keys are channel numbers, values the values to set that channel to.
    * @param extraData This data will be passed unmodified to the `update` Event.
    */
  def update(universe: String, channels: ChannelMap): Unit = js.native
  def update(universe: String, channels: ChannelMap, extraData: UpdateEventExtraData): Unit = js.native
  
  def updateAll(universe: String, value: Double): Unit = js.native
}
