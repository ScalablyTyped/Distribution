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
  
  val Activity: Activity with java.lang.String = js.native
  val DataObject: DataObject with java.lang.String = js.native
  val DataSource: DataSource with java.lang.String = js.native
  val Event: Event with java.lang.String = js.native
  val Gateway: Gateway with java.lang.String = js.native
  val Group: Group with java.lang.String = js.native
  val Message: Message with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs.BPMNShapes with java.lang.String
  ] = js.native
}

