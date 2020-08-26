package typings.evernote.mod.Errors

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Errors.EDAMSystemException")
@js.native
class EDAMSystemException () extends Error {
  var errorCode: EDAMErrorCode = js.native
  var rateLimitDuration: Double = js.native
}

