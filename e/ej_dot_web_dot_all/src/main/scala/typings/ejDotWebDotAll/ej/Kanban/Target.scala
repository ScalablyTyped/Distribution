package typings.ejDotWebDotAll.ej.Kanban

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Target extends js.Object

@JSGlobal("ej.Kanban.Target")
@js.native
object Target extends js.Object {
  ///Sets context menu to Kanban
  @js.native
  sealed trait All extends Target
  
  ///Sets context menu to Kanban card
  @js.native
  sealed trait Card extends Target
  
  ///Sets context menu to Kanban content
  @js.native
  sealed trait Content extends Target
  
  ///Sets context menu to Kanban header
  @js.native
  sealed trait Header extends Target
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Target with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Card extends TopLevel[Card with Double]
  
  /* 1 */ @js.native
  object Content extends TopLevel[Content with Double]
  
  /* 0 */ @js.native
  object Header extends TopLevel[Header with Double]
  
}

