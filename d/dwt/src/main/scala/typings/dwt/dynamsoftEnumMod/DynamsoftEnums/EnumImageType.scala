package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumImageType extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ImageType")
@js.native
object EnumImageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImageType with Double] = js.native
  
  @js.native
  sealed trait IT_ALL extends EnumImageType
  /* 5 */ @js.native
  object IT_ALL extends TopLevel[IT_ALL with Double]
  
  @js.native
  sealed trait IT_BMP extends EnumImageType
  /* 0 */ @js.native
  object IT_BMP extends TopLevel[IT_BMP with Double]
  
  @js.native
  sealed trait IT_DIB extends EnumImageType
  /* -1 */ @js.native
  object IT_DIB extends TopLevel[IT_DIB with Double]
  
  @js.native
  sealed trait IT_JPG extends EnumImageType
  /* 1 */ @js.native
  object IT_JPG extends TopLevel[IT_JPG with Double]
  
  @js.native
  sealed trait IT_PNG extends EnumImageType
  /* 3 */ @js.native
  object IT_PNG extends TopLevel[IT_PNG with Double]
  
  @js.native
  sealed trait IT_RGBA extends EnumImageType
  /* -2 */ @js.native
  object IT_RGBA extends TopLevel[IT_RGBA with Double]
}
