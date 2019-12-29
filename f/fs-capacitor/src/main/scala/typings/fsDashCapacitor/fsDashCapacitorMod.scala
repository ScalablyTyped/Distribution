package typings.fsDashCapacitor

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-capacitor", JSImport.Namespace)
@js.native
object fsDashCapacitorMod extends js.Object {
  @js.native
  class ReadAfterDestroyedError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
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

