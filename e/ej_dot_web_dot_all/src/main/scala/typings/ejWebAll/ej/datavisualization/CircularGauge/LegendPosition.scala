package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LegendPosition extends js.Object
@JSGlobal("ej.datavisualization.CircularGauge.LegendPosition")
@js.native
object LegendPosition extends js.Object {
  
  //string
  @js.native
  sealed trait Bottom extends LegendPosition
  
  //string
  @js.native
  sealed trait Left extends LegendPosition
  
  //string
  @js.native
  sealed trait Right extends LegendPosition
  
  //string
  @js.native
  sealed trait Top extends LegendPosition
}
