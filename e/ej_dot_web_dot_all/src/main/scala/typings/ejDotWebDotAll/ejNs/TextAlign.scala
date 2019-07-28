package typings.ejDotWebDotAll.ejNs

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
  
  /* 0 */ val Center: typings.ejDotWebDotAll.ejNs.TextAlign.Center with Double = js.native
  /* 1 */ val Justify: typings.ejDotWebDotAll.ejNs.TextAlign.Justify with Double = js.native
  /* 2 */ val Left: typings.ejDotWebDotAll.ejNs.TextAlign.Left with Double = js.native
  /* 3 */ val Right: typings.ejDotWebDotAll.ejNs.TextAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlign with Double] = js.native
}

