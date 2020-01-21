package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelRelativeMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.LabelRelativeMode")
@js.native
object LabelRelativeMode extends js.Object {
  //Sets the relativeMode as SegmentBounds
  @js.native
  sealed trait SegmentBounds extends LabelRelativeMode
  
  //Sets the relativeMode as SegmentPath
  @js.native
  sealed trait SegmentPath extends LabelRelativeMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelRelativeMode with Double] = js.native
  /* 1 */ @js.native
  object SegmentBounds extends TopLevel[SegmentBounds with Double]
  
  /* 0 */ @js.native
  object SegmentPath extends TopLevel[SegmentPath with Double]
  
}

