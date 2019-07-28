package typings.dwt

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
  sealed trait TWLS_BLUE extends EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_GREEN extends EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_IR extends EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_NONE extends EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_RED extends EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_UV extends EnumDWT_CapLightSource
  
  @js.native
  sealed trait TWLS_WHITE extends EnumDWT_CapLightSource
  
  /* 2 */ val TWLS_BLUE: typings.dwt.EnumDWT_CapLightSource.TWLS_BLUE with Double = js.native
  /* 1 */ val TWLS_GREEN: typings.dwt.EnumDWT_CapLightSource.TWLS_GREEN with Double = js.native
  /* 6 */ val TWLS_IR: typings.dwt.EnumDWT_CapLightSource.TWLS_IR with Double = js.native
  /* 3 */ val TWLS_NONE: typings.dwt.EnumDWT_CapLightSource.TWLS_NONE with Double = js.native
  /* 0 */ val TWLS_RED: typings.dwt.EnumDWT_CapLightSource.TWLS_RED with Double = js.native
  /* 5 */ val TWLS_UV: typings.dwt.EnumDWT_CapLightSource.TWLS_UV with Double = js.native
  /* 4 */ val TWLS_WHITE: typings.dwt.EnumDWT_CapLightSource.TWLS_WHITE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapLightSource with Double] = js.native
}

