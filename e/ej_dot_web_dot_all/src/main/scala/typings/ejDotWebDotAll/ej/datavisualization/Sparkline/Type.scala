package typings.ejDotWebDotAll.ej.datavisualization.Sparkline

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Area extends Type
  
  //string
  @js.native
  sealed trait Column extends Type
  
  //string
  @js.native
  sealed trait Line extends Type
  
  //string
  @js.native
  sealed trait Pie extends Type
  
  //string
  @js.native
  sealed trait WinLoss extends Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
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

