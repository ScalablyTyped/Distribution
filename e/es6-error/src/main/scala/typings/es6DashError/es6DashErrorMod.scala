package typings.es6DashError

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-error", JSImport.Namespace)
@js.native
object es6DashErrorMod extends js.Object {
  @js.native
  class default () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  type ExtendableError = Error
}

