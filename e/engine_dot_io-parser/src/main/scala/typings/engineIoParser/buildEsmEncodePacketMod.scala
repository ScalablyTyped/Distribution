package typings.engineIoParser

import typings.engineIoParser.buildEsmCommonsMod.Packet
import typings.engineIoParser.buildEsmCommonsMod.RawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmEncodePacketMod {
  
  @JSImport("engine.io-parser/build/esm/encodePacket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Packet, supportsBinary: Boolean, callback: js.Function1[/* encodedPacket */ RawData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], supportsBinary.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
