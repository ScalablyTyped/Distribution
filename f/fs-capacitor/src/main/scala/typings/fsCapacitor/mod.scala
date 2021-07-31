package typings.fsCapacitor

import typings.node.streamMod.ReadableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-capacitor", "ReadAfterDestroyedError")
  @js.native
  class ReadAfterDestroyedError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("fs-capacitor", "ReadStream")
  @js.native
  class ReadStream ()
    extends typings.node.fsMod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("fs-capacitor", "WriteStream")
  @js.native
  class WriteStream ()
    extends typings.node.fsMod.WriteStream {
    
    def createReadStream(): ReadStream = js.native
    def createReadStream(name: String): ReadStream = js.native
  }
}
