package typings.engineIoClient

import typings.engineIoClient.buildEsmSocketMod.SocketState
import typings.engineIoClient.buildEsmTransportMod.TransportState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineIoClientStrings {
  
  @js.native
  sealed trait closed
    extends StObject
       with SocketState
       with TransportState
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait closing
    extends StObject
       with SocketState
  inline def closing: closing = "closing".asInstanceOf[closing]
  
  @js.native
  sealed trait open
    extends StObject
       with SocketState
       with TransportState
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait opening
    extends StObject
       with SocketState
       with TransportState
  inline def opening: opening = "opening".asInstanceOf[opening]
  
  @js.native
  sealed trait paused
    extends StObject
       with TransportState
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait pausing
    extends StObject
       with TransportState
  inline def pausing: pausing = "pausing".asInstanceOf[pausing]
}
