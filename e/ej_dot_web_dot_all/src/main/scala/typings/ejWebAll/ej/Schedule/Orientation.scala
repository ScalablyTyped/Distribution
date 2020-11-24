package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends js.Object
@JSGlobal("ej.Schedule.Orientation")
@js.native
object Orientation extends js.Object {
  
  ///Set orientation as horizontal to Scheduler
  @js.native
  sealed trait Horizontal extends Orientation
  
  ///Set orientation as vertical to Scheduler
  @js.native
  sealed trait Vertical extends Orientation
}
