package typings.fsCapacitor

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs-capacitor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class ReadAfterDestroyedError () extends Error
  
  @js.native
  class ReadStream ()
    extends typings.node.fsMod.ReadStream
  
  @js.native
  class WriteStream ()
    extends typings.node.fsMod.WriteStream {
    
    def createReadStream(): ReadStream = js.native
    def createReadStream(name: String): ReadStream = js.native
  }
}
