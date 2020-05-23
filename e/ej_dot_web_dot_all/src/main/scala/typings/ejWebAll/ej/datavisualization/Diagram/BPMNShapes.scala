package typings.ejWebAll.ej.datavisualization.Diagram

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
  
}

