package typings.ejWebAll.ej.datavisualization.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SunburstLegendShape extends js.Object
@JSGlobal("ej.datavisualization.Sunburst.SunburstLegendShape")
@js.native
object SunburstLegendShape extends js.Object {
  
  //string
  @js.native
  sealed trait Circle extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Cross extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Diamond extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Pentagon extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Rectangle extends SunburstLegendShape
  
  //string
  @js.native
  sealed trait Triangle extends SunburstLegendShape
}
