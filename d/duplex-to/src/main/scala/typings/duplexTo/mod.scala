package typings.duplexTo

import typings.duplexTo.anon.FnCall
import typings.duplexTo.anon.FnCallDuplex
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("duplex-to", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("duplex-to", "readable")
  @js.native
  def readable: FnCall = js.native
  inline def readable(duplex: Stream): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(duplex.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def readable(duplex: typings.readableStream.mod.Stream): typings.readableStream.mod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(duplex.asInstanceOf[js.Any]).asInstanceOf[typings.readableStream.mod.Readable]
  inline def readable_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readable")(x.asInstanceOf[js.Any])
  
  @JSImport("duplex-to", "writable")
  @js.native
  def writable: FnCallDuplex = js.native
  inline def writable(duplex: Stream): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(duplex.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def writable(duplex: typings.readableStream.mod.Stream): typings.readableStream.mod.Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(duplex.asInstanceOf[js.Any]).asInstanceOf[typings.readableStream.mod.Writable]
  inline def writable_=(x: FnCallDuplex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writable")(x.asInstanceOf[js.Any])
}
