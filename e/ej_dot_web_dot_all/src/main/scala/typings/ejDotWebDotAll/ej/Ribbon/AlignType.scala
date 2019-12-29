package typings.ejDotWebDotAll.ej.Ribbon

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlignType with Double] = js.native
  /* 1 */ @js.native
  object Columns extends TopLevel[Columns with Double]
  
  /* 0 */ @js.native
  object Rows extends TopLevel[Rows with Double]
  
}

