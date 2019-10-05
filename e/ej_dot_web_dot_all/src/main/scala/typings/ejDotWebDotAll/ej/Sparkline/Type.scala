package typings.ejDotWebDotAll.ej.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Sparkline.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends typings.ejDotWebDotAll.ej.Sparkline.Type
  
  //string
  @js.native
  sealed trait Column
    extends typings.ejDotWebDotAll.ej.Sparkline.Type
  
  //string
  @js.native
  sealed trait Line
    extends typings.ejDotWebDotAll.ej.Sparkline.Type
  
  //string
  @js.native
  sealed trait Pie
    extends typings.ejDotWebDotAll.ej.Sparkline.Type
  
  //string
  @js.native
  sealed trait WinLoss
    extends typings.ejDotWebDotAll.ej.Sparkline.Type
  
  /* 0 */ val Area: typings.ejDotWebDotAll.ej.Sparkline.Type.Area with Double = js.native
  /* 2 */ val Column: typings.ejDotWebDotAll.ej.Sparkline.Type.Column with Double = js.native
  /* 1 */ val Line: typings.ejDotWebDotAll.ej.Sparkline.Type.Line with Double = js.native
  /* 3 */ val Pie: typings.ejDotWebDotAll.ej.Sparkline.Type.Pie with Double = js.native
  /* 4 */ val WinLoss: typings.ejDotWebDotAll.ej.Sparkline.Type.WinLoss with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Sparkline.Type with Double] = js.native
}

