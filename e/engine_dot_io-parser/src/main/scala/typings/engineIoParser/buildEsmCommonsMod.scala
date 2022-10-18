package typings.engineIoParser

import typings.engineIoParser.anon.Compress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmCommonsMod {
  
  @JSImport("engine.io-parser/build/esm/commons", "ERROR_PACKET")
  @js.native
  val ERROR_PACKET: Packet = js.native
  
  @JSImport("engine.io-parser/build/esm/commons", "PACKET_TYPES")
  @js.native
  val PACKET_TYPES: Any = js.native
  
  @JSImport("engine.io-parser/build/esm/commons", "PACKET_TYPES_REVERSE")
  @js.native
  val PACKET_TYPES_REVERSE: Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.engineIoParser.engineIoParserStrings.nodebuffer
    - typings.engineIoParser.engineIoParserStrings.arraybuffer
    - typings.engineIoParser.engineIoParserStrings.blob
  */
  trait BinaryType extends StObject
  object BinaryType {
    
    inline def arraybuffer: typings.engineIoParser.engineIoParserStrings.arraybuffer = "arraybuffer".asInstanceOf[typings.engineIoParser.engineIoParserStrings.arraybuffer]
    
    inline def blob: typings.engineIoParser.engineIoParserStrings.blob = "blob".asInstanceOf[typings.engineIoParser.engineIoParserStrings.blob]
    
    inline def nodebuffer: typings.engineIoParser.engineIoParserStrings.nodebuffer = "nodebuffer".asInstanceOf[typings.engineIoParser.engineIoParserStrings.nodebuffer]
  }
  
  trait Packet extends StObject {
    
    var data: js.UndefOr[RawData] = js.undefined
    
    var options: js.UndefOr[Compress] = js.undefined
    
    var `type`: PacketType
  }
  object Packet {
    
    inline def apply(`type`: PacketType): Packet = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    extension [Self <: Packet](x: Self) {
      
      inline def setData(value: RawData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setOptions(value: Compress): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: PacketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.engineIoParser.engineIoParserStrings.open
    - typings.engineIoParser.engineIoParserStrings.close
    - typings.engineIoParser.engineIoParserStrings.ping
    - typings.engineIoParser.engineIoParserStrings.pong
    - typings.engineIoParser.engineIoParserStrings.message
    - typings.engineIoParser.engineIoParserStrings.upgrade
    - typings.engineIoParser.engineIoParserStrings.noop
    - typings.engineIoParser.engineIoParserStrings.error
  */
  trait PacketType extends StObject
  object PacketType {
    
    inline def close: typings.engineIoParser.engineIoParserStrings.close = "close".asInstanceOf[typings.engineIoParser.engineIoParserStrings.close]
    
    inline def error: typings.engineIoParser.engineIoParserStrings.error = "error".asInstanceOf[typings.engineIoParser.engineIoParserStrings.error]
    
    inline def message: typings.engineIoParser.engineIoParserStrings.message = "message".asInstanceOf[typings.engineIoParser.engineIoParserStrings.message]
    
    inline def noop: typings.engineIoParser.engineIoParserStrings.noop = "noop".asInstanceOf[typings.engineIoParser.engineIoParserStrings.noop]
    
    inline def open: typings.engineIoParser.engineIoParserStrings.open = "open".asInstanceOf[typings.engineIoParser.engineIoParserStrings.open]
    
    inline def ping: typings.engineIoParser.engineIoParserStrings.ping = "ping".asInstanceOf[typings.engineIoParser.engineIoParserStrings.ping]
    
    inline def pong: typings.engineIoParser.engineIoParserStrings.pong = "pong".asInstanceOf[typings.engineIoParser.engineIoParserStrings.pong]
    
    inline def upgrade: typings.engineIoParser.engineIoParserStrings.upgrade = "upgrade".asInstanceOf[typings.engineIoParser.engineIoParserStrings.upgrade]
  }
  
  type RawData = Any
}
