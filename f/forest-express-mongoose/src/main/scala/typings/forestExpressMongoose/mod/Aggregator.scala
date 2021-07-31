package typings.forestExpressMongoose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Aggregator extends StObject
@JSImport("forest-express-mongoose", "Aggregator")
@js.native
object Aggregator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Aggregator & String] = js.native
  
  @js.native
  sealed trait AND
    extends StObject
       with Aggregator
  /* "and" */ val AND: typings.forestExpressMongoose.mod.Aggregator.AND & String = js.native
  
  @js.native
  sealed trait OR
    extends StObject
       with Aggregator
  /* "or" */ val OR: typings.forestExpressMongoose.mod.Aggregator.OR & String = js.native
}
