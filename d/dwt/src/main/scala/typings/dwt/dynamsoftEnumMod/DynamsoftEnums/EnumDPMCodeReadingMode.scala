package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDPMCodeReadingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDPMCodeReadingMode")
@js.native
object EnumDPMCodeReadingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDPMCodeReadingMode with Double] = js.native
  
  @js.native
  sealed trait DPMCRM_AUTO extends EnumDPMCodeReadingMode
  /* 1 */ val DPMCRM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDPMCodeReadingMode.DPMCRM_AUTO with Double = js.native
  
  @js.native
  sealed trait DPMCRM_GENERAL extends EnumDPMCodeReadingMode
  /* 2 */ val DPMCRM_GENERAL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDPMCodeReadingMode.DPMCRM_GENERAL with Double = js.native
  
  @js.native
  sealed trait DPMCRM_SKIP extends EnumDPMCodeReadingMode
  /* 0 */ val DPMCRM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDPMCodeReadingMode.DPMCRM_SKIP with Double = js.native
}
