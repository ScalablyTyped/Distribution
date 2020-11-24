package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTConvertMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ConvertMode")
@js.native
object EnumDWTConvertMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTConvertMode with Double] = js.native
  
  @js.native
  sealed trait CM_DEFAULT extends EnumDWTConvertMode
  /* 0 */ @js.native
  object CM_DEFAULT extends TopLevel[CM_DEFAULT with Double]
  
  @js.native
  sealed trait CM_RENDERALL extends EnumDWTConvertMode
  /* 1 */ @js.native
  object CM_RENDERALL extends TopLevel[CM_RENDERALL with Double]
}
