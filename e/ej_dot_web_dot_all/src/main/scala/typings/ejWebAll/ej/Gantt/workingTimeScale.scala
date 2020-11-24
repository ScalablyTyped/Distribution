package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait workingTimeScale extends js.Object
@JSGlobal("ej.Gantt.workingTimeScale")
@js.native
object workingTimeScale extends js.Object {
  
  ///Sets twenty four hour timescale.
  @js.native
  sealed trait TimeScale24Hours extends workingTimeScale
  
  ///Sets eight hour timescale.
  @js.native
  sealed trait TimeScale8Hours extends workingTimeScale
}
