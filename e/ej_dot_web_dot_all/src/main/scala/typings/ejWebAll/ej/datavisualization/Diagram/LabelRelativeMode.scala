package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
