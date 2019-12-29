package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FitMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.FitMode")
@js.native
object FitMode extends js.Object {
  //Used to fit the diagram content based on diagram height.
  @js.native
  sealed trait Height extends FitMode
  
  //Used to fit the diagram content based on page size.
  @js.native
  sealed trait Page extends FitMode
  
  //Used to fit the diagram content based on diagram width.
  @js.native
  sealed trait Width extends FitMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FitMode with Double] = js.native
  /* 2 */ @js.native
  object Height extends TopLevel[Height with Double]
  
  /* 0 */ @js.native
  object Page extends TopLevel[Page with Double]
  
  /* 1 */ @js.native
  object Width extends TopLevel[Width with Double]
  
}

