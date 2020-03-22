package typings.evernote.mod.Errors

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Errors.EDAMUserException")
@js.native
class EDAMUserException () extends Error {
  var errorCode: EDAMErrorCode = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var parameter: String = js.native
}

