package typings.friendlyErrorsWebpackPlugin.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Severity extends js.Object

@JSImport("friendly-errors-webpack-plugin", "Severity")
@js.native
object Severity extends js.Object {
  @js.native
  sealed trait Error extends Severity
  
  @js.native
  sealed trait Warning extends Severity
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Severity with String] = js.native
  /* "error" */ @js.native
  object Error extends TopLevel[Error with String]
  
  /* "warning" */ @js.native
  object Warning extends TopLevel[Warning with String]
  
}

