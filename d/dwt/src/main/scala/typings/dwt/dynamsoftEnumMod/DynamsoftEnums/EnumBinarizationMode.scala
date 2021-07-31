package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBinarizationMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBinarizationMode")
@js.native
object EnumBinarizationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBinarizationMode & Double] = js.native
  
  @js.native
  sealed trait BM_AUTO
    extends StObject
       with EnumBinarizationMode
  /* 1 */ val BM_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBinarizationMode.BM_AUTO & Double = js.native
  
  @js.native
  sealed trait BM_LOCAL_BLOCK
    extends StObject
       with EnumBinarizationMode
  /* 2 */ val BM_LOCAL_BLOCK: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBinarizationMode.BM_LOCAL_BLOCK & Double = js.native
  
  @js.native
  sealed trait BM_SKIP
    extends StObject
       with EnumBinarizationMode
  /* 0 */ val BM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumBinarizationMode.BM_SKIP & Double = js.native
}
