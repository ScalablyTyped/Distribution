package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumBinarizationMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumBinarizationMode")
@js.native
object EnumBinarizationMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumBinarizationMode with Double] = js.native
  
  @js.native
  sealed trait BM_AUTO extends EnumBinarizationMode
  /* 1 */ @js.native
  object BM_AUTO extends TopLevel[BM_AUTO with Double]
  
  @js.native
  sealed trait BM_LOCAL_BLOCK extends EnumBinarizationMode
  /* 2 */ @js.native
  object BM_LOCAL_BLOCK extends TopLevel[BM_LOCAL_BLOCK with Double]
  
  @js.native
  sealed trait BM_SKIP extends EnumBinarizationMode
  /* 0 */ @js.native
  object BM_SKIP extends TopLevel[BM_SKIP with Double]
}
