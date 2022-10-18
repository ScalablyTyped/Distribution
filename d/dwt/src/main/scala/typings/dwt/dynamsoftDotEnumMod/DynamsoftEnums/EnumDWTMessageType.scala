package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: Double): js.UndefOr[EnumDWTMessageType & Double] = js.native
  
  @js.native
  sealed trait TWQC_GET
    extends StObject
       with EnumDWTMessageType
  /* 1 */ val TWQC_GET: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_GET & Double = js.native
  
  @js.native
  sealed trait TWQC_GETCURRENT
    extends StObject
       with EnumDWTMessageType
  /* 8 */ val TWQC_GETCURRENT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_GETCURRENT & Double = js.native
  
  @js.native
  sealed trait TWQC_GETDEFAULT
    extends StObject
       with EnumDWTMessageType
  /* 4 */ val TWQC_GETDEFAULT: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_GETDEFAULT & Double = js.native
  
  @js.native
  sealed trait TWQC_RESET
    extends StObject
       with EnumDWTMessageType
  /* 16 */ val TWQC_RESET: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_RESET & Double = js.native
  
  @js.native
  sealed trait TWQC_SET
    extends StObject
       with EnumDWTMessageType
  /* 2 */ val TWQC_SET: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTMessageType.TWQC_SET & Double = js.native
}
