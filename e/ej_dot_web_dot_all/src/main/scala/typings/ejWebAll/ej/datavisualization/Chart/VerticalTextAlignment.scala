package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalTextAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.VerticalTextAlignment")
@js.native
object VerticalTextAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends VerticalTextAlignment
  
  //string
  @js.native
  sealed trait Far extends VerticalTextAlignment
  
  //string
  @js.native
  sealed trait Near extends VerticalTextAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalTextAlignment with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 1 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}

