package typings.engineIo

import typings.engineIo.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineIoStrings {
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait closed extends StObject
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait closing extends StObject
  inline def closing: closing = "closing".asInstanceOf[closing]
  
  @js.native
  sealed trait connection extends StObject
  inline def connection: connection = "connection".asInstanceOf[connection]
  
  @js.native
  sealed trait drain extends StObject
  inline def drain: drain = "drain".asInstanceOf[drain]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait flush extends StObject
  inline def flush: flush = "flush".asInstanceOf[flush]
  
  @js.native
  sealed trait message extends StObject
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait open extends StObject
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait opening extends StObject
  inline def opening: opening = "opening".asInstanceOf[opening]
  
  @js.native
  sealed trait packet extends StObject
  inline def packet: packet = "packet".asInstanceOf[packet]
  
  @js.native
  sealed trait packetCreate extends StObject
  inline def packetCreate: packetCreate = "packetCreate".asInstanceOf[packetCreate]
  
  @js.native
  sealed trait polling
    extends StObject
       with Transport
  inline def polling: polling = "polling".asInstanceOf[polling]
  
  @js.native
  sealed trait uws extends StObject
  inline def uws: uws = "uws".asInstanceOf[uws]
  
  @js.native
  sealed trait websocket
    extends StObject
       with Transport
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait ws extends StObject
  inline def ws: ws = "ws".asInstanceOf[ws]
}
