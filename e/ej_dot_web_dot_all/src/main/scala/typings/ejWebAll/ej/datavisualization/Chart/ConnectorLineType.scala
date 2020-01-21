package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectorLineType extends js.Object

@JSGlobal("ej.datavisualization.Chart.ConnectorLineType")
@js.native
object ConnectorLineType extends js.Object {
  //string
  @js.native
  sealed trait Bezier extends ConnectorLineType
  
  //string
  @js.native
  sealed trait Line extends ConnectorLineType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectorLineType with Double] = js.native
  /* 1 */ @js.native
  object Bezier extends TopLevel[Bezier with Double]
  
  /* 0 */ @js.native
  object Line extends TopLevel[Line with Double]
  
}

