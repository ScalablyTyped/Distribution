package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTMessageType extends js.Object
/**
  * For query the operation that are supported by the data source on a capability .
  * Application gets these through DG_CONTROL/DAT_CAPABILITY/MSG_QUERYSUPPORT
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_MessageType")
@js.native
object EnumDWTMessageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMessageType with Double] = js.native
  
  @js.native
  sealed trait TWQC_GET extends EnumDWTMessageType
  /* 1 */ @js.native
  object TWQC_GET extends TopLevel[TWQC_GET with Double]
  
  @js.native
  sealed trait TWQC_GETCURRENT extends EnumDWTMessageType
  /* 8 */ @js.native
  object TWQC_GETCURRENT extends TopLevel[TWQC_GETCURRENT with Double]
  
  @js.native
  sealed trait TWQC_GETDEFAULT extends EnumDWTMessageType
  /* 4 */ @js.native
  object TWQC_GETDEFAULT extends TopLevel[TWQC_GETDEFAULT with Double]
  
  @js.native
  sealed trait TWQC_RESET extends EnumDWTMessageType
  /* 16 */ @js.native
  object TWQC_RESET extends TopLevel[TWQC_RESET with Double]
  
  @js.native
  sealed trait TWQC_SET extends EnumDWTMessageType
  /* 2 */ @js.native
  object TWQC_SET extends TopLevel[TWQC_SET with Double]
}
