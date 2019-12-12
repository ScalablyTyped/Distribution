package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_MessageType.TWQC_GET
import typings.dwt.EnumDWT_MessageType.TWQC_GETCURRENT
import typings.dwt.EnumDWT_MessageType.TWQC_GETDEFAULT
import typings.dwt.EnumDWT_MessageType.TWQC_RESET
import typings.dwt.EnumDWT_MessageType.TWQC_SET
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_MessageType with Double] = js.native
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

