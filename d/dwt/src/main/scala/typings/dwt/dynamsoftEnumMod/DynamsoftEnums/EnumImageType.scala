package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumImageType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ImageType")
@js.native
object EnumImageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImageType with Double] = js.native
  
  @js.native
  sealed trait IT_ALL extends EnumImageType
  /* 5 */ val IT_ALL: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImageType.IT_ALL with Double = js.native
  
  @js.native
  sealed trait IT_BMP extends EnumImageType
  /* 0 */ val IT_BMP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImageType.IT_BMP with Double = js.native
  
  @js.native
  sealed trait IT_DIB extends EnumImageType
  /* -1 */ val IT_DIB: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImageType.IT_DIB with Double = js.native
  
  @js.native
  sealed trait IT_JPG extends EnumImageType
  /* 1 */ val IT_JPG: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImageType.IT_JPG with Double = js.native
  
  @js.native
  sealed trait IT_PNG extends EnumImageType
  /* 3 */ val IT_PNG: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImageType.IT_PNG with Double = js.native
  
  @js.native
  sealed trait IT_RGBA extends EnumImageType
  /* -2 */ val IT_RGBA: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumImageType.IT_RGBA with Double = js.native
}
