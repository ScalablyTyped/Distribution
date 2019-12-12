package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Bottom
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Left
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Right
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.OuterCustomLabelPosition.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OuterCustomLabelPosition extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.OuterCustomLabelPosition")
@js.native
object OuterCustomLabelPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Left extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Right extends OuterCustomLabelPosition
  
  //string
  @js.native
  sealed trait Top extends OuterCustomLabelPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OuterCustomLabelPosition with Double] = js.native
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 3 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

