package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextResultOrderMode extends js.Object
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextResultOrderMode")
@js.native
object EnumTextResultOrderMode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextResultOrderMode with Double] = js.native
  
  @js.native
  sealed trait TROM_CONFIDENCE extends EnumTextResultOrderMode
  /* 1 */ @js.native
  object TROM_CONFIDENCE extends TopLevel[TROM_CONFIDENCE with Double]
  
  @js.native
  sealed trait TROM_FORMAT extends EnumTextResultOrderMode
  /* 4 */ @js.native
  object TROM_FORMAT extends TopLevel[TROM_FORMAT with Double]
  
  @js.native
  sealed trait TROM_POSITION extends EnumTextResultOrderMode
  /* 2 */ @js.native
  object TROM_POSITION extends TopLevel[TROM_POSITION with Double]
  
  @js.native
  sealed trait TROM_SKIP extends EnumTextResultOrderMode
  /* 0 */ @js.native
  object TROM_SKIP extends TopLevel[TROM_SKIP with Double]
}
