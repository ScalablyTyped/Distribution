package typings.duplexTo

import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readableMod {
  
  inline def apply(duplex: Stream): Readable = ^.asInstanceOf[js.Dynamic].apply(duplex.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def apply(duplex: typings.readableStream.mod.Stream): typings.readableStream.mod.Readable = ^.asInstanceOf[js.Dynamic].apply(duplex.asInstanceOf[js.Any]).asInstanceOf[typings.readableStream.mod.Readable]
  
  @JSImport("duplex-to/readable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
