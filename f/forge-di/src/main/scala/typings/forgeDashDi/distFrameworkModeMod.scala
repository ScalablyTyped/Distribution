package typings.forgeDashDi

import typings.forgeDashDi.distFrameworkModeMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/framework/Mode", JSImport.Namespace)
@js.native
object distFrameworkModeMod extends js.Object {
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
    /* "All" */ val All: typings.forgeDashDi.distFrameworkModeMod.Mode.All with String = js.native
    /* "AtLeastOne" */ val AtLeastOne: typings.forgeDashDi.distFrameworkModeMod.Mode.AtLeastOne with String = js.native
    /* "AtMostOne" */ val AtMostOne: typings.forgeDashDi.distFrameworkModeMod.Mode.AtMostOne with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Mode with String] = js.native
  }
  
}

