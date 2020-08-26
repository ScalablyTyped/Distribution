package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTMessageType extends js.Object

/**
  * For query the operation that are supported by the data source on a capability .
  * Application gets these through DG_CONTROL/DAT_CAPABILITY/MSG_QUERYSUPPORT
  */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_MessageType")
@js.native
object EnumDWTMessageType extends js.Object {
  @js.native
  sealed trait TWQC_GET extends EnumDWTMessageType
  
  @js.native
  sealed trait TWQC_GETCURRENT extends EnumDWTMessageType
  
  @js.native
  sealed trait TWQC_GETDEFAULT extends EnumDWTMessageType
  
  @js.native
  sealed trait TWQC_RESET extends EnumDWTMessageType
  
  @js.native
  sealed trait TWQC_SET extends EnumDWTMessageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTMessageType with Double] = js.native
  /* 1 */ @js.native
  object TWQC_GET extends TopLevel[TWQC_GET with Double]
  
  /* 8 */ @js.native
  object TWQC_GETCURRENT extends TopLevel[TWQC_GETCURRENT with Double]
  
  /* 4 */ @js.native
  object TWQC_GETDEFAULT extends TopLevel[TWQC_GETDEFAULT with Double]
  
  /* 16 */ @js.native
  object TWQC_RESET extends TopLevel[TWQC_RESET with Double]
  
  /* 2 */ @js.native
  object TWQC_SET extends TopLevel[TWQC_SET with Double]
  
}

