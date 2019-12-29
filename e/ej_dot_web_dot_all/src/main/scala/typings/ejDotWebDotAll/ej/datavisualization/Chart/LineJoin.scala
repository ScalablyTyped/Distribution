package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineJoin extends js.Object

@JSGlobal("ej.datavisualization.Chart.LineJoin")
@js.native
object LineJoin extends js.Object {
  //string
  @js.native
  sealed trait Bevel extends LineJoin
  
  //string
  @js.native
  sealed trait Miter extends LineJoin
  
  //string
  @js.native
  sealed trait Round extends LineJoin
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineJoin with Double] = js.native
  /* 1 */ @js.native
  object Bevel extends TopLevel[Bevel with Double]
  
  /* 2 */ @js.native
  object Miter extends TopLevel[Miter with Double]
  
  /* 0 */ @js.native
  object Round extends TopLevel[Round with Double]
  
}

