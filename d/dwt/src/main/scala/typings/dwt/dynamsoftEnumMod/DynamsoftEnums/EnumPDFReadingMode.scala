package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumPDFReadingMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumPDFReadingMode")
@js.native
object EnumPDFReadingMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumPDFReadingMode with Double] = js.native
  
  @js.native
  sealed trait PDFRM_AUTO extends EnumPDFReadingMode
  /* 2 */ @js.native
  object PDFRM_AUTO extends TopLevel[PDFRM_AUTO with Double]
  
  @js.native
  sealed trait PDFRM_RASTER extends EnumPDFReadingMode
  /* 1 */ @js.native
  object PDFRM_RASTER extends TopLevel[PDFRM_RASTER with Double]
  
  @js.native
  sealed trait PDFRM_VECTOR extends EnumPDFReadingMode
  /* 4 */ @js.native
  object PDFRM_VECTOR extends TopLevel[PDFRM_VECTOR with Double]
}
