package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlignType extends js.Object

@JSGlobal("ej.Ribbon.AlignType")
@js.native
object AlignType extends js.Object {
  ///To align group content's in columns
  @js.native
  sealed trait Columns
    extends ejDotWebDotAllLib.ejNs.RibbonNs.AlignType
  
  ///To align the group content's in row
  @js.native
  sealed trait Rows
    extends ejDotWebDotAllLib.ejNs.RibbonNs.AlignType
  
  /* 1 */ val Columns: Columns with scala.Double = js.native
  /* 0 */ val Rows: Rows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.AlignType with scala.Double] = js.native
}

