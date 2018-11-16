package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapORientation extends js.Object

/** ICAP_ORIENTATION values. */
@JSGlobal("EnumDWT_CapORientation")
@js.native
object EnumDWT_CapORientation extends js.Object {
  /** 2.0  */
  @js.native
  sealed trait TWOR_AUTO
    extends dwtLib.EnumDWT_CapORientation
  
  /** 2.0  */
  @js.native
  sealed trait TWOR_AUTOPICTURE
    extends dwtLib.EnumDWT_CapORientation
  
  /** 2.0  */
  @js.native
  sealed trait TWOR_AUTOTEXT
    extends dwtLib.EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_LANDSCAPE
    extends dwtLib.EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_PORTRAIT
    extends dwtLib.EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_ROT0
    extends dwtLib.EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_ROT180
    extends dwtLib.EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_ROT270
    extends dwtLib.EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_ROT90
    extends dwtLib.EnumDWT_CapORientation
  
  /* 4 */ val TWOR_AUTO: TWOR_AUTO with scala.Double = js.native
  /* 6 */ val TWOR_AUTOPICTURE: TWOR_AUTOPICTURE with scala.Double = js.native
  /* 5 */ val TWOR_AUTOTEXT: TWOR_AUTOTEXT with scala.Double = js.native
  /* 3 */ val TWOR_LANDSCAPE: TWOR_LANDSCAPE with scala.Double = js.native
  /* 0 */ val TWOR_PORTRAIT: TWOR_PORTRAIT with scala.Double = js.native
  /* 0 */ val TWOR_ROT0: TWOR_ROT0 with scala.Double = js.native
  /* 2 */ val TWOR_ROT180: TWOR_ROT180 with scala.Double = js.native
  /* 3 */ val TWOR_ROT270: TWOR_ROT270 with scala.Double = js.native
  /* 1 */ val TWOR_ROT90: TWOR_ROT90 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapORientation with scala.Double] = js.native
}

