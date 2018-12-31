package typings
package dwtLib

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
  sealed trait TWQC_GET
    extends dwtLib.EnumDWT_MessageType
  
  @js.native
  sealed trait TWQC_GETCURRENT
    extends dwtLib.EnumDWT_MessageType
  
  @js.native
  sealed trait TWQC_GETDEFAULT
    extends dwtLib.EnumDWT_MessageType
  
  @js.native
  sealed trait TWQC_RESET
    extends dwtLib.EnumDWT_MessageType
  
  @js.native
  sealed trait TWQC_SET
    extends dwtLib.EnumDWT_MessageType
  
  /* 1 */ val TWQC_GET: TWQC_GET with scala.Double = js.native
  /* 8 */ val TWQC_GETCURRENT: TWQC_GETCURRENT with scala.Double = js.native
  /* 4 */ val TWQC_GETDEFAULT: TWQC_GETDEFAULT with scala.Double = js.native
  /* 16 */ val TWQC_RESET: TWQC_RESET with scala.Double = js.native
  /* 2 */ val TWQC_SET: TWQC_SET with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_MessageType with scala.Double] = js.native
}

