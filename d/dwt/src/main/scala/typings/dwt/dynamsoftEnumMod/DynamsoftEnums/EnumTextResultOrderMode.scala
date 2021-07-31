package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumTextResultOrderMode extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumTextResultOrderMode")
@js.native
object EnumTextResultOrderMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumTextResultOrderMode & Double] = js.native
  
  @js.native
  sealed trait TROM_CONFIDENCE
    extends StObject
       with EnumTextResultOrderMode
  /* 1 */ val TROM_CONFIDENCE: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextResultOrderMode.TROM_CONFIDENCE & Double = js.native
  
  @js.native
  sealed trait TROM_FORMAT
    extends StObject
       with EnumTextResultOrderMode
  /* 4 */ val TROM_FORMAT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextResultOrderMode.TROM_FORMAT & Double = js.native
  
  @js.native
  sealed trait TROM_POSITION
    extends StObject
       with EnumTextResultOrderMode
  /* 2 */ val TROM_POSITION: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextResultOrderMode.TROM_POSITION & Double = js.native
  
  @js.native
  sealed trait TROM_SKIP
    extends StObject
       with EnumTextResultOrderMode
  /* 0 */ val TROM_SKIP: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumTextResultOrderMode.TROM_SKIP & Double = js.native
}
