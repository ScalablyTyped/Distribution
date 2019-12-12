package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ScrollLimit.Infinite
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ScrollLimit.Limited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScrollLimit extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ScrollLimit")
@js.native
object ScrollLimit extends js.Object {
  //Used to set scrollLimit as Diagram
  @js.native
  sealed trait Diagram extends ScrollLimit
  
  //Used to set scrollLimit as Infinite
  @js.native
  sealed trait Infinite extends ScrollLimit
  
  //Used to set scrollLimit as Limited
  @js.native
  sealed trait Limited extends ScrollLimit
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollLimit with Double] = js.native
  /* 1 */ @js.native
  object Diagram
    extends TopLevel[
          typings.ejDotWebDotAll.ej.datavisualization.Diagram.ScrollLimit.Diagram with Double
        ]
  
  /* 0 */ @js.native
  object Infinite extends TopLevel[Infinite with Double]
  
  /* 2 */ @js.native
  object Limited extends TopLevel[Limited with Double]
  
}

