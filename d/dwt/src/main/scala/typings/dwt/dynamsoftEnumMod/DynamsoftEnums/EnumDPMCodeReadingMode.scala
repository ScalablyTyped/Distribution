package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDPMCodeReadingMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDPMCodeReadingMode")
@js.native
object EnumDPMCodeReadingMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDPMCodeReadingMode with Double] = js.native
  
  @js.native
  sealed trait DPMCRM_AUTO extends EnumDPMCodeReadingMode
  /* 1 */ @js.native
  object DPMCRM_AUTO extends TopLevel[DPMCRM_AUTO with Double]
  
  @js.native
  sealed trait DPMCRM_GENERAL extends EnumDPMCodeReadingMode
  /* 2 */ @js.native
  object DPMCRM_GENERAL extends TopLevel[DPMCRM_GENERAL with Double]
  
  @js.native
  sealed trait DPMCRM_SKIP extends EnumDPMCodeReadingMode
  /* 0 */ @js.native
  object DPMCRM_SKIP extends TopLevel[DPMCRM_SKIP with Double]
}
