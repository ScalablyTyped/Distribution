package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingOrientation with Double] = js.native
  /* 1 */ @js.native
  object Landscape extends TopLevel[Landscape with Double]
  
  /* 0 */ @js.native
  object Portrait extends TopLevel[Portrait with Double]
  
}

