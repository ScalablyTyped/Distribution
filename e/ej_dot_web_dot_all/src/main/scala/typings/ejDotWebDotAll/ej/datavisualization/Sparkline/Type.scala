package typings.ejDotWebDotAll.ej.datavisualization.Sparkline

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Area
import typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Column
import typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Line
import typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.Pie
import typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type.WinLoss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.datavisualization.Sparkline.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Column
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Line
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait Pie
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  //string
  @js.native
  sealed trait WinLoss
    extends typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.Sparkline.Type with Double] = js.native
  /* 0 */ @js.native
  object Area extends TopLevel[Area with Double]
  
  /* 2 */ @js.native
  object Column extends TopLevel[Column with Double]
  
  /* 1 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  /* 3 */ @js.native
  object Pie extends TopLevel[Pie with Double]
  
  /* 4 */ @js.native
  object WinLoss extends TopLevel[WinLoss with Double]
  
}

