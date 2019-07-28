package typings.dwt

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
  sealed trait TWOR_AUTO extends EnumDWT_CapORientation
  
  /** 2.0  */
  @js.native
  sealed trait TWOR_AUTOPICTURE extends EnumDWT_CapORientation
  
  /** 2.0  */
  @js.native
  sealed trait TWOR_AUTOTEXT extends EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_LANDSCAPE extends EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_PORTRAIT extends EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_ROT0 extends EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_ROT180 extends EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_ROT270 extends EnumDWT_CapORientation
  
  @js.native
  sealed trait TWOR_ROT90 extends EnumDWT_CapORientation
  
  /* 4 */ val TWOR_AUTO: typings.dwt.EnumDWT_CapORientation.TWOR_AUTO with Double = js.native
  /* 6 */ val TWOR_AUTOPICTURE: typings.dwt.EnumDWT_CapORientation.TWOR_AUTOPICTURE with Double = js.native
  /* 5 */ val TWOR_AUTOTEXT: typings.dwt.EnumDWT_CapORientation.TWOR_AUTOTEXT with Double = js.native
  /* 3 */ val TWOR_LANDSCAPE: typings.dwt.EnumDWT_CapORientation.TWOR_LANDSCAPE with Double = js.native
  /* 0 */ val TWOR_PORTRAIT: typings.dwt.EnumDWT_CapORientation.TWOR_PORTRAIT with Double = js.native
  /* 0 */ val TWOR_ROT0: typings.dwt.EnumDWT_CapORientation.TWOR_ROT0 with Double = js.native
  /* 2 */ val TWOR_ROT180: typings.dwt.EnumDWT_CapORientation.TWOR_ROT180 with Double = js.native
  /* 3 */ val TWOR_ROT270: typings.dwt.EnumDWT_CapORientation.TWOR_ROT270 with Double = js.native
  /* 1 */ val TWOR_ROT90: typings.dwt.EnumDWT_CapORientation.TWOR_ROT90 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapORientation with Double] = js.native
}

