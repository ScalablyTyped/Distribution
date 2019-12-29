package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Left extends HorizontalAlignment
  
  //string
  @js.native
  sealed trait Middle extends HorizontalAlignment
  
  //string
  @js.native
  sealed trait Right extends HorizontalAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Middle extends TopLevel[Middle with Double]
  
  /* 1 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

