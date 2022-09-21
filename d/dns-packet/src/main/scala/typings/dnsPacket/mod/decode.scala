package typings.dnsPacket.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decode {
  
  inline def apply(buf: Buffer): Packet = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[Packet]
  inline def apply(buf: Buffer, offset: Double): Packet = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Packet]
  
  @JSImport("dns-packet", "decode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dns-packet", "decode.bytes")
  @js.native
  def bytes: Double = js.native
  inline def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
}
