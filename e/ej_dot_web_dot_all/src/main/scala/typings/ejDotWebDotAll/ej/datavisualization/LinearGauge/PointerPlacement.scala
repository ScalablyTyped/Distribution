package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerPlacement extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.PointerPlacement")
@js.native
object PointerPlacement extends js.Object {
  //string
  @js.native
  sealed trait Center extends PointerPlacement
  
  //string
  @js.native
  sealed trait Far extends PointerPlacement
  
  //string
  @js.native
  sealed trait Near extends PointerPlacement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerPlacement with Double] = js.native
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 0 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}

