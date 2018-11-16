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
  
  val Columns: Columns with java.lang.String = js.native
  val Rows: Rows with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.AlignType with java.lang.String] = js.native
}

