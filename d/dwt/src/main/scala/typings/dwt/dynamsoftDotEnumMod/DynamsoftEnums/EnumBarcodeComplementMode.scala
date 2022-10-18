package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBarcodeComplementMode extends StObject
/** Barcode Complement Mode */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBarcodeComplementMode")
@js.native
object EnumBarcodeComplementMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBarcodeComplementMode & Double] = js.native
  
  @js.native
  sealed trait BCM_AUTO
    extends StObject
       with EnumBarcodeComplementMode
  /* 1 */ val BCM_AUTO: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeComplementMode.BCM_AUTO & Double = js.native
  
  @js.native
  sealed trait BCM_GENERAL
    extends StObject
       with EnumBarcodeComplementMode
  /* 2 */ val BCM_GENERAL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeComplementMode.BCM_GENERAL & Double = js.native
  
  @js.native
  sealed trait BCM_SKIP
    extends StObject
       with EnumBarcodeComplementMode
  /* 0 */ val BCM_SKIP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumBarcodeComplementMode.BCM_SKIP & Double = js.native
}
