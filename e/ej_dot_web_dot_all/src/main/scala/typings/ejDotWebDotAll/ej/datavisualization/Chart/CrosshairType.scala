package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrosshairType extends js.Object

@JSGlobal("ej.datavisualization.Chart.CrosshairType")
@js.native
object CrosshairType extends js.Object {
  //string
  @js.native
  sealed trait Crosshair extends CrosshairType
  
  //string
  @js.native
  sealed trait Trackball extends CrosshairType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CrosshairType with Double] = js.native
  /* 0 */ @js.native
  object Crosshair
    extends TopLevel[
          typings.ejDotWebDotAll.ej.datavisualization.Chart.CrosshairType.Crosshair with Double
        ]
  
  /* 1 */ @js.native
  object Trackball extends TopLevel[Trackball with Double]
  
}

