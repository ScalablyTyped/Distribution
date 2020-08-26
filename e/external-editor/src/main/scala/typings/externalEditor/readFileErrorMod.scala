package typings.externalEditor

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("external-editor/main/errors/ReadFileError", JSImport.Namespace)
@js.native
object readFileErrorMod extends js.Object {
  @js.native
  class ReadFileError protected () extends Error {
    def this(originalError: Error) = this()
    var originalError: Error = js.native
  }
  
}

