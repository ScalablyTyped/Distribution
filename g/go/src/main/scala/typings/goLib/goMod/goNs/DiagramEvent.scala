package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DiagramEvent represents a more abstract event than an InputEvent.
  * They are raised on the Diagram class.
  * One can receive such events by registering a DiagramEvent listener on a Diagram
  * by calling Diagram.addDiagramListener.
  * Some DiagramEvents such as "ObjectSingleClicked" are normally
  * associated with InputEvents.
  * Some DiagramEvents such as "SelectionMoved" or "PartRotated" are associated with the
  * results of Tool-handled gestures or CommandHandler actions.
  * Some DiagramEvents are not necessarily associated with any input events at all,
  * such as "ViewportBoundsChanged", which can happen due to programmatic
  * changes to the Diagram.position and Diagram.scale properties.
  */
trait DiagramEvent extends js.Object {
  /**Gets or sets whether any default actions associated with this diagram event should be avoided or cancelled.*/
  var cancel: scala.Boolean
  /**This read-only property returns the diagram associated with the event.*/
  var diagram: Diagram
  /**Gets or sets the name of the kind of diagram event that this represents.*/
  var name: java.lang.String
  /**Gets or sets an optional object that describes the change to the subject of the diagram event.*/
  var parameter: js.Any
  /**Gets or sets an optional object that is the subject of the diagram event.*/
  var subject: js.Any
}

object DiagramEvent {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    diagram: Diagram,
    name: java.lang.String,
    parameter: js.Any,
    subject: js.Any
  ): DiagramEvent = {
    val __obj = js.Dynamic.literal(cancel = cancel, diagram = diagram, name = name, parameter = parameter, subject = subject)
  
    __obj.asInstanceOf[DiagramEvent]
  }
}

