package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubDocumentType extends js.Object

@JSGlobal("SubDocumentType")
@js.native
object SubDocumentType extends js.Object {
  @js.native
  sealed trait Footer
    extends devexpressDashWebLib.SubDocumentType
  
  @js.native
  sealed trait Header
    extends devexpressDashWebLib.SubDocumentType
  
  @js.native
  sealed trait Main
    extends devexpressDashWebLib.SubDocumentType
  
  @js.native
  sealed trait TextBox
    extends devexpressDashWebLib.SubDocumentType
  
  /* 2 */ val Footer: Footer with scala.Double = js.native
  /* 1 */ val Header: Header with scala.Double = js.native
  /* 0 */ val Main: Main with scala.Double = js.native
  /* 3 */ val TextBox: TextBox with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.SubDocumentType with scala.Double] = js.native
}

