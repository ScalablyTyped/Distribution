package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.PyramidMode.Linear
import typings.ejDotWebDotAll.ej.datavisualization.Chart.PyramidMode.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PyramidMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.PyramidMode")
@js.native
object PyramidMode extends js.Object {
  //string
  @js.native
  sealed trait Linear extends PyramidMode
  
  //string
  @js.native
  sealed trait Surface extends PyramidMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PyramidMode with Double] = js.native
  /* 0 */ @js.native
  object Linear extends TopLevel[Linear with Double]
  
  /* 1 */ @js.native
  object Surface extends TopLevel[Surface with Double]
  
}

