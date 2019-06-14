package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BPMNShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.BPMNShapes")
@js.native
object BPMNShapes extends js.Object {
  //Used to specify node Shape as Activity
  @js.native
  sealed trait Activity
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes
  
  //Used to specify node Shape as DataObject
  @js.native
  sealed trait DataObject
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes
  
  //Used to specify node Shape as DataSource
  @js.native
  sealed trait DataSource
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes
  
  //Used to specify node Shape as Event
  @js.native
  sealed trait Event
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes
  
  //Used to specify node Shape as Gateway
  @js.native
  sealed trait Gateway
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes
  
  //Used to specify node Shape as Group
  @js.native
  sealed trait Group
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes
  
  //Used to specify node Shape as Message
  @js.native
  sealed trait Message
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes
  
  /* 5 */ val Activity: Activity with scala.Double = js.native
  /* 3 */ val DataObject: DataObject with scala.Double = js.native
  /* 4 */ val DataSource: DataSource with scala.Double = js.native
  /* 0 */ val Event: Event with scala.Double = js.native
  /* 1 */ val Gateway: Gateway with scala.Double = js.native
  /* 6 */ val Group: Group with scala.Double = js.native
  /* 2 */ val Message: Message with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes with scala.Double
  ] = js.native
}

