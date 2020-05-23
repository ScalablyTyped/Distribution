package typings.dockerfileAst.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Directive extends js.Object

@JSImport("dockerfile-ast", "Directive")
@js.native
object Directive extends js.Object {
  @js.native
  sealed trait escape extends Directive
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Directive with String] = js.native
  /* "escape" */ @js.native
  object escape extends TopLevel[escape with String]
  
}

