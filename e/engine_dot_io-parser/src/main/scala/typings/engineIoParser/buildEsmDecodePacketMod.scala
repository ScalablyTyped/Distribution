package typings.engineIoParser

import typings.engineIoParser.buildEsmCommonsMod.BinaryType
import typings.engineIoParser.buildEsmCommonsMod.Packet
import typings.engineIoParser.buildEsmCommonsMod.RawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmDecodePacketMod {
  
  @JSImport("engine.io-parser/build/esm/decodePacket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodePacket(encodedPacket: RawData): Packet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePacket")(encodedPacket.asInstanceOf[js.Any]).asInstanceOf[Packet]
  inline def decodePacket(encodedPacket: RawData, binaryType: BinaryType): Packet = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePacket")(encodedPacket.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any])).asInstanceOf[Packet]
}
