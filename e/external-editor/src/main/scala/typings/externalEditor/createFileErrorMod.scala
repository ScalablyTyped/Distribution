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
    var originalError: Error = js.native
  }
  
}

