package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.OverflowType.Clip
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.OverflowType.Ellipsis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverflowType extends js.Object

@JSGlobal("ej.datavisualization.Diagram.OverflowType")
@js.native
object OverflowType extends js.Object {
  //Set overflow Type  as Clip
  @js.native
  sealed trait Clip extends OverflowType
  
  //Set overflow Type as ellipsis
  @js.native
  sealed trait Ellipsis extends OverflowType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverflowType with Double] = js.native
  /* 1 */ @js.native
  object Clip extends TopLevel[Clip with Double]
  
  /* 0 */ @js.native
  object Ellipsis extends TopLevel[Ellipsis with Double]
  
}

