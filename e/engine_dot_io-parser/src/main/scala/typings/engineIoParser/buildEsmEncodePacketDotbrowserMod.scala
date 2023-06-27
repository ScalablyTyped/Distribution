package typings.engineIoParser

import typings.engineIoParser.buildEsmCommonsMod.Packet
import typings.engineIoParser.buildEsmCommonsMod.RawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmEncodePacketDotbrowserMod {
  
  @JSImport("engine.io-parser/build/esm/encodePacket.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodePacket(param0: Packet, supportsBinary: Boolean, callback: js.Function1[/* encodedPacket */ RawData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePacket")(param0.asInstanceOf[js.Any], supportsBinary.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encodePacketToBinary(packet: Packet, callback: js.Function1[/* encodedPacket */ RawData, Unit]): Unit | js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePacketToBinary")(packet.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Unit]]
}
