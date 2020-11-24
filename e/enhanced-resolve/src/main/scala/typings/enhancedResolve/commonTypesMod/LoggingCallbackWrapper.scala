package typings.enhancedResolve.commonTypesMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingCallbackWrapper extends LoggingCallbackTools {
  
  def apply(err: js.UndefOr[scala.Nothing], args: js.Any*): js.Any = js.native
  def apply(err: Null, args: js.Any*): js.Any = js.native
  def apply(err: Error, args: js.Any*): js.Any = js.native
}
