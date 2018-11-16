package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapLightSource extends js.Object

/** ICAP_LIGHTSOURCE values. */
@JSGlobal("EnumDWT_CapLightSource")
@js.native
object EnumDWT_CapLightSource extends js.Object {
  @js.native
  sealed trait TWLS_BLUE
    extends dwtLib.EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_GREEN
    extends dwtLib.EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_IR
    extends dwtLib.EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_NONE
    extends dwtLib.EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_RED
    extends dwtLib.EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_UV
    extends dwtLib.EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_WHITE
    extends dwtLib.EnumDWT_CapLightSource
  
  /* 2 */ val TWLS_BLUE: TWLS_BLUE with scala.Double = js.native
  /* 1 */ val TWLS_GREEN: TWLS_GREEN with scala.Double = js.native
  /* 6 */ val TWLS_IR: TWLS_IR with scala.Double = js.native
  /* 3 */ val TWLS_NONE: TWLS_NONE with scala.Double = js.native
  /* 0 */ val TWLS_RED: TWLS_RED with scala.Double = js.native
  /* 5 */ val TWLS_UV: TWLS_UV with scala.Double = js.native
  /* 4 */ val TWLS_WHITE: TWLS_WHITE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_CapLightSource with scala.Double] = js.native
}

