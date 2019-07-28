package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubDocumentType extends js.Object

@JSGlobal("SubDocumentType")
@js.native
object SubDocumentType extends js.Object {
  @js.native
  sealed trait Footer extends SubDocumentType
  
  @js.native
  sealed trait Header extends SubDocumentType
  
  @js.native
  sealed trait Main extends SubDocumentType
  
  @js.native
  sealed trait TextBox extends SubDocumentType
  
  /* 2 */ val Footer: typings.devexpressDashWeb.SubDocumentType.Footer with Double = js.native
  /* 1 */ val Header: typings.devexpressDashWeb.SubDocumentType.Header with Double = js.native
  /* 0 */ val Main: typings.devexpressDashWeb.SubDocumentType.Main with Double = js.native
  /* 3 */ val TextBox: typings.devexpressDashWeb.SubDocumentType.TextBox with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SubDocumentType with Double] = js.native
}

