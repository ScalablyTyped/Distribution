package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingOrientation extends js.Object

@JSGlobal("ej.datavisualization.Chart.ExportingOrientation")
@js.native
object ExportingOrientation extends js.Object {
  //string
  @js.native
  sealed trait Landscape extends ExportingOrientation
  
  //string
  @js.native
  sealed trait Portrait extends ExportingOrientation
  
  /* 1 */ val Landscape: typings.ejDotWebDotAll.ej.datavisualization.Chart.ExportingOrientation.Landscape with Double = js.native
  /* 0 */ val Portrait: typings.ejDotWebDotAll.ej.datavisualization.Chart.ExportingOrientation.Portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingOrientation with Double] = js.native
}

