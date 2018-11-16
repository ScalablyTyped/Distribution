package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_MouseShape extends js.Object

@JSGlobal("EnumDWT_MouseShape")
@js.native
object EnumDWT_MouseShape extends js.Object {
  @js.native
  sealed trait Crosshair
    extends dwtLib.EnumDWT_MouseShape
  
  @js.native
  sealed trait Default
    extends dwtLib.EnumDWT_MouseShape
  
  @js.native
  sealed trait Hand
    extends dwtLib.EnumDWT_MouseShape
  
  @js.native
  sealed trait Zoom
    extends dwtLib.EnumDWT_MouseShape
  
  /* 2 */ val Crosshair: Crosshair with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Hand: Hand with scala.Double = js.native
  /* 3 */ val Zoom: Zoom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_MouseShape with scala.Double] = js.native
}

