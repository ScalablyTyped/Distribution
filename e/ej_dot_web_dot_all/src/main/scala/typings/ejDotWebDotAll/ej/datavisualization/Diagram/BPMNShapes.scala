package typings.ejDotWebDotAll.ej.datavisualization.Diagram

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
  sealed trait Activity extends BPMNShapes
  
  //Used to specify node Shape as DataObject
  @js.native
  sealed trait DataObject extends BPMNShapes
  
  //Used to specify node Shape as DataSource
  @js.native
  sealed trait DataSource extends BPMNShapes
  
  //Used to specify node Shape as Event
  @js.native
  sealed trait Event extends BPMNShapes
  
  //Used to specify node Shape as Gateway
  @js.native
  sealed trait Gateway extends BPMNShapes
  
  //Used to specify node Shape as Group
  @js.native
  sealed trait Group extends BPMNShapes
  
  //Used to specify node Shape as Message
  @js.native
  sealed trait Message extends BPMNShapes
  
  /* 5 */ val Activity: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Activity with Double = js.native
  /* 3 */ val DataObject: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.DataObject with Double = js.native
  /* 4 */ val DataSource: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.DataSource with Double = js.native
  /* 0 */ val Event: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Event with Double = js.native
  /* 1 */ val Gateway: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Gateway with Double = js.native
  /* 6 */ val Group: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Group with Double = js.native
  /* 2 */ val Message: typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Message with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNShapes with Double] = js.native
}

