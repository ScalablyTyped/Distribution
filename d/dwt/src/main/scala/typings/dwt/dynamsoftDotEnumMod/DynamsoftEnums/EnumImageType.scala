package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumImageType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.Enum_ImageType")
@js.native
object EnumImageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumImageType & Double] = js.native
  
  @js.native
  sealed trait IT_ALL
    extends StObject
       with EnumImageType
  /* 5 */ val IT_ALL: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImageType.IT_ALL & Double = js.native
  
  @js.native
  sealed trait IT_BMP
    extends StObject
       with EnumImageType
  /* 0 */ val IT_BMP: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImageType.IT_BMP & Double = js.native
  
  @js.native
  sealed trait IT_DIB
    extends StObject
       with EnumImageType
  /* -1 */ val IT_DIB: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImageType.IT_DIB & Double = js.native
  
  @js.native
  sealed trait IT_JPG
    extends StObject
       with EnumImageType
  /* 1 */ val IT_JPG: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImageType.IT_JPG & Double = js.native
  
  @js.native
  sealed trait IT_PNG
    extends StObject
       with EnumImageType
  /* 3 */ val IT_PNG: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImageType.IT_PNG & Double = js.native
  
  @js.native
  sealed trait IT_RGBA
    extends StObject
       with EnumImageType
  /* -2 */ val IT_RGBA: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumImageType.IT_RGBA & Double = js.native
}
