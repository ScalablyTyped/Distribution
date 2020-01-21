package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalTextAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.HorizontalTextAlignment")
@js.native
object HorizontalTextAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends HorizontalTextAlignment
  
  //string
  @js.native
  sealed trait Far extends HorizontalTextAlignment
  
  //string
  @js.native
  sealed trait Near extends HorizontalTextAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalTextAlignment with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 1 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}

