package typings.duplexTo

import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writableMod {
  
  inline def apply(duplex: Stream): Writable = ^.asInstanceOf[js.Dynamic].apply(duplex.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def apply(duplex: typings.readableStream.mod.Stream): typings.readableStream.mod.Writable = ^.asInstanceOf[js.Dynamic].apply(duplex.asInstanceOf[js.Any]).asInstanceOf[typings.readableStream.mod.Writable]
  
  @JSImport("duplex-to/writable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
