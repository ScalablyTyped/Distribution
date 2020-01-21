package typings.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/framework/Mode", JSImport.Namespace)
@js.native
object modeMod extends js.Object {
  @js.native
  sealed trait Mode extends js.Object
  
  @js.native
  object Mode extends js.Object {
    @js.native
    sealed trait All extends Mode
    
    @js.native
    sealed trait AtLeastOne extends Mode
    
    @js.native
    sealed trait AtMostOne extends Mode
    
  }
  
  @js.native
  object default extends js.Object {
    /* "All" */ val All: typings.forgeDi.modeMod.Mode.All with String = js.native
    /* "AtLeastOne" */ val AtLeastOne: typings.forgeDi.modeMod.Mode.AtLeastOne with String = js.native
    /* "AtMostOne" */ val AtMostOne: typings.forgeDi.modeMod.Mode.AtMostOne with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Mode with String] = js.native
  }
  
}

