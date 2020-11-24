package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumConflictMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumConflictMode")
@js.native
object EnumConflictMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumConflictMode with Double] = js.native
  
  @js.native
  sealed trait CM_IGNORE extends EnumConflictMode
  /* 1 */ @js.native
  object CM_IGNORE extends TopLevel[CM_IGNORE with Double]
  
  @js.native
  sealed trait CM_OVERWRITE extends EnumConflictMode
  /* 2 */ @js.native
  object CM_OVERWRITE extends TopLevel[CM_OVERWRITE with Double]
}
