package typings.forestExpressMongoose.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Aggregator extends js.Object

@JSImport("forest-express-mongoose", "Aggregator")
@js.native
object Aggregator extends js.Object {
  @js.native
  sealed trait AND extends Aggregator
  
  @js.native
  sealed trait OR extends Aggregator
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Aggregator with String] = js.native
  /* "and" */ @js.native
  object AND extends TopLevel[AND with String]
  
  /* "or" */ @js.native
  object OR extends TopLevel[OR with String]
  
}

