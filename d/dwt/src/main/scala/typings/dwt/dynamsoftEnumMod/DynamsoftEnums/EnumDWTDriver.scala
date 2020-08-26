package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTDriver extends js.Object

/**
  * Driver Type
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_Driver")
@js.native
object EnumDWTDriver extends js.Object {
  @js.native
  sealed trait ICA extends EnumDWTDriver
  
  @js.native
  sealed trait SANE extends EnumDWTDriver
  
  @js.native
  sealed trait TWAIN extends EnumDWTDriver
  
  @js.native
  sealed trait TWAIN_AND_ICA extends EnumDWTDriver
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDriver with Double] = js.native
  /* 3 */ @js.native
  object ICA extends TopLevel[ICA with Double]
  
  /* 3 */ @js.native
  object SANE extends TopLevel[SANE with Double]
  
  /* 0 */ @js.native
  object TWAIN extends TopLevel[TWAIN with Double]
  
  /* 4 */ @js.native
  object TWAIN_AND_ICA extends TopLevel[TWAIN_AND_ICA with Double]
  
}

