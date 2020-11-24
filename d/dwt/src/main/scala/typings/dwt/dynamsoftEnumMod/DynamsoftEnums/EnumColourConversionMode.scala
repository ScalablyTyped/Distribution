package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumColourConversionMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumColourConversionMode")
@js.native
object EnumColourConversionMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumColourConversionMode with Double] = js.native
  
  @js.native
  sealed trait CICM_GENERAL extends EnumColourConversionMode
  /* 1 */ @js.native
  object CICM_GENERAL extends TopLevel[CICM_GENERAL with Double]
  
  @js.native
  sealed trait CICM_SKIP extends EnumColourConversionMode
  /* 0 */ @js.native
  object CICM_SKIP extends TopLevel[CICM_SKIP with Double]
}
