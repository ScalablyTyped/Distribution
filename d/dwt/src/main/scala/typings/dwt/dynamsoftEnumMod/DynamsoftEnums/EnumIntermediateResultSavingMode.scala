package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumIntermediateResultSavingMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumIntermediateResultSavingMode")
@js.native
object EnumIntermediateResultSavingMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumIntermediateResultSavingMode with Double] = js.native
  
  @js.native
  sealed trait IRSM_BOTH extends EnumIntermediateResultSavingMode
  /* 4 */ val IRSM_BOTH: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumIntermediateResultSavingMode.IRSM_BOTH with Double = js.native
  
  @js.native
  sealed trait IRSM_FILESYSTEM extends EnumIntermediateResultSavingMode
  /* 2 */ val IRSM_FILESYSTEM: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumIntermediateResultSavingMode.IRSM_FILESYSTEM with Double = js.native
  
  @js.native
  sealed trait IRSM_MEMORY extends EnumIntermediateResultSavingMode
  /* 1 */ val IRSM_MEMORY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumIntermediateResultSavingMode.IRSM_MEMORY with Double = js.native
}
