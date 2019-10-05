package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnFacet extends js.Object

@JSGlobal("ej.datavisualization.Chart.ColumnFacet")
@js.native
object ColumnFacet extends js.Object {
  //string
  @js.native
  sealed trait Cylinder extends ColumnFacet
  
  //string
  @js.native
  sealed trait Rectangle extends ColumnFacet
  
  /* 1 */ val Cylinder: typings.ejDotWebDotAll.ej.datavisualization.Chart.ColumnFacet.Cylinder with Double = js.native
  /* 0 */ val Rectangle: typings.ejDotWebDotAll.ej.datavisualization.Chart.ColumnFacet.Rectangle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnFacet with Double] = js.native
}

