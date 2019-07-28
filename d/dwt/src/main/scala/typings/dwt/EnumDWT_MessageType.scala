package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_MessageType extends js.Object

/** For query the operation that are supported by the data source on a capability .
  *  Application gets these through DG_CONTROL/DAT_CAPABILITY/MSG_QUERYSUPPORT
  */
@JSGlobal("EnumDWT_MessageType")
@js.native
object EnumDWT_MessageType extends js.Object {
  @js.native
  sealed trait TWQC_GET extends EnumDWT_MessageType
  
  @js.native
  sealed trait TWQC_GETCURRENT extends EnumDWT_MessageType
  
  @js.native
  sealed trait TWQC_GETDEFAULT extends EnumDWT_MessageType
  
  @js.native
  sealed trait TWQC_RESET extends EnumDWT_MessageType
  
  @js.native
  sealed trait TWQC_SET extends EnumDWT_MessageType
  
  /* 1 */ val TWQC_GET: typings.dwt.EnumDWT_MessageType.TWQC_GET with Double = js.native
  /* 8 */ val TWQC_GETCURRENT: typings.dwt.EnumDWT_MessageType.TWQC_GETCURRENT with Double = js.native
  /* 4 */ val TWQC_GETDEFAULT: typings.dwt.EnumDWT_MessageType.TWQC_GETDEFAULT with Double = js.native
  /* 16 */ val TWQC_RESET: typings.dwt.EnumDWT_MessageType.TWQC_RESET with Double = js.native
  /* 2 */ val TWQC_SET: typings.dwt.EnumDWT_MessageType.TWQC_SET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_MessageType with Double] = js.native
}

