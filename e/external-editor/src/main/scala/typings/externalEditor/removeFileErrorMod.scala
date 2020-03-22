package typings.externalEditor

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("external-editor/main/errors/RemoveFileError", JSImport.Namespace)
@js.native
object removeFileErrorMod extends js.Object {
  @js.native
  class RemoveFileError protected () extends Error {
    def this(originalError: Error) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    var originalError: Error = js.native
  }
  
}

