package typings.dnsPacket.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamDecode {
  
  inline def apply(_package: Buffer): Packet = ^.asInstanceOf[js.Dynamic].apply(_package.asInstanceOf[js.Any]).asInstanceOf[Packet]
  
  @JSImport("dns-packet", "streamDecode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dns-packet", "streamDecode.bytes")
  @js.native
  def bytes: Double = js.native
  inline def bytes_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bytes")(x.asInstanceOf[js.Any])
}
