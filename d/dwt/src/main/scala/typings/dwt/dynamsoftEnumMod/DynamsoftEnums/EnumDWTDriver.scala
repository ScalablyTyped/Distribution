package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTDriver extends js.Object
/**
  * Driver Type
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_Driver")
@js.native
object EnumDWTDriver extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDriver with Double] = js.native
  
  @js.native
  sealed trait ICA extends EnumDWTDriver
  /* 3 */ @js.native
  object ICA extends TopLevel[ICA with Double]
  
  @js.native
  sealed trait SANE extends EnumDWTDriver
  /* 3 */ @js.native
  object SANE extends TopLevel[SANE with Double]
  
  @js.native
  sealed trait TWAIN extends EnumDWTDriver
  /* 0 */ @js.native
  object TWAIN extends TopLevel[TWAIN with Double]
  
  @js.native
  sealed trait TWAIN64 extends EnumDWTDriver
  /* 5 */ @js.native
  object TWAIN64 extends TopLevel[TWAIN64 with Double]
  
  @js.native
  sealed trait TWAIN_AND_ICA extends EnumDWTDriver
  /* 4 */ @js.native
  object TWAIN_AND_ICA extends TopLevel[TWAIN_AND_ICA with Double]
  
  @js.native
  sealed trait TWAIN_AND_TWAIN64 extends EnumDWTDriver
  /* 4 */ @js.native
  object TWAIN_AND_TWAIN64 extends TopLevel[TWAIN_AND_TWAIN64 with Double]
}
