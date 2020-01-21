package typings.ejWebAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstHighlightMode")
@js.native
object SunburstHighlightMode extends js.Object {
  //string
  @js.native
  sealed trait All extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Child extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Parent extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Point extends SunburstHighlightMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstHighlightMode with Double] = js.native
  /* 3 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Child extends TopLevel[Child with Double]
  
  /* 1 */ @js.native
  object Parent extends TopLevel[Parent with Double]
  
  /* 0 */ @js.native
  object Point extends TopLevel[Point with Double]
  
}

