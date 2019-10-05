package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

@JSGlobal("ej.TextAlign")
@js.native
object TextAlign extends js.Object {
  //string
  @js.native
  sealed trait Center extends TextAlign
  
  //string
  @js.native
  sealed trait Justify extends TextAlign
  
  //string
  @js.native
  sealed trait Left extends TextAlign
  
  //string
  @js.native
  sealed trait Right extends TextAlign
  
  /* 0 */ val Center: typings.ejDotWebDotAll.ej.TextAlign.Center with Double = js.native
  /* 1 */ val Justify: typings.ejDotWebDotAll.ej.TextAlign.Justify with Double = js.native
  /* 2 */ val Left: typings.ejDotWebDotAll.ej.TextAlign.Left with Double = js.native
  /* 3 */ val Right: typings.ejDotWebDotAll.ej.TextAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlign with Double] = js.native
}

