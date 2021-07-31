package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTFitWindowType extends StObject
/** Fit window type */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_FitWindowType")
@js.native
object EnumDWTFitWindowType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTFitWindowType & Double] = js.native
  
  /** Fit the image to the width and height of the window */
  @js.native
  sealed trait enumFitWindow
    extends StObject
       with EnumDWTFitWindowType
  /* 0 */ val enumFitWindow: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFitWindowType.enumFitWindow & Double = js.native
  
  /** Fit the image to the height of the window */
  @js.native
  sealed trait enumFitWindowHeight
    extends StObject
       with EnumDWTFitWindowType
  /* 1 */ val enumFitWindowHeight: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFitWindowType.enumFitWindowHeight & Double = js.native
  
  /** Fit the image to the width of the window */
  @js.native
  sealed trait enumFitWindowWidth
    extends StObject
       with EnumDWTFitWindowType
  /* 2 */ val enumFitWindowWidth: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTFitWindowType.enumFitWindowWidth & Double = js.native
}
