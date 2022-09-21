package typings.duplexTo

import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(duplex: Stream): Readable = js.native
    def apply(duplex: typings.readableStream.mod.Stream): typings.readableStream.mod.Readable = js.native
  }
  
  @js.native
  trait FnCallDuplex extends StObject {
    
    def apply(duplex: Stream): Writable = js.native
    def apply(duplex: typings.readableStream.mod.Stream): typings.readableStream.mod.Writable = js.native
  }
}
