package typings.externalEditor

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("external-editor/main/errors/CreateFileError", JSImport.Namespace)
@js.native
object createFileErrorMod extends js.Object {
  @js.native
  class CreateFileError protected () extends Error {
    def this(originalError: Error) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var originalError: Error = js.native
  }
  
}

