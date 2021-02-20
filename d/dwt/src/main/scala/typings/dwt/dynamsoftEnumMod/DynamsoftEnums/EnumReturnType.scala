package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumReturnType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ReturnType")
@js.native
object EnumReturnType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumReturnType with Double] = js.native
  
  @js.native
  sealed trait RT_AUTO extends EnumReturnType
  /* -1 */ val RT_AUTO: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumReturnType.RT_AUTO with Double = js.native
  
  @js.native
  sealed trait RT_BASE64 extends EnumReturnType
  /* 2 */ val RT_BASE64: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumReturnType.RT_BASE64 with Double = js.native
  
  @js.native
  sealed trait RT_BINARY extends EnumReturnType
  /* 1 */ val RT_BINARY: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumReturnType.RT_BINARY with Double = js.native
}
