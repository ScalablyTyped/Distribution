package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextOverflow with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Trim extends TopLevel[Trim with Double]
  
  /* 2 */ @js.native
  object Wrap extends TopLevel[Wrap with Double]
  
  /* 3 */ @js.native
  object WrapAndTrim extends TopLevel[WrapAndTrim with Double]
  
}

