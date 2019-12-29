package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAnchor extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TextAnchor")
@js.native
object TextAnchor extends js.Object {
  //string
  @js.native
  sealed trait End extends TextAnchor
  
  //string
  @js.native
  sealed trait Middle extends TextAnchor
  
  //string
  @js.native
  sealed trait Start extends TextAnchor
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAnchor with Double] = js.native
  /* 2 */ @js.native
  object End extends TopLevel[End with Double]
  
  /* 1 */ @js.native
  object Middle extends TopLevel[Middle with Double]
  
  /* 0 */ @js.native
  object Start extends TopLevel[Start with Double]
  
}

