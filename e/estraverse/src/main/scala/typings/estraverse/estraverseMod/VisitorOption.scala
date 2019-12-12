package typings.estraverse.estraverseMod

import org.scalablytyped.runtime.TopLevel
import typings.estraverse.estraverseMod.VisitorOption.Break
import typings.estraverse.estraverseMod.VisitorOption.Remove
import typings.estraverse.estraverseMod.VisitorOption.Skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisitorOption extends js.Object

@JSImport("estraverse", "VisitorOption")
@js.native
object VisitorOption extends js.Object {
  @js.native
  sealed trait Break extends VisitorOption
  
  @js.native
  sealed trait Remove extends VisitorOption
  
  @js.native
  sealed trait Skip extends VisitorOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisitorOption with Double] = js.native
  /* 1 */ @js.native
  object Break extends TopLevel[Break with Double]
  
  /* 2 */ @js.native
  object Remove extends TopLevel[Remove with Double]
  
  /* 0 */ @js.native
  object Skip extends TopLevel[Skip with Double]
  
}

