package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDPMCodeReadingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDPMCodeReadingMode")
@js.native
object EnumDPMCodeReadingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDPMCodeReadingMode & Double] = js.native
  
  @js.native
  sealed trait DPMCRM_AUTO
    extends StObject
       with EnumDPMCodeReadingMode
  /* 1 */ val DPMCRM_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDPMCodeReadingMode.DPMCRM_AUTO & Double = js.native
  
  @js.native
  sealed trait DPMCRM_GENERAL
    extends StObject
       with EnumDPMCodeReadingMode
  /* 2 */ val DPMCRM_GENERAL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDPMCodeReadingMode.DPMCRM_GENERAL & Double = js.native
  
  @js.native
  sealed trait DPMCRM_SKIP
    extends StObject
       with EnumDPMCodeReadingMode
  /* 0 */ val DPMCRM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDPMCodeReadingMode.DPMCRM_SKIP & Double = js.native
}
