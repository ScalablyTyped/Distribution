package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextOverflow extends js.Object

@JSGlobal("ej.datavisualization.Chart.TextOverflow")
@js.native
object TextOverflow extends js.Object {
  //string
  @js.native
  sealed trait None extends TextOverflow
  
  //string
  @js.native
  sealed trait Trim extends TextOverflow
  
  //string
  @js.native
  sealed trait Wrap extends TextOverflow
  
  //string
  @js.native
  sealed trait WrapAndTrim extends TextOverflow
  
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextOverflow.None with Double = js.native
  /* 1 */ val Trim: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextOverflow.Trim with Double = js.native
  /* 2 */ val Wrap: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextOverflow.Wrap with Double = js.native
  /* 3 */ val WrapAndTrim: typings.ejDotWebDotAll.ej.datavisualization.Chart.TextOverflow.WrapAndTrim with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextOverflow with Double] = js.native
}

