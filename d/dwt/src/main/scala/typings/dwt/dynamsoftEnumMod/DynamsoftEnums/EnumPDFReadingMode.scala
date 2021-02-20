package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumPDFReadingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumPDFReadingMode")
@js.native
object EnumPDFReadingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumPDFReadingMode with Double] = js.native
  
  @js.native
  sealed trait PDFRM_AUTO extends EnumPDFReadingMode
  /* 2 */ val PDFRM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumPDFReadingMode.PDFRM_AUTO with Double = js.native
  
  @js.native
  sealed trait PDFRM_RASTER extends EnumPDFReadingMode
  /* 1 */ val PDFRM_RASTER: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumPDFReadingMode.PDFRM_RASTER with Double = js.native
  
  @js.native
  sealed trait PDFRM_VECTOR extends EnumPDFReadingMode
  /* 4 */ val PDFRM_VECTOR: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumPDFReadingMode.PDFRM_VECTOR with Double = js.native
}
