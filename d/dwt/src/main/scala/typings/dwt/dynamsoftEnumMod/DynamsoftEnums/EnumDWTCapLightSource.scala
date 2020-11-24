package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTCapLightSource extends js.Object
/** ICAP_LIGHTSOURCE values. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_CapLightSource")
@js.native
object EnumDWTCapLightSource extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTCapLightSource with Double] = js.native
  
  @js.native
  sealed trait TWLS_BLUE extends EnumDWTCapLightSource
  /* 2 */ @js.native
  object TWLS_BLUE extends TopLevel[TWLS_BLUE with Double]
  
  @js.native
  sealed trait TWLS_GREEN extends EnumDWTCapLightSource
  /* 1 */ @js.native
  object TWLS_GREEN extends TopLevel[TWLS_GREEN with Double]
  
  @js.native
  sealed trait TWLS_IR extends EnumDWTCapLightSource
  /* 6 */ @js.native
  object TWLS_IR extends TopLevel[TWLS_IR with Double]
  
  @js.native
  sealed trait TWLS_NONE extends EnumDWTCapLightSource
  /* 3 */ @js.native
  object TWLS_NONE extends TopLevel[TWLS_NONE with Double]
  
  @js.native
  sealed trait TWLS_RED extends EnumDWTCapLightSource
  /* 0 */ @js.native
  object TWLS_RED extends TopLevel[TWLS_RED with Double]
  
  @js.native
  sealed trait TWLS_UV extends EnumDWTCapLightSource
  /* 5 */ @js.native
  object TWLS_UV extends TopLevel[TWLS_UV with Double]
  
  @js.native
  sealed trait TWLS_WHITE extends EnumDWTCapLightSource
  /* 4 */ @js.native
  object TWLS_WHITE extends TopLevel[TWLS_WHITE with Double]
}
