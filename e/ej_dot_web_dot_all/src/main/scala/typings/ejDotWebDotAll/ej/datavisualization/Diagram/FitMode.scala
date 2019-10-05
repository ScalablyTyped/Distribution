package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  
  /* 2 */ val Height: typings.ejDotWebDotAll.ej.datavisualization.Diagram.FitMode.Height with Double = js.native
  /* 0 */ val Page: typings.ejDotWebDotAll.ej.datavisualization.Diagram.FitMode.Page with Double = js.native
  /* 1 */ val Width: typings.ejDotWebDotAll.ej.datavisualization.Diagram.FitMode.Width with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FitMode with Double] = js.native
}

