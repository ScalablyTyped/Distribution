package typings.engineIoParser

import typings.engineIoParser.buildEsmCommonsMod.BinaryType
import typings.engineIoParser.buildEsmCommonsMod.Packet
import typings.engineIoParser.buildEsmCommonsMod.RawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmDecodePacketDotbrowserMod {
  
  @JSImport("engine.io-parser/build/esm/decodePacket.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(encodedPacket: RawData): Packet = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(encodedPacket.asInstanceOf[js.Any]).asInstanceOf[Packet]
  inline def default(encodedPacket: RawData, binaryType: BinaryType): Packet = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(encodedPacket.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any])).asInstanceOf[Packet]
}
