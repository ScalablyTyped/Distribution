package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumPDFReadingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumPDFReadingMode")
@js.native
object EnumPDFReadingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumPDFReadingMode & Double] = js.native
  
  @js.native
  sealed trait PDFRM_AUTO
    extends StObject
       with EnumPDFReadingMode
  /* 2 */ val PDFRM_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumPDFReadingMode.PDFRM_AUTO & Double = js.native
  
  @js.native
  sealed trait PDFRM_RASTER
    extends StObject
       with EnumPDFReadingMode
  /* 1 */ val PDFRM_RASTER: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumPDFReadingMode.PDFRM_RASTER & Double = js.native
  
  @js.native
  sealed trait PDFRM_VECTOR
    extends StObject
       with EnumPDFReadingMode
  /* 4 */ val PDFRM_VECTOR: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumPDFReadingMode.PDFRM_VECTOR & Double = js.native
}
