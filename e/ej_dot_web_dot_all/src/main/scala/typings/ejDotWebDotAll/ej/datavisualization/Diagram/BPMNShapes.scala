package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Activity
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.DataObject
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.DataSource
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Event
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Gateway
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Group
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.BPMNShapes.Message
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BPMNShapes with Double] = js.native
  /* 5 */ @js.native
  object Activity extends TopLevel[Activity with Double]
  
  /* 3 */ @js.native
  object DataObject extends TopLevel[DataObject with Double]
  
  /* 4 */ @js.native
  object DataSource extends TopLevel[DataSource with Double]
  
  /* 0 */ @js.native
  object Event extends TopLevel[Event with Double]
  
  /* 1 */ @js.native
  object Gateway extends TopLevel[Gateway with Double]
  
  /* 6 */ @js.native
  object Group extends TopLevel[Group with Double]
  
  /* 2 */ @js.native
  object Message extends TopLevel[Message with Double]
  
}

