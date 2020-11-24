package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumIntermediateResultSavingMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumIntermediateResultSavingMode")
@js.native
object EnumIntermediateResultSavingMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumIntermediateResultSavingMode with Double] = js.native
  
  @js.native
  sealed trait IRSM_BOTH extends EnumIntermediateResultSavingMode
  /* 4 */ @js.native
  object IRSM_BOTH extends TopLevel[IRSM_BOTH with Double]
  
  @js.native
  sealed trait IRSM_FILESYSTEM extends EnumIntermediateResultSavingMode
  /* 2 */ @js.native
  object IRSM_FILESYSTEM extends TopLevel[IRSM_FILESYSTEM with Double]
  
  @js.native
  sealed trait IRSM_MEMORY extends EnumIntermediateResultSavingMode
  /* 1 */ @js.native
  object IRSM_MEMORY extends TopLevel[IRSM_MEMORY with Double]
}
