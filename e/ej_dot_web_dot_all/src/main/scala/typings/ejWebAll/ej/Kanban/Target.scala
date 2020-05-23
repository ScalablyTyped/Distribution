package typings.ejWebAll.ej.Kanban

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
  
}

