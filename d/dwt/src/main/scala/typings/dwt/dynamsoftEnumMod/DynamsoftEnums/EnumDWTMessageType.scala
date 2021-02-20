package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTMessageType extends StObject
/**
  * For query the operation that are supported by the data source on a capability .
  * Application gets these through DG_CONTROL/DAT_CAPABILITY/MSG_QUERYSUPPORT
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_MessageType")
@js.native
object EnumDWTMessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMessageType with Double] = js.native
  
  @js.native
  sealed trait TWQC_GET extends EnumDWTMessageType
  /* 1 */ val TWQC_GET: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_GET with Double = js.native
  
  @js.native
  sealed trait TWQC_GETCURRENT extends EnumDWTMessageType
  /* 8 */ val TWQC_GETCURRENT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_GETCURRENT with Double = js.native
  
  @js.native
  sealed trait TWQC_GETDEFAULT extends EnumDWTMessageType
  /* 4 */ val TWQC_GETDEFAULT: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_GETDEFAULT with Double = js.native
  
  @js.native
  sealed trait TWQC_RESET extends EnumDWTMessageType
  /* 16 */ val TWQC_RESET: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_RESET with Double = js.native
  
  @js.native
  sealed trait TWQC_SET extends EnumDWTMessageType
  /* 2 */ val TWQC_SET: typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_SET with Double = js.native
}
