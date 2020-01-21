package typings.enhancedResolve.commonTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingCallbackWrapper extends LoggingCallbackTools {
  def apply(): js.Any = js.native
  def apply(args: js.Any*): js.Any = js.native
  def apply(err: Error, args: js.Any*): js.Any = js.native
}

