package typings.engineIoParser

import typings.engineIoParser.commonsMod.BinaryType
import typings.engineIoParser.commonsMod.Packet
import typings.engineIoParser.commonsMod.RawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("engine.io-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodePacket(encodedPacket: RawData): Packet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePacket")(encodedPacket.asInstanceOf[js.Any]).asInstanceOf[Packet]
  inline def decodePacket(encodedPacket: RawData, binaryType: BinaryType): Packet = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePacket")(encodedPacket.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any])).asInstanceOf[Packet]
  
  inline def decodePayload(encodedPayload: String): js.Array[Packet] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePayload")(encodedPayload.asInstanceOf[js.Any]).asInstanceOf[js.Array[Packet]]
  inline def decodePayload(encodedPayload: String, binaryType: BinaryType): js.Array[Packet] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePayload")(encodedPayload.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any])).asInstanceOf[js.Array[Packet]]
  
  inline def encodePacket(
    hasTypeData: Packet,
    supportsBinary: Boolean,
    callback: js.Function1[/* encodedPacket */ RawData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePacket")(hasTypeData.asInstanceOf[js.Any], supportsBinary.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encodePayload(packets: js.Array[Packet], callback: js.Function1[/* encodedPayload */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePayload")(packets.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("engine.io-parser", "protocol")
  @js.native
  val protocol: /* 4 */ Double = js.native
}
