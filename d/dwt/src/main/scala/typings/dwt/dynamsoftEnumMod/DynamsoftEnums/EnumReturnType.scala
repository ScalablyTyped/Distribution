package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumReturnType extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ReturnType")
@js.native
object EnumReturnType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumReturnType with Double] = js.native
  
  @js.native
  sealed trait RT_AUTO extends EnumReturnType
  /* -1 */ @js.native
  object RT_AUTO extends TopLevel[RT_AUTO with Double]
  
  @js.native
  sealed trait RT_BASE64 extends EnumReturnType
  /* 2 */ @js.native
  object RT_BASE64 extends TopLevel[RT_BASE64 with Double]
  
  @js.native
  sealed trait RT_BINARY extends EnumReturnType
  /* 1 */ @js.native
  object RT_BINARY extends TopLevel[RT_BINARY with Double]
}
