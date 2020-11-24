package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumIMResultDataType extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumIMResultDataType")
@js.native
object EnumIMResultDataType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumIMResultDataType with Double] = js.native
  
  @js.native
  sealed trait IMRDT_CONTOUR extends EnumIMResultDataType
  /* 2 */ @js.native
  object IMRDT_CONTOUR extends TopLevel[IMRDT_CONTOUR with Double]
  
  @js.native
  sealed trait IMRDT_IMAGE extends EnumIMResultDataType
  /* 1 */ @js.native
  object IMRDT_IMAGE extends TopLevel[IMRDT_IMAGE with Double]
  
  @js.native
  sealed trait IMRDT_LINESEGMENT extends EnumIMResultDataType
  /* 4 */ @js.native
  object IMRDT_LINESEGMENT extends TopLevel[IMRDT_LINESEGMENT with Double]
  
  @js.native
  sealed trait IMRDT_LOCALIZATIONRESULT extends EnumIMResultDataType
  /* 8 */ @js.native
  object IMRDT_LOCALIZATIONRESULT extends TopLevel[IMRDT_LOCALIZATIONRESULT with Double]
  
  @js.native
  sealed trait IMRDT_QUADRILATERAL extends EnumIMResultDataType
  /* 32 */ @js.native
  object IMRDT_QUADRILATERAL extends TopLevel[IMRDT_QUADRILATERAL with Double]
  
  @js.native
  sealed trait IMRDT_REGIONOFINTEREST extends EnumIMResultDataType
  /* 16 */ @js.native
  object IMRDT_REGIONOFINTEREST extends TopLevel[IMRDT_REGIONOFINTEREST with Double]
}
