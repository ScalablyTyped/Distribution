package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends VerticalAlignment
  
  //string
  @js.native
  sealed trait Middle extends VerticalAlignment
  
  //string
  @js.native
  sealed trait Top extends VerticalAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlignment with Double] = js.native
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 2 */ @js.native
  object Middle extends TopLevel[Middle with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

