package typings.engineIo

import typings.engineIo.anon.Data
import typings.engineIo.anon.DataType
import typings.engineIo.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserV3Mod {
  
  @JSImport("engine.io/build/parser-v3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBase64Packet(msg: Any, binaryType: Any): DataType = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBase64Packet")(msg.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any])).asInstanceOf[DataType]
  
  inline def decodePacket(data: Any, binaryType: Any, utf8decode: Any): Data | Type = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePacket")(data.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any], utf8decode.asInstanceOf[js.Any])).asInstanceOf[Data | Type]
  
  inline def decodePayload(data: Any, binaryType: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePayload")(data.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def decodePayloadAsBinary(data: Any, binaryType: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePayloadAsBinary")(data.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encodeBase64Packet(packet: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase64Packet")(packet.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encodePacket(packet: Any, supportsBinary: Any, utf8encode: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePacket")(packet.asInstanceOf[js.Any], supportsBinary.asInstanceOf[js.Any], utf8encode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encodePayload(packets: Any, supportsBinary: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePayload")(packets.asInstanceOf[js.Any], supportsBinary.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encodePayloadAsBinary(packets: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePayloadAsBinary")(packets.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object packets {
    
    @JSImport("engine.io/build/parser-v3", "packets")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("engine.io/build/parser-v3", "packets.close")
    @js.native
    def close: Double = js.native
    inline def close_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
    
    @JSImport("engine.io/build/parser-v3", "packets.message")
    @js.native
    def message: Double = js.native
    inline def message_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
    
    @JSImport("engine.io/build/parser-v3", "packets.noop")
    @js.native
    def noop: Double = js.native
    inline def noop_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noop")(x.asInstanceOf[js.Any])
    
    @JSImport("engine.io/build/parser-v3", "packets.open")
    @js.native
    def open: Double = js.native
    inline def open_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("open")(x.asInstanceOf[js.Any])
    
    @JSImport("engine.io/build/parser-v3", "packets.ping")
    @js.native
    def ping: Double = js.native
    inline def ping_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ping")(x.asInstanceOf[js.Any])
    
    @JSImport("engine.io/build/parser-v3", "packets.pong")
    @js.native
    def pong: Double = js.native
    inline def pong_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pong")(x.asInstanceOf[js.Any])
    
    @JSImport("engine.io/build/parser-v3", "packets.upgrade")
    @js.native
    def upgrade: Double = js.native
    inline def upgrade_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("engine.io/build/parser-v3", "protocol")
  @js.native
  val protocol: /* 3 */ Double = js.native
}
