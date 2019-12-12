package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.ColumnFacet.Cylinder
import typings.ejDotWebDotAll.ej.datavisualization.Chart.ColumnFacet.Rectangle
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColumnFacet with Double] = js.native
  /* 1 */ @js.native
  object Cylinder extends TopLevel[Cylinder with Double]
  
  /* 0 */ @js.native
  object Rectangle extends TopLevel[Rectangle with Double]
  
}

