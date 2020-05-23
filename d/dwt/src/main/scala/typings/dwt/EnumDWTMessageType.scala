package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTMessageType extends js.Object

/** For query the operation that are supported by the data source on a capability .
  *  Application gets these through DG_CONTROL/DAT_CAPABILITY/MSG_QUERYSUPPORT
  */
@JSGlobal("EnumDWT_MessageType")
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
  
}

