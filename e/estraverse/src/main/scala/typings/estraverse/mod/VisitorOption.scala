package typings.estraverse.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisitorOption extends js.Object
@JSImport("estraverse", "VisitorOption")
@js.native
object VisitorOption extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisitorOption with Double] = js.native
  
  @js.native
  sealed trait Break extends VisitorOption
  /* 0 */ @js.native
  object Break extends TopLevel[Break with Double]
  
  @js.native
  sealed trait Remove extends VisitorOption
  /* 2 */ @js.native
  object Remove extends TopLevel[Remove with Double]
  
  @js.native
  sealed trait Skip extends VisitorOption
  /* 1 */ @js.native
  object Skip extends TopLevel[Skip with Double]
}
