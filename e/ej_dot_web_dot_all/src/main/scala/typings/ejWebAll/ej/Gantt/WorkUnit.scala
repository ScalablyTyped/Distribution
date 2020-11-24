package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WorkUnit extends js.Object
@JSGlobal("ej.Gantt.WorkUnit")
@js.native
object WorkUnit extends js.Object {
  
  ///Displays the work involved in a task in days.
  @js.native
  sealed trait Day extends WorkUnit
  
  ///Displays the work involved in a task in hours.
  @js.native
  sealed trait Hour extends WorkUnit
  
  ///Displays the work involved in a task in minutes
  @js.native
  sealed trait Minute extends WorkUnit
}
