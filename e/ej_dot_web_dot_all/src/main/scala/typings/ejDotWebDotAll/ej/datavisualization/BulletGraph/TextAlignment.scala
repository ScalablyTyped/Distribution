package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextAlignment.Center
import typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextAlignment.Far
import typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextAlignment.Near
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends TextAlignment
  
  //string
  @js.native
  sealed trait Far extends TextAlignment
  
  //string
  @js.native
  sealed trait Near extends TextAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 0 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}

