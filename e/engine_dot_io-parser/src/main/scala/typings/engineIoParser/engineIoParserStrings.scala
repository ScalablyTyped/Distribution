package typings.engineIoParser

import typings.engineIoParser.commonsMod.BinaryType
import typings.engineIoParser.commonsMod.PacketType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineIoParserStrings {
  
  @js.native
  sealed trait arraybuffer
    extends StObject
       with BinaryType
  inline def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait blob
    extends StObject
       with BinaryType
  inline def blob: blob = "blob".asInstanceOf[blob]
  
  @js.native
  sealed trait close
    extends StObject
       with PacketType
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait error
    extends StObject
       with PacketType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait message
    extends StObject
       with PacketType
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait nodebuffer
    extends StObject
       with BinaryType
  inline def nodebuffer: nodebuffer = "nodebuffer".asInstanceOf[nodebuffer]
  
  @js.native
  sealed trait noop
    extends StObject
       with PacketType
  inline def noop: noop = "noop".asInstanceOf[noop]
  
  @js.native
  sealed trait open
    extends StObject
       with PacketType
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait ping
    extends StObject
       with PacketType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait pong
    extends StObject
       with PacketType
  inline def pong: pong = "pong".asInstanceOf[pong]
  
  @js.native
  sealed trait upgrade
    extends StObject
       with PacketType
  inline def upgrade: upgrade = "upgrade".asInstanceOf[upgrade]
}
