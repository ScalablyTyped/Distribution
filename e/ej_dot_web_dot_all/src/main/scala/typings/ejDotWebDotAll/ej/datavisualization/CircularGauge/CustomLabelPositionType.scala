package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.CustomLabelPositionType.Inner
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.CustomLabelPositionType.Outer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomLabelPositionType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.CustomLabelPositionType")
@js.native
object CustomLabelPositionType extends js.Object {
  //string
  @js.native
  sealed trait Inner extends CustomLabelPositionType
  
  //string
  @js.native
  sealed trait Outer extends CustomLabelPositionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomLabelPositionType with Double] = js.native
  /* 0 */ @js.native
  object Inner extends TopLevel[Inner with Double]
  
  /* 1 */ @js.native
  object Outer extends TopLevel[Outer with Double]
  
}

