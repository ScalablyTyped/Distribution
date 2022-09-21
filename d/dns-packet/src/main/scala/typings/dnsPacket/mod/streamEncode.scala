package typings.dnsPacket.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamEncode {
  
  inline def apply(_package: Packet): Buffer = ^.asInstanceOf[js.Dynamic].apply(_package.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("dns-packet", "streamEncode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dns-packet", "streamEncode.bytes")
  @js.native
  def bytes: Double = js.native
  inline def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
}
