package typings.forestExpressSequelize.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Aggregator extends js.Object
@JSImport("forest-express-sequelize", "Aggregator")
@js.native
object Aggregator extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Aggregator with String] = js.native
  
  @js.native
  sealed trait AND extends Aggregator
  /* "and" */ @js.native
  object AND extends TopLevel[AND with String]
  
  @js.native
  sealed trait OR extends Aggregator
  /* "or" */ @js.native
  object OR extends TopLevel[OR with String]
}
