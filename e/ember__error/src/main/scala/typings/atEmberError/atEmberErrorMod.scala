package typings.atEmberError

import typings.atEmberError.atEmberErrorMod.EmberError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/error", JSImport.Namespace)
@js.native
object atEmberErrorMod extends js.Object {
  @js.native
  class default () extends EmberError {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  type EmberError = Error
}

