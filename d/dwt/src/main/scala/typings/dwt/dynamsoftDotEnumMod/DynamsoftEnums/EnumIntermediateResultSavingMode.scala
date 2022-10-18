package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumIntermediateResultSavingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumIntermediateResultSavingMode")
@js.native
object EnumIntermediateResultSavingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumIntermediateResultSavingMode & Double] = js.native
  
  @js.native
  sealed trait IRSM_BOTH
    extends StObject
       with EnumIntermediateResultSavingMode
  /* 4 */ val IRSM_BOTH: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIntermediateResultSavingMode.IRSM_BOTH & Double = js.native
  
  @js.native
  sealed trait IRSM_FILESYSTEM
    extends StObject
       with EnumIntermediateResultSavingMode
  /* 2 */ val IRSM_FILESYSTEM: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIntermediateResultSavingMode.IRSM_FILESYSTEM & Double = js.native
  
  @js.native
  sealed trait IRSM_MEMORY
    extends StObject
       with EnumIntermediateResultSavingMode
  /* 1 */ val IRSM_MEMORY: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIntermediateResultSavingMode.IRSM_MEMORY & Double = js.native
}
