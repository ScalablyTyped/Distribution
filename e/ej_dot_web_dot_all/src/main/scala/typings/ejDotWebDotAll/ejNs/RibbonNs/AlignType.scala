package typings.ejDotWebDotAll.ejNs.RibbonNs

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
  sealed trait Columns extends AlignType
  
  ///To align the group content's in row
  @js.native
  sealed trait Rows extends AlignType
  
  /* 1 */ val Columns: typings.ejDotWebDotAll.ejNs.RibbonNs.AlignType.Columns with Double = js.native
  /* 0 */ val Rows: typings.ejDotWebDotAll.ejNs.RibbonNs.AlignType.Rows with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlignType with Double] = js.native
}

