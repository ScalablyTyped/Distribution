package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointerPlacement extends js.Object
@JSGlobal("ej.datavisualization.LinearGauge.PointerPlacement")
@js.native
object PointerPlacement extends js.Object {
  
  //string
  @js.native
  sealed trait Center extends PointerPlacement
  
  //string
  @js.native
  sealed trait Far extends PointerPlacement
  
  //string
  @js.native
  sealed trait Near extends PointerPlacement
}
