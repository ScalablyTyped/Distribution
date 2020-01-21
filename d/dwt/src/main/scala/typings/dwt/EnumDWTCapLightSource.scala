package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTCapLightSource extends js.Object

/** ICAP_LIGHTSOURCE values. */
@JSGlobal("EnumDWT_CapLightSource")
@js.native
object EnumDWTCapLightSource extends js.Object {
  @js.native
  sealed trait TWLS_BLUE extends EnumDWTCapLightSource
  
  @js.native
  sealed trait TWLS_GREEN extends EnumDWTCapLightSource
  
  @js.native
  sealed trait TWLS_IR extends EnumDWTCapLightSource
  
  @js.native
  sealed trait TWLS_NONE extends EnumDWTCapLightSource
  
  @js.native
  sealed trait TWLS_RED extends EnumDWTCapLightSource
  
  @js.native
  sealed trait TWLS_UV extends EnumDWTCapLightSource
  
  @js.native
  sealed trait TWLS_WHITE extends EnumDWTCapLightSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapLightSource with Double] = js.native
  /* 2 */ @js.native
  object TWLS_BLUE extends TopLevel[TWLS_BLUE with Double]
  
  /* 1 */ @js.native
  object TWLS_GREEN extends TopLevel[TWLS_GREEN with Double]
  
  /* 6 */ @js.native
  object TWLS_IR extends TopLevel[TWLS_IR with Double]
  
  /* 3 */ @js.native
  object TWLS_NONE extends TopLevel[TWLS_NONE with Double]
  
  /* 0 */ @js.native
  object TWLS_RED extends TopLevel[TWLS_RED with Double]
  
  /* 5 */ @js.native
  object TWLS_UV extends TopLevel[TWLS_UV with Double]
  
  /* 4 */ @js.native
  object TWLS_WHITE extends TopLevel[TWLS_WHITE with Double]
  
}

