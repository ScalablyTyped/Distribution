package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Map.DockPosition.Bottom
import typings.ejDotWebDotAll.ej.datavisualization.Map.DockPosition.Left
import typings.ejDotWebDotAll.ej.datavisualization.Map.DockPosition.Right
import typings.ejDotWebDotAll.ej.datavisualization.Map.DockPosition.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DockPosition extends js.Object

@JSGlobal("ej.datavisualization.Map.DockPosition")
@js.native
object DockPosition extends js.Object {
  //specifies the bottom position
  @js.native
  sealed trait Bottom extends DockPosition
  
  //specifies the left position
  @js.native
  sealed trait Left extends DockPosition
  
  //specifies the bottom position
  @js.native
  sealed trait Right extends DockPosition
  
  //specifies the top position
  @js.native
  sealed trait Top extends DockPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DockPosition with Double] = js.native
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 3 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

