package typings.ejWebAll.ej.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLegendPosition extends js.Object

@JSGlobal("ej.Sunburst.SunburstLegendPosition")
@js.native
object SunburstLegendPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Left extends SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Right extends SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Top extends SunburstLegendPosition
  
}

