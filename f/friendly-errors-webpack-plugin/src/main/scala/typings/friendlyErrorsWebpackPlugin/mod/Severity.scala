package typings.friendlyErrorsWebpackPlugin.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Severity extends js.Object
@JSImport("friendly-errors-webpack-plugin", "Severity")
@js.native
object Severity extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Severity with String] = js.native
  
  @js.native
  sealed trait Error extends Severity
  /* "error" */ @js.native
  object Error extends TopLevel[Error with String]
  
  @js.native
  sealed trait Warning extends Severity
  /* "warning" */ @js.native
  object Warning extends TopLevel[Warning with String]
}
